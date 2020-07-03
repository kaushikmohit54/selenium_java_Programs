package JavaInterviewPrograms;

import java.util.Arrays;

public class ana1 {
	public static void main(String[] args) {
		String s="listen";
		String s1="silent";
		
		char[] str1=s.toCharArray();
		char[] str2=s1.toCharArray();
		
		int array1=str1.length;
		int array2=str2.length;
		
		if(array1!=array2) {
			System.out.println("not anagram");
		}
		System.out.println();
		Arrays.sort(str1);
		Arrays.sort(str2);
		 
		if(Arrays.equals(str1, str2)) {
			System.out.println("anagrams");
		}
		else
			System.out.println("not ana");
		
		
	}

}
