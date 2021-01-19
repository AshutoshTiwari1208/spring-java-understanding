package com.inclined.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleTestApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextLifecycleTest.xml");
		//Here onInit is called after that .getBean() here is called.
		Coach coach = context.getBean("myCoach", Coach.class);
		
		//Context is closed before that onDestroy() hook is called for Beans
		context.close();
		
		
	}

}
