package com.in28minutes.spring.SpringBasics.basic;

//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
	
	//private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;
	
		
//	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//		super();
//		this.sortAlgorithm = sortAlgorithm;
//	}



	public int binarySearch(int[] numbers,int numberToSearchFor) {
		//Implement Logic
		
		// Lets assume that this uses BubbleSortAlgorithm
		//BubbleSortAlgorithm algorithm = new BubbleSortAlgorithm();
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		//Search the array
		return 3;
	}
	
//	@PostConstruct
//	public void postConstruct() {
//		LOGGER.info("Post construct method!");		
//	}
//	
//	@PreDestroy
//	public void preDestroy() {
//		LOGGER.info("Pre Destroy method!");		
//	}

}
