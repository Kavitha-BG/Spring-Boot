package com.spring.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.spring.bean.scope.SomeCdiBusiness;

@SpringBootApplication
@ComponentScan("com.spring.bean")
public class ComponentScanApplication {


	private static Logger LOGGER = 
			LoggerFactory.getLogger(ComponentScanApplication.class);

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = 
				SpringApplication.run(ComponentScanApplication.class, args);
		
		
		SomeCdiBusiness componentDao = 
				applicationContext.getBean(SomeCdiBusiness.class);
		
		LOGGER.info("{}",componentDao);
		
	}

}
