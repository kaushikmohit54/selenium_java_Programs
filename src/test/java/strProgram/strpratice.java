package strProgram;

import java.util.Arrays;

public class strpratice {

	public static void main(String[] args) {
		char[] ch= {'a','b','c'};
		String str=new String(ch);
		System.out.println(str);
		String s="Sachin";  
		   s.concat(" Tendulkar");//concat() method appends the string at the end  
		   System.out.println(s);//will print Sachin because strings are immutable objects  
		   String str3 = "hello";
		   char[] c=s.toCharArray();
		   anagram();
	}
	static void anagram() {
		String s5="listen i";
		String s6="silent i";
		
		char[] str5=s5.replaceAll(" ", "").toCharArray();
		char[] str6=s6.replaceAll(" ", "").toCharArray();
		Arrays.sort(str5);
		Arrays.sort(str6);
		Arrays.equals(str5, str6);
		
		
		
		
	}

}
