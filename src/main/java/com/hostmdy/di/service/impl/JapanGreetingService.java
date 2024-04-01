package com.hostmdy.di.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.hostmdy.di.service.GreetingService;

@Service("i18nGreetingBean")
@Profile("JP")
public class JapanGreetingService implements GreetingService {

	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return "Konichiwa";
	}

}
