package com.example.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp8 {

	public static void main(String[] args) {
		
//				Load application context
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationApplicationContext.xml");
				
//				Get the bean
				Car car = context.getBean("audi",Car.class);
				
//				Call getCarDetails method()
				System.out.println(car);
				
//				close context object;
				context.close();	
		
	}

}
