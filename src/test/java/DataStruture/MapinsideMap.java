package DataStruture;

import java.util.HashMap;
import java.util.Map;

public class MapinsideMap {

	public static void main(String[] args) {
		Map<String, Map<String,String>> map=new HashMap<String, Map<String,String>>();
		
		Map<String, Map<String,String>> map6=new HashMap<String, Map<String,String>>();
		
		Map<String,String> map1 = new HashMap<String, String>();
		map1.put("abc", "1");
		map1.put("xyz", "2");
		
		Map<String,String> map2 = new HashMap<String, String>();
		map2.put("abc", "16");
		map2.put("yui", "27");
		
		
		map.put("key1", map1);
		map.put("key2", map2);
		
		for(Map.Entry<String, Map<String,String>> entryMap : map.entrySet()) {
			System.out.println("Keys ::");
			System.out.println(entryMap.getKey());
			System.out.println("Values ::");
			for(Map.Entry<String, String> entryMapInner : entryMap.getValue().entrySet()) {
				System.out.println(entryMapInner.getKey());
				System.out.println(entryMapInner.getValue());
			}
		}
		
	}

}
