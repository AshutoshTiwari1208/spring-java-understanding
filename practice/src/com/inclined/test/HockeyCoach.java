package com.inclined.test;

public class HockeyCoach implements Coach {
	
	private Fortune fortune;
	
	public void setFortune(Fortune fortune) {
		System.out.println("Fortune set ho ra ha !");
		this.fortune = fortune;
	}

	@Override
	public String training() {
		return "Hockey training is going on";
	}

	@Override
	public String generateMyFortune() {
		return this.fortune.generateFortune();
	}

}
