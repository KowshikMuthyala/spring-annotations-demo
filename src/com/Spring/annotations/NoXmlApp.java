package com.Spring.annotations;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.Spring.annotations")
@PropertySource("classpath:sport.properties")
public class NoXmlApp {
	@Bean
	public Fortuneservice sadFortuneService() {
		 return new SadFortuneService();
	}
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
}
