package seleniumPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class asd {
	public static void main(String[] args) {
		Map<String, String> mapA = new HashMap<>();

		mapA.put("one", "first");
		mapA.put("two", "second");
		mapA.put("three", "third");
		
		for(String value : mapA.values()){
		    System.out.println(value+"hhhh");
		}
		
		Iterator<String> iter=mapA.values().iterator();
		while (iter.hasNext()) {
			String netvalue =  iter.next();
			
		}
		
		Stream<String> stream=mapA.keySet().stream();
		stream.forEach((value)->{System.out.println(value);});
	
		
		
		for (String key : mapA.keySet()) {
			String value=mapA.get(key);
			
		}
		
		Iterator<String> iter1=mapA.keySet().iterator();
		
		
		
		while (iter.hasNext()) {
			String key   = iter.next();
			
			String value = mapA.get(key);
			  System.out.println(key);
			
		}
		
		
		
		
		boolean haskey=mapA.containsKey("a");
		boolean containValue=mapA.containsValue("df");
		System.out.println(containValue);
		System.out.println(haskey);
		System.out.println(mapA);
		Map<String, String> mapB = new HashMap<>();
		mapB.putAll(mapA);
		
		List<String> stringList = new ArrayList<String>();

		stringList.add("onde");
		stringList.add("twd");
		stringList.add("thrdee");

		Stream<String> stream1=stringList.stream();
		stream1.forEach((element)->{System.out.println(element);});
		
		
		Set setA = new HashSet();

        setA.add("ele1");

        System.out.println( setA.contains("ele1") );
	}

}
