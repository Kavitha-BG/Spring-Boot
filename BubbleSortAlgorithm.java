package com.spring.examples;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm{

	public int[] sort(int[] numbers) {

		return numbers;
	}

//	@Override
//	public int[] sort(int[] numbers, int numberToSearch) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	
}
