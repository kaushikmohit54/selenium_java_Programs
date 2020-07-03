package pratice.pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mohit {
	static int marks=20;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mohit m1=new mohit();
		m1.marks=30;
		mohit m2=new mohit();
		m2.marks=40;
		System.out.println(m1.marks);
		
		Integer[] a= {11,11,22,44,55,55,55,33,40};
		
		List<Integer> al = 
	            new ArrayList<Integer>(Arrays.asList(a)); 
	        Map<Integer, Integer> map=new HashMap<>();
	        for(int listItem : al) {
	        	if(map.containsKey(listItem)) {
	        		map.put(listItem, map.get(listItem)+1);
	        	}
	        	else
	        	{
	        		map.put(listItem, 1);
	        	}
	        		
	        	
	        	
	        }
	        System.out.println(map);
	       

	}

}
