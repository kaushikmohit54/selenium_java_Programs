package DataStruture;

import java.util.Arrays;
import java.util.Collections;

public class SortingArrayInAscendingDescending {

	public static void main(String[] args) {
		String string[] = { "One", "Two", "Three", "Four", "Five" };

		System.out.println("-----Arrays Values Before Sorting-----");

		for (String string2 : string) {
			System.out.println(string2);
		}
		Arrays.sort(string);
		System.out.println("-----Arrays Values in ascending order Sorting-----");

		for (String string2 : string) {
			System.out.println(string2);
		}
		Arrays.sort(string,Collections.reverseOrder());
		
		System.out.println("-----Arrays Values in desending order Sorting-----");
		for (String string2 : string) {
			System.out.println(string2);
		}
	}

}
