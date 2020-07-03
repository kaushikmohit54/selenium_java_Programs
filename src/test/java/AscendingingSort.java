import java.util.Arrays;

public class AscendingingSort {

	
		public static void main(String[] args) {
			// Descending number sort

			int[] a = { 3, 4, 7, 2, 1 };
			
			 for (int i = 0; i < a.length; i++) { 
				 
				 for (int j = i + 1; j < a.length ; j++) 
			         { 
					 if (a[i] > a[j]) 
					 { 
						 int temp = a[j]; 
						 a[j] = a[i]; 
						 a[i] =temp; 
						 } 
					 } 
				 }		
		
	     System.out.println(Arrays.toString(a));	
			
			


	}

}
