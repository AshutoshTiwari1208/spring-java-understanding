package com.inclined.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextBeanScope.xml");
		Coach coach = context.getBean("myCoach", Coach.class);
		System.out.println("Coach is 1 : "+ coach);
		Coach coach2 = context.getBean("myCoach", Coach.class);
		System.out.println("Coach is 2 : "+ coach2);
		
		
	}

}
