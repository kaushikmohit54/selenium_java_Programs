package javaPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StringRelatedPrograms {

	public static void main(String[] args) {
		frequencyofchar();
		OccuranceofcharWithoutforloop();
		RemovalOfNumfromstring();
		reverseString();
		findUpperCaseLetters();
		StringSort();
		numString();
		stringanagramOrnot();
		anagramString();
		countNumberofVowels();
		addSumofDigitinString();
		numString();
		FindFrequencyofeachChar();
		totalNumberofVowelsConstands();
		replacelowercasecharacterswithuppercase();
		StringWithoutUsingLengthMethod();
		removeJunkfromString();
		RemoveSpacesInString();

	}

	private static void RemoveSpacesInString() {
		//Write a Java program to remove the spaces before and after the given string?
    	//Old String: Interview Questions for Java
    	//New String: InterviewQuestionsforJava
    	
        String s1 = "Interview Questions for Java";
        String newString = s1.replaceAll("\\s","");
        System.out.println("Old String: " + s1);
        System.out.println("New String: " + newString);
        //System.out.println(s1.replaceAll(" ", ""));
		
	}

	private static void removeJunkfromString() {
		String s = "小米体验版 latin string 01234567890";
		String s1 = "@#$@#$@ testing #@$@#$@#$ Selenium !@#$@#$@# &&&& Java";
		
		//Regular Expression: [^a-zA-Z0-9]
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
		
	}

	private static void StringWithoutUsingLengthMethod() {
		String s="mohit";
		int length=s.lastIndexOf("");
		System.out.println("length of string is :" +length);
		
	}

	private static void replacelowercasecharacterswithuppercase() {
		String s = "Great Power";

		StringBuffer newStr = new StringBuffer(s);
		for (int i = 0; i < s.length(); i++) {
			// Checks for lower case character
			char ch = s.charAt(i);
			if (Character.isLowerCase(ch)) {
				// Convert it into upper case using toUpperCase() function
				newStr.setCharAt(i, Character.toUpperCase(ch));
			}
			// Checks for upper case character
			else if (Character.isUpperCase(ch)) {
				newStr.setCharAt(i, Character.toLowerCase(ch));

			}

		}
		System.out.println("String after case conversion : " + newStr);
	}

	private static void totalNumberofVowelsConstands() {
		int vCount = 0;
		int cCount = 0;

		String str = "good morning";
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vCount++;

			} else if (ch > 'a' && ch <= 'z') {
				cCount++;
			}
		}
		System.out.println("number of vowels are :" + vCount);
		System.out.println("number of constands are :" + cCount);
	}

	private static void FindFrequencyofeachChar() {
		int maxoccuring = 0;
		
		String s = "good morning";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == ' ') {
				continue;
			}

			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);

			}

			if (map.get(c) > maxoccuring) {
				maxoccuring = map.get(c);
			}
			
			

		}
		for (Character key : map.keySet()) {
			System.out.println("occrence of :" + key + "many times " + map.get(key));
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			Character key = entry.getKey();
			int value = entry.getValue();
			/*
			 * System.out.print(" " +key +"="+ value);
			 * 
			 * char maxchar = 0 ; int maxvalue=Collections.max(map.values());
			 * 
			 * if (value==maxvalue) { System.out.println("most frequent Character => " + key
			 * +value);
			 * 
			 * }
			 */
		
			 if (value == maxoccuring) 
			{
				System.out.println("maximum value is " + value);

			}
			

		}
	}

	static void addSumofDigitinString() {
		String s1 = "mohit123";
		int c = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (Character.isDigit(s1.charAt(i))) {
				int k = Character.getNumericValue(s1.charAt(i));
				c = c + k;
			}
		}
		System.out.println("sum of digit" + c);
		// another way to do the same add digit sum from the string

		char[] f = s1.toCharArray();
		int count = 0;
		for (char g : f) {
			if (Character.isDigit(g)) {
				int k = Integer.parseInt(String.valueOf(g));
				count = count + k;
			}
		}
		System.out.println("count of digit" + count);

	}

	static void findStringVowels() {
		String s1 = "mohit";
		String s2 = "aeiou";
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length() - 1; j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					System.out.println("Vowels are in given string : " + s1.charAt(i));

				}
			}
		}
	}

	static void countNumberofVowels() {
		String s1 = "mohit";
		int count = 0;
		char[] c = s1.toCharArray();
		for (char d : c) {
			switch (d) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;

			default:
				break;
			}

		}
		System.out.println("number of vowels " + count);

	}

	static boolean anagramString() {
		String str1 = "listen";
		String str2 = "silent";

		int n1 = str1.length();
		int n2 = str2.length();

		if (n1 != n2) {
			return false;
		}

		char[] array1 = str1.toCharArray();
		char[] array2 = str2.toCharArray();

		Arrays.sort(array1);
		Arrays.sort(array2);
		for (int i = 0; i < array2.length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}

		if (Arrays.equals(array1, array2)) {
			System.out.println("ana");
		} else {
			System.out.println("not");
		}
		return true;

	}

	static void StringSort() {

		String s = "teststring";

		char[] ch = s.toCharArray();

		Arrays.sort(ch);

		String sorted = new String(ch);
		System.out.println(sorted);
	}

	static void numString() {
		String s = "ankur1511Jain13";
		String s2 = "";

		String arr[] = s.split("[a-zA-Z]+");
		for (String s1 : arr) {
			s2 = s2 + s1.trim();
		}

		char[] ch = s2.toCharArray();
		for (char c : ch) {
			System.out.print(c + ",");
		}
	}

	static void findUpperCaseLetters() {

		String s = "Mohit Sharma123";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c >= 65 && c <= 91) {
				System.out.print("Capital letter string is" + c);
			} else if (c >= 97 && c <= 122) {
				System.out.print("small letter string is" + c);
			}

			else if (c >= 48 && c <= 57) {
				System.out.print("numbers in string is" + c);
			}
		}
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				System.out.println("digits are in string : " + s.charAt(i));
			} else if (Character.isUpperCase(s.charAt(i))) {
				System.out.println("uppercase letter are in string : " + s.charAt(i));
			} else if (Character.isLowerCase(s.charAt(i))) {
				System.out.println("lower letter are in string : " + s.charAt(i));
			}

			else if (Character.isAlphabetic(s.charAt(i))) {
				System.out.println("lower letter are in string : " + s.charAt(i));
			}

		}
	}

	static void reverseString() {

		String s = "good moring guys";
		String rev = "";
		String revrse = "";
		String r = "";
		if (s.isEmpty() || s == null) {
			System.out.println("please enter valid string");

		} else {
			for (int i = s.length() - 1; i >= 0; i--) {
				revrse = revrse + s.charAt(i);
			}
			System.out.println(revrse);
			String[] originalArray = s.split(" ");
			for (String item : originalArray) {
				rev = item + " " + rev;
			}
			// guys morning good
			System.out.println(rev);
			for (int i = originalArray.length - 1; i >= 0; i--) {
				r = r + originalArray[i] + " ";

			}
			System.out.println(r);

		}

	}

	static void frequencyofchar() {

		String str = "Welcome to the javatpoint prtal";

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 't') {
				count++;
			}

		}

		System.out.println("Frequency of t is " + count);
	}

	static void OccuranceofcharWithoutforloop() {

		String s = "Madamtjtaha";
		int a = s.length();
		int b = s.replaceAll("a", "").length();

		System.out.println(a - b + "mo");
	}

	static void RemovalOfNumfromstring() {

		String s = "All (53454)";
		String replc = "[A-Z a-z]";

		String number = "[0-9]";

		String result = s.replaceAll(replc, "");
		String result1 = s.replaceAll(number, "");

		System.out.println(result);

	}

	static void stringanagramOrnot() {
		String s1 = "gullu";
		String s2 = "lgluu";

		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		String s3 = new String(ch1);
		String s4 = new String(ch2);

		if (s3.equals(s4)) {
			System.out.println("Anagram");
		} else
			System.out.println("Not a Anagram");
	}

}
