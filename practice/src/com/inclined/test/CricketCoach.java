package com.inclined.test;

public class CricketCoach implements Coach {
	
	Fortune fortuneGenerator;
	
	public CricketCoach(Fortune fortuneGenerator) {
		super();
		this.fortuneGenerator = fortuneGenerator;
	}

	@Override
	public String training() {
		return "Cricket Training is going on!";
	}

	@Override
	public String generateMyFortune() {
		return this.fortuneGenerator.generateFortune();
	}

}
