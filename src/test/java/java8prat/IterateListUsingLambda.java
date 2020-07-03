package java8prat;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;

public class IterateListUsingLambda  {
public static void main(String[] args) {
	
	
	Map<String, Integer> prices=new HashMap<>();
	prices.put("apple", 50);
	prices.put("mango", 50);
	prices.put("bnana", 50);
	prices.put("guvava", 50);
	prices.put("ppaya", 50);
	
	/* Iterate without using Lambda
	   for (Map.Entry<String, Integer> entry : prices.entrySet()) {
	   System.out.println("Fruit: " + entry.getKey() + ", Price: " + entry.getValue());
	   }
	*/ 
	prices.forEach((k,v)->System.out.println("Fruit: " + k + ", Price: " + v));
	
	
	
	
}
}
