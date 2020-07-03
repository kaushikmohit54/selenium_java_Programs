import java.util.ArrayList;
import java.util.HashSet;

public class duplicateArray {

	public static void main(String[] args) {
		int[] arr = { 22, 33, 5, 1, 55, 77, 77, 1 };
		HashSet<Integer> hs = new HashSet<Integer>();
		ArrayList<Integer> uniqueElements = new ArrayList<Integer>();
		
		  for(int i=0; i<arr.length;i++) {
			  
			  if(hs.add(arr[i])==true) {
				  uniqueElements.add(arr[i]);
			  } else {
				  uniqueElements.remove(new Integer(arr[i]));
			  }
		  }
		  
		  for(Integer element : uniqueElements) {
			  System.out.println(element + " is Uniquie");
		  }
		  
			 
			 
	}	 
		
	
}
