package DataStruture;

import java.util.HashMap;
import java.util.Map;

public class mapInternally {
	public static void main(String[] args) {
		
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("bb", 1);
		map.put("bb", 2);
		map.put("null", 4);
		
		System.out.println(map);
		
	}

}
