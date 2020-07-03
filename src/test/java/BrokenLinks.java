import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		List<WebElement> elements=driver.findElements(By.tagName("a"));
		List finalList=new ArrayList<>();
		
		for(WebElement ele:elements) {
			if(ele.getAttribute("href")!=null) {
				//System.out.println(ele.getAttribute("href"));
				finalList.add(ele);
				
			}
			
		}
		System.out.println(finalList.toString());
		
	

	}

}
