package com.spring.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.spring.bean.scope.PersonDAO;

//@SpringBootApplication
@ComponentScan
public class ScopeApplication {


	private static Logger LOGGER = 
			LoggerFactory.getLogger(ScopeApplication.class);

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		
		//Application context
		ApplicationContext applicationContext = 
				SpringApplication.run(ScopeApplication.class, args);
		
		
		PersonDAO personDao = 
				applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO2 = 
				applicationContext.getBean(PersonDAO.class);
		
		LOGGER.info("{}",personDao);
		LOGGER.info("{}",personDao.getJdbcConnection());
		
		LOGGER.info("{}",personDAO2);
		LOGGER.info("{}",personDAO2.getJdbcConnection());
		
		
	}

}
