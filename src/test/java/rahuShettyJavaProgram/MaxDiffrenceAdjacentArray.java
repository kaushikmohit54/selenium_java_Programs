package rahuShettyJavaProgram;

import java.util.ArrayList;

public class MaxDiffrenceAdjacentArray {

	//max adjacent diffrence in array
	public static void main(String[] args) {
		int[] a= {1,4,5,7};
		int[] b= {6,4,3,7};
		ArrayList<Integer> al=new ArrayList<>();
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i]==b[i]) {
				al.add(a[i]);
				
			}	
			
			
		}
		
		Object[] c=al.toArray();
		System.out.println(c);
		for (Object object : c) {
			System.out.println(object);
		}
		
		
	}

	

}
