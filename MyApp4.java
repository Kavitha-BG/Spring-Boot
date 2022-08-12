package com.example.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp4 {

	//private static ClassPathXmlApplicationContext classPathXmlApplicationContext;

	public static void main(String[] args) {
//		Load application context
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		Get the bean
		Audi car = (Audi)context.getBean("audi");
		
		
//		Call getCarDetails method()
		System.out.println(car.getCarDetails());
		System.out.println(car.getEngineDetails());
		System.out.println(car.getColor());
		System.out.println(car.getPrice());
		
//		close context object;
		context.close();
	}

}
