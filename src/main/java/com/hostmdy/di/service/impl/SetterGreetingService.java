package com.hostmdy.di.service.impl;

import org.springframework.stereotype.Service;

import com.hostmdy.di.service.GreetingService;

@Service
public class SetterGreetingService implements GreetingService{

	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return "Hello Setter Injection...";
	}

}
