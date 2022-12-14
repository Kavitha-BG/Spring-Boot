package com.spring.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//import com.example.demo.BinarySearchImpl;
//import com.example.demo.MyApplication;
@SpringBootApplication
public class MyApplication {

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		
		//Application context
		ApplicationContext applicationContext = 
				SpringApplication.run(MyApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		
		
		int result = binarySearch.binarySearch(new int[] { 12,4,6 }, 3);
		
		
		System.out.println(result);
	}

}
