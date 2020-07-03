package JavaInterviewPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class DuplicateString 
{
	public static void findDuplicateCharacters(String str)
	{
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		
		
		String[] s=str.split(" ");
		
		
		
		for(String c:s)
			
			if(hashMap.get(c) != null)
			{
				hashMap.put(c, hashMap.get(c) + 1);
			}
			else
			{
				hashMap.put(c, 1);
			}		
		

		//To Print all the Characters that are appeared in a String.
		
				
		
			
//		First Way to Print Only and Only Duplicate Characters from a String.
//		Iterator<Character> tempString = hashMap.keySet().iterator();
//		while(tempString.hasNext())
//		{
//			Character temp = tempString.next();
//			if(hashMap.get(temp) > 1)
//			{
//				System.out.println("The Character " + temp + " appeared " + hashMap.get(temp) + " Times.");
//			}
//		}
		
//		Second Way to Print Only and Only Duplicate Words from a String.
	Set<String> tempString = hashMap.keySet();
	for(String temp : tempString)
	{
		if(hashMap.get(temp) > 1)
		{
			System.out.println("The Word " + temp + " appeared " + hashMap.get(temp) + " Times.");
		}	
	}
}

	
	public static void main(String args[])
	{
		findDuplicateCharacters("mohit mohit is sharma java java is one two three one");
	}
}
