import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tabs {
	
	public static void main(String[] args) throws AWTException {
		int[] a= {22,33,22,55,33,55,55};
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		for (int c : a) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
			
			
		}
		for (Entry<Integer, Integer> entry: map.entrySet()) {
			int key = entry.getKey();
			int value = entry.getValue();
			if(value>2) {
				
			
			System.out.println("Key: " + key + ", value: " + value);
			}
		}
		
	}
		

}
