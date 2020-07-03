package DataStruture;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.sound.midi.SysexMessage;

import org.apache.commons.collections.iterators.EntrySetMapIterator;

public class MapTraverseDemo {

	public static void main(String[] args) {
		Map<Integer, String> fruitMap=new HashMap<Integer, String>();
		fruitMap.put(1, "mango");
		fruitMap.put(5, "bnana");
		fruitMap.put(4, "brigle");
		//keyseIteration(fruitMap);
		//ItreatorMap(fruitMap);
		//entrysetMap(fruitMap);
		//usingStreams(fruitMap);
		usingForeachLoop(fruitMap);
		
	
	}
	private static void usingForeachLoop(Map<Integer, String> fruitMap) {
		fruitMap.forEach((key,value)->
		{
			System.out.println("key ="+key);
			System.out.println("value ="+value);
		}
				);
		
	}
	//using stream java 8
	private static void usingStreams(Map<Integer, String> fruitMap) {
		fruitMap.entrySet().stream().forEach(e->System.out.println(e.getKey()));
		
	}
	//by using entry set
	private static void entrysetMap(Map<Integer, String> fruitMap) {
		for (Map.Entry<Integer, String> entry : fruitMap.entrySet()) {
			System.out.println("key"+entry.getKey());
			System.out.println("value"+entry.getValue());
			
		}
		
	}
	//using itearotror
	private static void ItreatorMap(Map<Integer, String> fruitMap) {
		Iterator<Map.Entry<Integer, String>> iterator=fruitMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry=iterator.next();
			System.out.println("key ="+entry.getKey());
			System.out.println("key ="+entry.getValue());
		}
		
	}
	//using keySet
	private static void keyseIteration(Map<Integer, String> fruitMap) {
		for (Integer fruitId : fruitMap.keySet()) {
			System.out.println("key  = "+fruitId);
			System.out.println("value =" +fruitMap.get(fruitId));
		}
		
	}
	

}
