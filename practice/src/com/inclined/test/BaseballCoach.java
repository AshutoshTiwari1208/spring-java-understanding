package com.inclined.test;

public class BaseballCoach implements Coach{
	
	HappyFortune happyFortune;
	
	public BaseballCoach(HappyFortune happyFortune) {
		super();
		this.happyFortune = happyFortune;
	}

	@Override
	public String training() {
		return "Baseball training is going to happen";
	}

	@Override
	public String generateMyFortune() {
		return "Baseball Day :" + this.happyFortune.generateFortune();
	}
	
	

}
