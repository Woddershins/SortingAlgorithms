package edu.cmich.cps181.assignments.searchsort;

public class Searching {
	public static int linearSearch(int numbers[], int key) {
		int i = 0;
		for (i = 0; i < numbers.length; ++i) {
			if (numbers[i] == key) {
				return i; /* position */
			}
		}
		return -1; /* not found */
	}

	public static int binarySearch(int numbers[], int key) {
		int mid = 0;
		int low = 0;
		int high = 0;

		high = numbers.length - 1;

		while (high >= low) {
			mid = (high + low) / 2;
			if (numbers[mid] < key) {
				low = mid + 1;
			} else if (numbers[mid] > key) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1; // not found
	}
}
