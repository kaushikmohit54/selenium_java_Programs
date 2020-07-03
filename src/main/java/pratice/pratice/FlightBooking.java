package pratice.pratice;

import java.awt.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class FlightBooking 
{
	
	
	@Test
	public void SearchFlight() {

	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ixigo.com/");
	
	WebDriverWait wait=new WebDriverWait(driver, 10);
	String verifyTitle="ixigo - Flights, Train Reservation, Hotels, Air Tickets, Bus Booking";
	Assert.assertEquals(driver.getTitle(), verifyTitle);
	
	
	//WebElement ele=driver.findElement(By.xpath("//div[@class=\"CT_InterstitialTitle\"]"));
	//ele.isDisplayed();
	
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@placeholder=\"Enter city or airport\"])[1]")));
	WebElement from=driver.findElement(By.xpath("(//input[@placeholder=\"Enter city or airport\"])[1]"));
	from.sendKeys("New Delhi");
	from.sendKeys(Keys.ENTER);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@placeholder=\"Enter city or airport\"])[2]")));
	WebElement TO=driver.findElement(By.xpath("(//input[@placeholder=\"Enter city or airport\"])[2]"));
	TO.sendKeys("Mumbai");
	TO.sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//button[@class=\"ixi-icon-arrow rd-next\"]")).click();
	driver.findElement(By.xpath("//button[@class=\"ixi-icon-arrow rd-next\"]")).click();
	driver.findElement(By.xpath("//button[@class=\"ixi-icon-arrow rd-next\"]")).click();
	
	boolean element=driver.findElement(By.xpath("//div[text()=\"July 2020\"]")).isDisplayed();
	
	Assert.assertTrue(element);
	driver.findElement(By.xpath("(//div[text()=\"12\"])[2]")).click();
	
	driver.findElement(By.xpath("//div[text()=\"Travellers | Class\"]")).click();
	driver.findElement(By.xpath("(//span[text()=\"2\"])[1]")).click();
	driver.findElement(By.xpath("//div[@class=\"close-btn u-pos-abs ixi-icon-cross\"]")).click();
	driver.findElement(By.xpath("(//div[@class=\"u-ripple\"])[1]")).click();
	
	
	
	
  java.util.List<WebElement> list=driver.findElements(By.xpath("//div[@class=\"price\"]"));
  java.util.List<WebElement> list1=driver.findElements(By.xpath("//div[@class=\"airline-logo\"]"));
  

  
  		
  	}
	
	
		
	}
   

