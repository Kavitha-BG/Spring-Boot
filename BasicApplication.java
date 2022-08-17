package com.spring.bean;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.bean.basic.BinarySearchImpl;


@Configuration
@ComponentScan
public class BasicApplication {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = 
				SpringApplication.run(BasicApplication.class, args);
		
		
		BinarySearchImpl binarySearch = 
				applicationContext.getBean(BinarySearchImpl.class);
		
		BinarySearchImpl binarySearch1 = 
				applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		
		int result = binarySearch.binarySearch(new int[] { 12,4,6 }, 3);
		
		
		System.out.println(result);
	}

}
