package javaPrograms;

public class stringToManipulate {

	public static void main(String[] args) {
		String stringToManipulate = "#######";
		printAsPerOutput(stringToManipulate);

	}

	public static void printAsPerOutput(String stringToManipulate) {
		char c = stringToManipulate.charAt(0);
		for (int i = 0; i < stringToManipulate.length(); i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(c);
			}
			System.out.println();
		}

	}

}
