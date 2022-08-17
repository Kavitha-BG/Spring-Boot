package com.spring.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.xml.XmlPersonDAO;


@Configuration
@ComponentScan
public class XMLContextApplication {
	
	private static Logger LOGGER = 
			LoggerFactory.getLogger(XMLContextApplication.class);

	public static void main(String[] args) {
		
		try(ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml")) {
		
			LOGGER.info("Beans Loaded -> {}",
			(Object)applicationContext.getBeanDefinitionNames());
			//[xmlJdbcConnection, xmlPersonDAO]
			
			
			XmlPersonDAO personDao = 
				applicationContext.getBean(XmlPersonDAO.class);
				
		System.out.println(personDao);
		System.out.println(personDao.getXmlJdbcConnection());
		}
	}

}
