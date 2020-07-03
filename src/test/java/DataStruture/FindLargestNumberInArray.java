package DataStruture;

import java.util.Arrays;

public class FindLargestNumberInArray {

	public static void main(String[] args) {
		int arr[]= {5,7,9,2};
		largeArray(arr);
		minArray(arr);

	}
	public static void largeArray(int[] arr) {
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				max=arr[i];
				
			}
			
		}
		System.out.println("Given Array is ::: " +Arrays.toString(arr));
		System.out.println("Largest array in these element is : "+max);
		
		
	}
	public static void minArray(int[] arr) {
		int min=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<min) {
				min=arr[i];
				
			}
			
		}
		System.out.println("Lowest array in these element is : "+min);
		
		
	}

}
