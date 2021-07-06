package com.Spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainJob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context= 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach thecoach = context.getBean("trackCoach", Coach.class);
		
		System.out.println(thecoach.Dailyworkout());
		
		System.out.println(thecoach.DailyFortune());
		
		context.close();
	}

}
