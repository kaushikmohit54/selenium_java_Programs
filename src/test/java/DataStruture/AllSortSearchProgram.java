package DataStruture;

import java.util.Arrays;

public class AllSortSearchProgram {

	public static void main(String[] args) {

		bubbleSort();
		InsertionSort();
		selectionSort();
		binarySearch();
		lenearSearch();

	}

	static void bubbleSort() {
		/*
		 * Bubble Sort in Java In bubble sort algorithm, array is traversed from first
		 * element to last element. Here, current element is compared with the next
		 * element. If current element is greater than the next element, it is swapped.
		 */

		int[] a = { 36, 19, 29, 12, 5 };

		int temp;
		for (int i = 0; i < a.length; i++) {
			int flag = 0;
			for (int j = 0; j < a.length - 1 - i; j++) {
				
				if (a[j] > a[j + 1]) {

					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
			}
		}
		System.out.println("after bubble sort elements are : ");
		for (int l = 0; l < a.length; l++) {

			System.out.println(a[l]);
		}
	}

	static void InsertionSort() {
		/*
		 * Insertion is good for small elements only because it requires more time for
		 * sorting large number of elements. Insertion sort is a simple sorting
		 * algorithm that works the way we sort playing cards in our hands
		 */
		/*
		 * Insertion sort is a simple sorting algorithm that works the way we sort
		 * playing cards in our hands.We choose one card and insert it in its
		 * position(ascending and descending).
		 */

		int[] a = { 5, 1, 6, 2, 4, 3 };
		int temp, j = 0;
		for (int i = 1; i < a.length; i++) {
			
			temp = a[i];
			j = i;
			while (j > 0 && a[j - 1] > temp) {
				a[j] = a[j - 1];
				j = j - 1;
			}
			a[j] = temp;
		}
		System.out.println("after insertion sort elements are : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	static void selectionSort() {
		/*
		 * the selection sort is a combination of searching and sorting. It sorts an
		 * array repeatedly finding the minimum element(considering ascending order)
		 * from unsorted part and putting it at the beginning.In every iteration of
		 * selection sort, the minimum element(considering ascending order) from the
		 * unsorted subarray is picked and moved to the sorted subarray.
		 */

		int[] a = { 38, 52, 9, 18, 6, 62, 13 };
		int min, temp = 0;

		for (int i = 0; i < a.length; i++) {
			min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		System.out.println("after selection sort elements are : ");

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}

	}

	static void binarySearch() {
		/*
		 * Although Binary search is a very optimized way of searching a particular
		 * element but the Array must be sorted on which you want to perform the search
		 * process. If the Array is not sorted in advance then we have to perform
		 * sorting first and then only we can perform binary search on that. In case of
		 * binary search, array elements must be in ascending order. If you have
		 * unsorted array, you can sort the array using Arrays.sort(arr) method. It's
		 * time complexity of O(log n) makes it very fast as compared to other sorting
		 * 
		 * ⇒ Working of Binary Searching :-
		 * 
		 * 
		 * Start with the middle element If the target value is equal to the middle
		 * element of the array, then return the index of the middle element. f not,
		 * then compare the middle element with the target value Binary Search If the
		 * target value is greater than the number in the middle index, then pick the
		 * elements to the right of the middle index, and start with Step 1
		 */ int[] a = { 2, 5, 7, 9, 12, 14, 16, 17, 19, 20, 24, 28 };
		int srch = 16;
		int li = 0;
		int hi = a.length - 1;
		int mi = (li + hi) / 2;
		while (li <= hi) {
			if (a[mi] == srch) {
				System.out.println("element is at by using binary search " + mi + " index position");
				break;
			} else if (a[mi] < srch) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
		if (li > hi) {
			System.out.println("element not found");
		}

	}

	/*
	 * Linear search is a very simple search algorithm. In this type of search, a
	 * sequential search is made over all items by one.Every item is checked and if
	 * a match is found then that particular item is returned, otherwise this search
	 * continues till the end of data.
	 */

	static void lenearSearch() {
		int[] a = { 5, 3, 6, 1, 4, 2 };
		int item = 3;
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == item) {
				System.out.println("item by lenear earch is present at " + i + " index position");
				temp = temp + 1;
			}
		}
		if (temp == 0) {
			System.out.println("item not found is list");
		}

	}

}
