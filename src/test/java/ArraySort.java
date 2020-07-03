import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

	public static void main(String[] args) {
		//sortMe();
		sortCollectio();
		sortreverse();
		

	}
	public static void sortMe() {
		int[] arr= {10,16,7,0,88};
		Arrays.sort(arr);
		System.out.printf("Modified arr[] : %s", 
                Arrays.toString(arr)); 
	}
	
	public static void sortreverse() {
		Integer[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 }; 
		  
        // Sorts arr[] in descending order 
        Arrays.sort(arr, Collections.reverseOrder());
		System.out.printf("Modified arr[] : %s", 
                Arrays.toString(arr)); 
	}
	
	public static void sortCollectio() {
		ArrayList<String> al=new ArrayList<String>();
		al.add("mohit");
		al.add("ki");
		al.add("a");
		Collections.sort(al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("List after the use of"+"collection.sort :\n"+al);
		
	}

}
