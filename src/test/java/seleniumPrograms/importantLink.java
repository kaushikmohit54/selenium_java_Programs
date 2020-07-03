package seleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class importantLink {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		  WebDriverManager.chromedriver().setup();
		    ChromeDriver driver=new ChromeDriver();
		    driver.get("https://www.softwaretestingo.com");
		    
		    List<WebElement> links=driver.findElements(By.tagName("a"));
		    
		    int totalsize=links.size();
		    System.out.println("count: " +totalsize);
		    
		    for (int i = 0; i < totalsize; i++) {
		    	String linkstext=links.get(i).getText();
		    	System.out.println(linkstext);
		    	
		    	String link=links.get(i).getAttribute("href");
		    	
		    	System.out.println(link);
				
			}
	}

}
