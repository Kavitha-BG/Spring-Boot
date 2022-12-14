package com.spring.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.spring.bean.properties.SomeExternalService;


@Configuration
@ComponentScan
//app.properties
@PropertySource("classpath:app.properties")
public class PropertiesApplication {

	public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext (
				PropertiesApplication.class)) {
		
		
			SomeExternalService service = 
				applicationContext.getBean(SomeExternalService.class);
		
			//System.out.println(service);
			System.out.println(service.returnServiceURL());
		}
	}

}
