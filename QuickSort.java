package edu.cmich.cps181.assignments.searchsort;

public class QuickSort {
	public static int partition(int numbers[], int i, int k) {
		int l = 0;
		int h = 0;
		int midpoint = 0;
		int pivot = 0;
		int temp = 0;
		boolean done = false;

		/* Pick middle element as pivot */
		midpoint = i + (k - i) / 2;
		pivot = numbers[midpoint];

		l = i;
		h = k;

		while (!done) {

			/* Increment l while numbers[l] < pivot */
			while (numbers[l] < pivot) {
				++l;
			}

			/* Decrement h while pivot < numbers[h] */
			while (pivot < numbers[h]) {
				--h;
			}

			/*
			 * If there are zero or one items remaining, all numbers are partitioned. Return
			 * h
			 */
			if (l >= h) {
				done = true;
			} else {
				/*
				 * Swap numbers[l] and numbers[h], update l and h
				 */
				temp = numbers[l];
				numbers[l] = numbers[h];
				numbers[h] = temp;

				++l;
				--h;
			}
		}
		return h;
	}

	public static void quicksort(int numbers[], int i, int k) {
		int j = 0;

		/*
		 * Base case: If there are 1 or zero entries to sort, partition is already
		 * sorted
		 */
		if (i >= k) {
			return;
		}

		/*
		 * Partition the data within the array. Value j returned from partitioning is
		 * location of last item in low partition.
		 */
		j = partition(numbers, i, k);

		/*
		 * Recursively sort low partition (i to j) and high partition (j + 1 to k)
		 */
		quicksort(numbers, i, j);
		quicksort(numbers, j + 1, k);

		return;
	}

}
