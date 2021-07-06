package com.Spring.annotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneservice")
	private Fortuneservice fortuneservice;
	
	public TrackCoach() {
		System.out.println("Inside default constructor");
	}
	/*
	@PostConstruct
	public void doMoreStuff() {
		System.out.println("TraackCoach>>-->Inside PostConstruct");
	}
	
	
	public void cleanUpCode() {
		System.out.println("TrackCoach >>-->Inside Predestroy");
	}
	*/
	
	/*
	public void setFortuneservice(Fortuneservice fortuneservice) {
		this.fortuneservice = fortuneservice;
	}


	
	@Autowired
	public TrackCoach(Fortuneservice fortuneservice) {
		super();
		this.fortuneservice = fortuneservice;
	}
	*/
	@Override
	public String Dailyworkout() {
	
		return "Work hard, untill you learn something";
	}

	@Override
	public String DailyFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortune();
	}

}
