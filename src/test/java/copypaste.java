import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class copypaste {

	public static void main(String[] args) {
			WebDriver driver = null;
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		//WebElement up =driver.findElement(By.id("password"));
		//up.sendKeys(Keys.CONTROL,"a");
		//up.sendKeys(Keys.CONTROL,"c");
		//WebElement un =driver.findElement(By.id("username"));
		//un.clear();
		//un.sendKeys(Keys.CONTROL,"v");
		WebElement up =driver.findElement(By.name("userName"));
		
		
		up.sendKeys(Keys.CONTROL,"a");
		up.sendKeys(Keys.CONTROL,"c");
		WebElement un =driver.findElement(By.name("password"));
		un.clear();
		un.sendKeys(Keys.CONTROL,"v");
		//un.sendKeys(Keys.CONTROL,"v");
		driver.close();

	}

}
