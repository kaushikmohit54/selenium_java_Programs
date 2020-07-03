package seleniumPrograms;


import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Switchto_MultipleWindow 
{
	public static WebDriver driver;
	
	
    
   @BeforeTest
   public void open()
   
   {	WebDriverManager.firefoxdriver().setup();
	   driver=new FirefoxDriver();
      driver.manage().window().maximize();
      driver.get("http://popuptest.com/");
      driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
      
   }
   @Test
   public void operation() throws InterruptedException
   {
      String parent=driver.getWindowHandle();
      driver.findElement(By.xpath("html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/font[1]/b/a")).click();
      Thread.sleep(5000);
     ArrayList<String> handles=new ArrayList<>(driver.getWindowHandles());
      System.out.println(handles.size());
      for(int i=0;i<handles.size() ;i++)
      {
         String str=handles.get(i).toString();
         if(str.equals(parent))
         {
            System.out.println(i+ "Parent Popup opened");
            System.out.println("This Is Your Parent Window");
            driver.switchTo().window(parent).close();
            System.out.println(i+ "Parent Popup closed");
         }
         else
         {
            System.out.println(i +"popup is opened");
            Thread.sleep(1000);
            driver.switchTo().window(str).close();
            System.out.println(i +"popup is closed");
         }			
      }
   }
}