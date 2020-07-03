package automobile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParellelTesting {
	WebDriver driver=null;
	@Test
	public void test1() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://mail.google.com/");
		System.out.println(driver.getTitle());
		
	}
	
	@Test
	public void test2() {
		WebDriver driver=null;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
	}
	
	@AfterMethod
	public void close() {
		
		}
	}


