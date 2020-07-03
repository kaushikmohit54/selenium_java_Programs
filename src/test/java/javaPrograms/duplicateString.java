package javaPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class duplicateString {

	public static void main(String[] args) {
		uniquelement();
		
		String s = "my name is mohit mohit is i am a eng";
		String[] str = s.split(" ");

		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String c : str) {

			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);

			} else {
				map.put(c, 1);
			}

		}
		System.out.println(map);

		for (String key : map.keySet()) {
			if (map.get(key) > 1) {
				System.out.println("duplicate string are: " + key);
			}

		}
	}

	public static void uniquelement() {
		String s = "my name is mohit mohit is i am a eng";
		String[] str = s.split(" ");
		Set<String> set = new HashSet<>();
		for (String element : str) {
			if (!set.add(element) == false) {
				System.out.println(element);

			}

		}
		
		

	}
	
		
	

}
