package com.Spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements Fortuneservice {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today is a Sad Day";
	}

}
