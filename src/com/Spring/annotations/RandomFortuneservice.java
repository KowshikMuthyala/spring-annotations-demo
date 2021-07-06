package com.Spring.annotations;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component
public class RandomFortuneservice implements Fortuneservice {

	private String [] data= {
			"Ammu",
			"Kowshik",
			"Thanvika",
			"Joshika"
	};
	
	private Random random= new Random();
	
	@Override
	public String getFortune() {
	 int index = random.nextInt(data.length);
	 
	 String theFortune = data[index];
	 
	 return theFortune;
	 
	}

}
