package com.example.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp2 {

	private static ClassPathXmlApplicationContext classPathXmlApplicationContext;

	public static void main(String[] args) {
//		Load application context
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		Get the bean
		Car car = (Car)context.getBean("bmw");
		
//		Call getCarDetails method()
		System.out.println(car.getCarDetails());
		
//		close context object;
		context.close();
	}

}
