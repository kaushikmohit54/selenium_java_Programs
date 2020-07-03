package DataStruture;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementsInArray {
	public static void main(String[] args) {
		String names[] = { "Java", "Java", "C++", "CSharp", "Haskell", "Ruby", "Python", "C++" };
		find(names);
		//find2(names);
	}

	public static void find(String names[]) {
		Set<String> set = new HashSet<String>();
		for (String string : names) {

			if (set.add(string) == false) {
				System.out.println(string);

			}
		}

	}

	public static void find2(String names[]) {
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i] == names[j]) {
					System.out.println(names[i]);

				}

			}
		}

	}

}
