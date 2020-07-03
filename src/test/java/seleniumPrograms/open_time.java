package seleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class open_time
{
  public static WebDriver driver=null;
   		
		   public static void main(String[] args) {
			   long start = System.currentTimeMillis();
			  WebDriverManager.chromedriver().setup();
			    driver=new ChromeDriver();
			    driver.get("https://www.softwaretestingo.com");
			   long finish = System.currentTimeMillis();
			   long totalTime = finish - start; 
			   System.out.println("Total Time for page load::"+totalTime);
			   System.out.println("start Time for page load::"+start);
			   System.out.println("finish Time for page load::"+finish);
		}
}
