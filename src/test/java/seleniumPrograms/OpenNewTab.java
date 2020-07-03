package seleniumPrograms;


import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class OpenNewTab 
{
   @Test
    public void openNewTab() throws InterruptedException
    {
	   WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
      driver.get("https://www.google.com");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
        driver.get("https://www.gmail.com");
        Thread.sleep(5000);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        Thread.sleep(5000);
    }
}