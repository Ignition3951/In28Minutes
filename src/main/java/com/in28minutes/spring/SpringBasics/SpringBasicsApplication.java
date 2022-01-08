package com.in28minutes.spring.SpringBasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBasicsApplication {

	public static void main(String[] args) {
		BinarySearchImpl binarySearchImpl = new BinarySearchImpl(
				new QuickSortAlgorithm());
		int result = binarySearchImpl.binarySearch(new int[] {1,2,3,4},3);
		
		System.out.println(result);
		//SpringApplication.run(SpringBasicsApplication.class, args);
	}

}
