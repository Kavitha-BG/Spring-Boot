package com.example.spring;

import org.springframework.stereotype.Component;

@Component("engine")
public class RocketEngine implements Engine{

	@Override
	public String getEngineDetails() {
		return "Rocket engine gives good performance";
	}	
}
