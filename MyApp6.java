package com.example.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp6 {

	//private static ClassPathXmlApplicationContext classPathXmlApplicationContext;

	public static void main(String[] args) {
//		Load application context
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		Get the bean
		Car car = (Car)context.getBean("audi");
		
		
//		Call getCarDetails method()
		System.out.println(car);
		
//		close context object;
		context.close();
	}

}
