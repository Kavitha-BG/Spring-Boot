package com.spring.bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.bean.basic.BinarySearchImpl;

//import com.example.demo.BinarySearchImpl;
//import com.example.demo.MyApplication;
@SpringBootApplication
public class BasicApplication {

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		
		//Application context
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
