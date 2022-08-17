package com.spring.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.spring.bean.scope.PersonDAO;

//@SpringBootApplication
@ComponentScan
public class ComponentScanApplication {


	private static Logger LOGGER = 
			LoggerFactory.getLogger(ComponentScanApplication.class);

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = 
				SpringApplication.run(ComponentScanApplication.class, args);
		
		
		PersonDAO componentDao = 
				applicationContext.getBean(PersonDAO.class);
		
		LOGGER.info("{}",componentDao);
		System.out.println("this is ComponentScanApplication ");
	}

}
