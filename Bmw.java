package com.example.spring;

public class Bmw implements Car {

	private RocketEngine rocketEngine;
	
	//parameterized construction
	public Bmw(RocketEngine rocketEngine) {
		super();
		this.rocketEngine = rocketEngine;
	}
	
	@Override
	public String getCarDetails() {
		return "BMW";
	}

	@Override
	public String getEngineDetails() {
		return rocketEngine.getEngineDetails();
	}
	

}
