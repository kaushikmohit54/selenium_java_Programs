package strProgram;

import java.util.Scanner;

public class ReverseStr {

	public static void main(String[] args) {

		strArrayRev();
		strRev();
		withoutSplit();
	}

	public void scan() {
		Scanner s = new Scanner(System.in);
		System.out.println("please enter String: ");
		String original = s.nextLine();
	}

	public static void strArrayRev() {

		String s = "Java Interview Questions";
		String rev = "";
		String r = "";
		if (s.isEmpty() || s == null) {
			System.out.println("please enter a valid string");
		}

		String[] originalArray = s.split("\\s");

		for (String item : originalArray) {
			rev = item + " " + rev;
		}
		System.out.println(rev);

		for (int i = rev.length() - 1; i >= 0; i--) {
			r = r + rev.charAt(i);

		}
		System.out.println(r);

	}

	public static void strRev() {
		String s1 = "good morning";
		String reverse = "";

		for (int i = s1.length() - 1; i >= 0; i--) {
			reverse = reverse + s1.charAt(i);

		}
		System.out.println(reverse);
	}

	public static void withoutSplit() {
		String rev = "This is a boy";
		String currentWord = "";

		for (int i = rev.length() - 1; i >= 0; i--) {
			if (rev.charAt(i) == ' ') {
				printWordReversed(currentWord);
				currentWord = "";
			} else
				currentWord = currentWord + rev.charAt(i);
		}

		// Have to print out the last word
		printWordReversed(currentWord);
		System.out.println(); // new line for formatting
	}

	public static void printWordReversed(String word) {
		for (int i = word.length() - 1; i >= 0; i--) {
			System.out.print(word.charAt(i));
		}
		System.out.print(" ");
	}

}
