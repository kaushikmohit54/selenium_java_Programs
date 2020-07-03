package DataStruture;

import java.util.Arrays;

public class SecondLargestNumberInArray {
	
	public static void main(String[] args) {
		int arr[] = {45, 56, 12, 5, 2, 78};
		Arrays.sort(arr);
		System.out.println("The First Largest Number in Given Array ::: " +arr[arr.length-1]);
		System.out.println("The Second Largest Number in Given Array ::: " +arr[arr.length-2]);
	}
	

}
