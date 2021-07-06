package com.Spring.annotations;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	
	private Fortuneservice sadFortune;
	
	@Value("${foo.email}")
	private String Email;
	
	@Value("${foo.team}") 
	private String Team;
	
	public String getEmail() {
		return Email;
	}

	public String getTeam() {
		return Team;
	}

	public SwimCoach(Fortuneservice theFortuneService) {
		// TODO Auto-generated constructor stub
		sadFortune = theFortuneService;
	}


	@Override
	public String Dailyworkout() {
		// TODO Auto-generated method stub
		return "Start your Daily Workout";
	}

	@Override
	public String DailyFortune() {
		// TODO Auto-generated method stub
		return sadFortune.getFortune();
	}

}
