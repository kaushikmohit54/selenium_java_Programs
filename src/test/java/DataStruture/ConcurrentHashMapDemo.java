package DataStruture;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> cmap=new ConcurrentHashMap<>();
		cmap.put(1,"mango");
		cmap.put(2, "apple");
		cmap.put(3, "apple");
		
		cmap.putIfAbsent(1, "mango");
		cmap.remove(2,"apple");
		
		cmap.putIfAbsent(103, "Hello"); 
		System.out.println(cmap);
	}

}
