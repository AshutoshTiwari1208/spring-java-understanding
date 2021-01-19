package com.inclined.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {
		//Making container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("myHockey", Coach.class);
		System.out.println(coach.training());
		
		// Fortune Service dependency helps to generate fortune
		System.out.println(coach.generateMyFortune());
		context.close();
	}
}
