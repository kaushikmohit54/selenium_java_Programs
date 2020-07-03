package pratice.pratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlightIxigo {
	public static WebDriver driver;
	
	@BeforeClass
	public void config() {
		WebDriverManager.chromedriver().setup();
		
		
		driver = new ChromeDriver();
		driver.get("https://www.ixigo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	
	@Test
	public void FlightSearch() throws InterruptedException {
		//verify title of the page
		Assert.assertEquals(driver.getTitle(), "ixigo - Flights, Train Reservation, Hotels, Air Tickets, Bus Booking");
		WebElement ele=driver.findElement(By.xpath("//iframe[@id='wiz-iframe-intent']"));
		driver.switchTo().frame(ele);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		driver.findElement(By.xpath("//span[@class='CT_InterstitialClose']")).click();
		driver.switchTo().defaultContent();
		
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='orgn u-ib u-v-align-bottom u-text-left']//input[@placeholder='Enter city or airport']")));
		WebElement from=driver.findElement(By.xpath("//div[@class='orgn u-ib u-v-align-bottom u-text-left']//input[@placeholder='Enter city or airport']"));
		from.sendKeys("BLR - Bengaluru",Keys.ENTER);
		WebElement TO=driver.findElement(By.xpath("//div[@class='dstn u-ib u-v-align-bottom u-text-left']//input[@placeholder='Enter city or airport']"));
		TO.sendKeys("DEL - New Delhi",Keys.ENTER);
		driver.findElement(By.xpath("//input[@placeholder='Depart']")).click();
		Thread.sleep(2000);
		for (int i = 0; i <2; i++) {
			driver.findElement(By.xpath("//button[@class='ixi-icon-arrow rd-next']")).click();	
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[(text()='27')])[2]")).click();
		driver.findElement(By.xpath("//div[@class='passanger-class-input u-pos-rel']//input[@class='c-input u-v-align-middle']")).click();
		driver.findElement(By.xpath("(//span[text()='2'])[1]")).click();
		driver.findElement(By.xpath("//div[@class='close-btn u-pos-abs ixi-icon-cross']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		Thread.sleep(10000);
		Alert alr=wait.until(ExpectedConditions.alertIsPresent());
		
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='price']"));
		System.out.println(list.size());
		for (WebElement str : list) {
			Integer price=Integer.parseInt(str.getText());
			
			if(price<3500) {
				System.out.println(price);
			}
			
			}
		
		
		
		
		
	}
	

}
