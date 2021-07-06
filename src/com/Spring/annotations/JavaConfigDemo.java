package com.Spring.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaConfigDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context= 
				new AnnotationConfigApplicationContext(NoXmlApp.class);
		
		SwimCoach thecoach = context.getBean("swimCoach", SwimCoach.class);
		
		System.out.println(thecoach.Dailyworkout());
		
		System.out.println(thecoach.DailyFortune());
		
		System.out.println("email :" +thecoach.getEmail());
		
		System.out.println("Team :" +thecoach.getTeam());
		
		context.close();
	}

}
