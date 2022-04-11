package edu.cmich.cps181.assignments.searchsort;

import java.util.Random;

public class Main {
	static Random randomGenerator = new Random();
	static int ITEMS = 1000;
	public static void main(String[] args) {
		int[] randomNumbers = new int[ITEMS];
		for (int i=0; i<randomNumbers.length; i++) {
			randomNumbers[i] = randomGenerator.nextInt(9999);
		}
		
		int[] numbers = randomNumbers;		
		int result = Searching.linearSearch(numbers, 5);
		System.out.println(result);
	}

}
