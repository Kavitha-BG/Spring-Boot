package com.example.spring;

import org.springframework.stereotype.Component;

@Component("bmw")
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
