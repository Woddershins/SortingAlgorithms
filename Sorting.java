package edu.cmich.cps181.assignments.searchsort;

public class Sorting {
	public static void selectionSort(int[] numbers) {
	      int i = 0;
	      int j = 0;
	      int indexSmallest = 0;
	      int temp = 0;  // Temporary variable for swap

	      for (i = 0; i < numbers.length; ++i) {

	         // Find index of smallest remaining element
	         indexSmallest = i;
	         for (j = i + 1; j < numbers.length; ++j) {

	            if (numbers[j] < numbers[indexSmallest]) {
	               indexSmallest = j;
	            }
	         }

	         // Swap numbers[i] and numbers[indexSmallest]
	         temp = numbers[i];
	         numbers[i] = numbers[indexSmallest];
	         numbers[indexSmallest] = temp;
	      }
	   }
	   
	   public static void insertionSort(int[] numbers) {
	      int i = 0;
	      int j = 0;
	      int temp = 0;  // Temporary variable for swap

	      for (i = 1; i < numbers.length; ++i) {
	         j = i;
	         // Insert numbers[i] into sorted part 
	         // stopping once numbers[i] in correct position
	         while (j > 0 && numbers[j] < numbers[j - 1]) {

	            // Swap numbers[j] and numbers[j - 1]
	            temp = numbers[j];
	            numbers[j] = numbers[j - 1];
	            numbers[j - 1] = temp;
	            --j;
	         }
	      }
	   }
	
	public static void mergeSort(int[] numbers) {
		MergeSort.mergesort(numbers, 0, numbers.length - 1);
	}
	
	
	public static void quickSort(int[] numbers) {
		QuickSort.quicksort(numbers, 0, numbers.length - 1);
	}
	
	
}
