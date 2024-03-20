package com.hostmdy.di.controller;

import org.springframework.stereotype.Controller;

import com.hostmdy.di.service.GreetingService;

public class GreetingController {
	private final GreetingService greatingService;

	public GreetingController(GreetingService greatingService) {
		super();
		this.greatingService = greatingService;
	}
	
	public String sayHello() {
		return greatingService.greet();
	}
}
