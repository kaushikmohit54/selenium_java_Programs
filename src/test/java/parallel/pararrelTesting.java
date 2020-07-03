package parallel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pararrelTesting {
	
	public  WebDriver driver ;
	@Test
	public void browser() {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.browserstack.com/users/sign_up");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_full_name")).sendKeys("Sadhvi Singh");
		driver.findElement(By.id("user_email_login")).sendKeys("sadhvisingh24@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("browserstack");
		System.out.println("this is the test related to chrome browserstack login"+ " " +Thread.currentThread().getId());
		
	}
	
	@Test()
	public void testOnChromeWithBrowserStackUrl()
	{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.browserstack.com/users/sign_up");
	driver.manage().window().maximize();
	driver.findElement(By.id("user_full_name")).sendKeys("Sadhvi Singh");
	driver.findElement(By.id("user_email_login")).sendKeys("sadhvisingh24@gmail.com");
	driver.findElement(By.id("user_password")).sendKeys("browserstack");
	System.out.println("this is the test related to chrome browserstack login"+ " " +Thread.currentThread().getId());

	}
}
