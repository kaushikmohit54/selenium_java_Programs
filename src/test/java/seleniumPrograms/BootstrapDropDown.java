package seleniumPrograms;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BootstrapDropDown 
{
   public static void main(String[] args) throws InterruptedException 
   {
      WebDriver driver=new FirefoxDriver();
      driver.manage().window().maximize();
      driver.get("G:\\Testing_Utilities\\Selenium_Practice\\BootstrapDropdown.html");
      driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
      driver.findElement(By.id("menu1")).click();
     List<WebElement> li=driver.findElements(By.xpath(".//ul[@class='dropdown-menu']/li/a"));
      for(WebElement el:li)
      {
         if(el.getText().equals("CSS"))
         {
            el.click();
            Thread.sleep(3000);
            System.out.println("Element Clicked");
            break;
         }
         System.out.println(el.getText());
      }
   }
}