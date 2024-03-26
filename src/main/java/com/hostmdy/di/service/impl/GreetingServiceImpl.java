package com.hostmdy.di.service.impl;

import org.springframework.stereotype.Service;

import com.hostmdy.di.service.GreetingService;

@Service
public class GreetingServiceImpl implements GreetingService {

	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return "Hello DI";
	}
}
