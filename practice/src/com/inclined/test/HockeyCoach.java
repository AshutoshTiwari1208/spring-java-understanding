package com.inclined.test;

public class HockeyCoach implements Coach {
	
	private Fortune fortune;
	
	private String email;
	private String name;
	
	public void setEmail(String email) {
		this.email = email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFortune(Fortune fortune) {
		System.out.println("Fortune set ho ra ha !");
		this.fortune = fortune;
	}

	@Override
	public String training() {
		return "Hockey training is going on: Things set are " + this.email + this.name;
	}

	@Override
	public String generateMyFortune() {
		return this.fortune.generateFortune();
	}

}
