package com.Spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements Fortuneservice{

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Welcome back!";
	}

}
