package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class arrayRelatedProgram {

	public static void main(String[] args) {
		duparray();
		duparray2();
		commonArray();
		ArraySum();
		Arrayintersect();
		missingArraynumber();
		missingArraynumber1();
		ArrayToArrayList();
		arrayElementCount();
		secondLargtestArray();
		DupElementString();
		printMaxTwoNumbersarray();
		largeArray();
		minArray();

	}
	
	
	public static void largeArray() {
		int[] arr= {2,4,7,3,9};
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				max=arr[i];
				
			}
			
		}
		System.out.println("Given Array is ::: " +Arrays.toString(arr));
		System.out.println("Largest array in these element is : "+max);
		
		
	}
	public static void minArray() {
		int[] arr= {2,4,7,3,9};
		int min=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<min) {
				min=arr[i];
				
			}
			
		}
		System.out.println("Lowest array in these element is : "+min);
		
		
	}
	private static void printMaxTwoNumbersarray() {
		int numbers[] = {2,5,8,6,7,90};
		int maxOne = 0;
		int maxTwo = 0;
		
		for(int number : numbers)
		{
			if(maxOne < number)
			{
				maxTwo = maxOne;
				maxOne = number;
			}
			else if(maxTwo < number)
			{
				maxTwo =  number;
			}
		}
		System.out.println("First Maximum Number is ::: " +maxOne);
		System.out.println("Second Maximum Number is ::: " +maxTwo);
	}


	private static void DupElementString() {
String names[] = {"Java", "JavaScript", "Ruby", "C", "Python", "Java"};
		
		//1. compare each element: O(nxn) --- worst solution
		for(int i = 0; i<names.length; i++){
			for(int j = i+1; j<names.length; j++){

				if(names[i].equals(names[j])){
					System.out.println("duplicate element is::" + names[i]);
				}
			}
		}
		
		System.out.println("*********");
		
		//2. using HashSet: Java Collection: it stores unique values: O(n)
		Set<String> store = new HashSet<String>();
		for(String name : names){
			if(store.add(name) == false){
				System.out.println("duplicate element is::" + name);
			}
		}
		
		System.out.println("*********");

		//3. using HashMap: O(2n)
		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		
		for(String name : names){
			Integer count = storeMap.get(name);
			if(count == null){
				storeMap.put(name, 1);
			}
			else{
				storeMap.put(name, ++count);
			}
		}
		
		//get the values from this HashMap:
		
		
	     Set<Entry<String, Integer>> entrySet =	storeMap.entrySet();
	     for(Entry<String, Integer> entry : entrySet){
	    	 if(entry.getValue()>1){
	    		 System.out.println("duplicate element is::"+ entry.getKey());
	    	 }
	     }
		
		
		
	}

	private static void secondLargtestArray() {

		int[] arr = { 12, 2, 14, 7, 32, 18, 23, 22, 11 };
		int temp;
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {

				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}

			}
		}

		System.out.println(arr[(arr.length) - 2]);

	}

	private static void duparray2() {
		int[] arr = { 2, 2, 4, 4, 5, 6 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("duplidate elements are : " + arr[i]);

				}
			}
		}

	}

	static void duparray() {
		int[] arr = { 2, 2, 4, 4, 5, 6 };
		Set<Integer> set = new HashSet<>();
		System.out.println("duplidate");
		for (int i = 0; i < arr.length; i++) {

			if (set.add(arr[i]) == false) {
				System.out.print(" " + arr[i]);
			}

		}

	}

	static void commonArray() {
		int[] arr1 = { 20, 30, 40, 50, 80 };
		int[] arr2 = { 30, 80, 60, 70, 80 };
		System.out.print("commn element are : ");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.print(" " + arr1[i]);
					break;

				}
			}

		}

	}

	static void ArraySum() {
		int[] arr = { 4, 6, 5, 5, 10, 20, 30 };
		int num = 10;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == num) {
					System.out.println(arr[i] + " + " + arr[j] + " = " + num);

				}
			}
		}

	}

	static void Arrayintersect() {
		String[] inputArray1 = { "ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR" };

		String[] inputArray2 = { "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR" };

		HashSet<String> set = new HashSet<String>();

		for (int i = 0; i < inputArray1.length; i++) {
			for (int j = 0; j < inputArray2.length; j++) {
				if (inputArray1[i].equals(inputArray2[j])) {
					set.add(inputArray1[i]);
				}
			}
		}
		// HashSet<String>s=new HashSet<>(Arrays.asList(inputArray1));
		System.out.println("First Array : " + Arrays.toString(inputArray1));

		System.out.println("Second Array : " + Arrays.toString(inputArray2));

		System.out.println("Common Elements : " + set);
	}

	static void missingArraynumber() {
		int[] a = { 1, 2, 4, 5, 6, 7, 8, 9 };
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < a.length; i++) {
			sum1 = sum1 + a[i];
		}
		System.out.println(sum1);
		for (int j = 0; j <= 9; j++) {
			sum2 = sum2 + j;
		}
		System.out.println(sum2 - sum1);

	}

	static void missingArraynumber1() {
		int[] a = { 1, 4, 5, 3, 2, 8, 6 };
		int sum1 = 0;

		int n = 8;

		for (int i = 0; i < a.length; i++) {
			sum1 = sum1 + a[i];
		}
		System.out.println(sum1);
		int sum2 = (n * (n + 1)) / 2;
		System.out.println(sum2);
		System.out.println(sum2 - sum1);

	}

	static void ArrayToArrayList() {
		String[] array = { "aasd", "bgasd", "caasd" };
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));
		System.out.println(list);
		// ArraylistToArray
		ArrayList<String> list1 = new ArrayList<String>();

		list1.add("JAVA");

		list1.add("JSP");

		list1.add("ANDROID");

		list1.add("STRUTS");

		list1.add("HADOOP");

		list1.add("JSF");

		String[] array1 = new String[list1.size()];

		list1.toArray(array1);

		for (String string : array1) {
			System.out.println(string);
		}

	}

	static void arrayElementCount() {
		int[] a = { 2, 5, 5, 6, 7, 8, 9, 9, 9, 5, 2, 1 };
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int c : a) {
			if (map.containsKey(c)) {

				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

		}
		for (int key : map.keySet()) {
			int value = map.get(key);
			System.out.println("occurence of integer array" + key + " count: " + value);
		}

	}
}
