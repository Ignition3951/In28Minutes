package com.in28minutes.spring.SpringBasics;

public class BinarySearchImpl {
	
	private SortAlgorithm sortAlgorithm;
	
		
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}



	public int binarySearch(int[] numbers,int numberToSearchFor) {
		//Implement Logic
		
		// Lets assume that this uses BubbleSortAlgorithm
		//BubbleSortAlgorithm algorithm = new BubbleSortAlgorithm();
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		//Search the array
		return 3;
	}

}
