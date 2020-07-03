package pratice.pratice;

import java.util.HashMap;



public class anagramString {

	public static void main(String[] args) {
		reverseString();//first program
		occurenceofChar();

	}
	
	public static void reverseString() {
		String s="good morning";
		String rev="";
		
		String[] str=s.split(" ");
		
		for (String item : str) {
			rev=item+" "+rev;
		}
		System.out.println("selenium reverse string is:  " +rev);
	}
	
	public static void occurenceofChar() {
		String s="selenium";
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
			
		}
		System.out.println(map);
			
		
		
	}
	
	
	

}
