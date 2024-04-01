package com.hostmdy.di.controller;

import org.springframework.stereotype.Controller;

import com.hostmdy.di.service.GreetingService;

@Controller
public class i18nGreetingController {
	private final GreetingService greetingService;

	public i18nGreetingController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.greet();
	}
}
