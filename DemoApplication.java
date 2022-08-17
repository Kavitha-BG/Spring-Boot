package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
//		System.out.println("First Spring Boot Application");
		
		ApplicationContext applicationContextfile = 
				new ClassPathXmlApplicationContext("applicationContextFile.xml");
				
		
		Bike bike =(Bike)applicationContextfile.getBean("bike");
		
		System.out.println("The Bike brand is : "+ bike.getBrand());
	}

}
