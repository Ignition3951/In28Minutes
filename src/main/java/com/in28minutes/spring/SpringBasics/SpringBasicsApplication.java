package com.in28minutes.spring.SpringBasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasicsApplication {
	
	//What are the beans to be managed-->@Component
	//What are the dependencies of the bean? --> @Autowired
	//Where to search for them--> @SpringBootApplication runs the scan in the current 
	//package and the sub-packages also

	public static void main(String[] args) {
//		BinarySearchImpl binarySearchImpl = new BinarySearchImpl(
//				new QuickSortAlgorithm());
ApplicationContext applicationContext = SpringApplication.run(SpringBasicsApplication.class, args);
		
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearchImpl.binarySearch(new int[] {1,2,3,4},3);
		
		System.out.println(result);
		
	}

}
