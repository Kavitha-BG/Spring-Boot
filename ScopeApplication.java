package com.spring.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.bean.scope.SomeCdiBusiness;

//import com.example.demo.BinarySearchImpl;
//import com.example.demo.MyApplication;
@SpringBootApplication
public class ScopeApplication {


	private static Logger LOGGER = 
			LoggerFactory.getLogger(ScopeApplication.class);

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		
		//Application context
		ApplicationContext applicationContext = 
				SpringApplication.run(ScopeApplication.class, args);
		
		
		SomeCdiBusiness personDao = 
				applicationContext.getBean(SomeCdiBusiness.class);
		SomeCdiBusiness personDAO2 = 
				applicationContext.getBean(SomeCdiBusiness.class);
		
		LOGGER.info("{}",personDao);
		LOGGER.info("{}",personDao.getJdbcConnection());
		
		LOGGER.info("{}",personDAO2);
		LOGGER.info("{}",personDAO2.getJdbcConnection());
		
		
	}

}
