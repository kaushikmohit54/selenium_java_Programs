package seleniumPrograms;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class DynamicWebTable2
{
   public static void main(String[] args) throws InterruptedException
   {
	   WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
     
      driver.manage().window().maximize();
      driver.get("https://www.w3schools.com/html/html_tables.asp");
      driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
     
      List<WebElement> rows=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
      int rowssize=rows.size();
      int count=0;
      System.out.println(rowssize);
     
      
      String beforeXpath="//*[@id='customers']/tbody/tr[";
      String afterXpath="]/td[1]";
      for(int i=2; i<=rowssize; i++) {
    	  
    	  String mainXpath=beforeXpath+i+afterXpath;
    	  WebElement ele=driver.findElement(By.xpath(mainXpath));
    	  if(ele.getText().equals("Laughing Bacchus Winecellars"))
    	  {
    	  System.out.println("comapny name :"+ele.getText() +"is found" +" at position" +(i-1));
    	  break;
    	  }
    	  
      }
      
      
      
      System.out.println("***************");
      String beforeXpathcontact="//*[@id='customers']/tbody/tr[";
      String afterXpathcontact="]/td[2]";
      for(int i=2; i<=rowssize; i++) {
    	  
    	  String mainXpath=beforeXpathcontact+i+afterXpathcontact;
    	  WebElement ele=driver.findElement(By.xpath(mainXpath));
    	  System.out.println(ele.getText());
    	  
      }
      System.out.println("***************");
      String beforeXpathcountry="//*[@id='customers']/tbody/tr[";
      String afterXpathcountry="]/td[3]";
      for(int i=2; i<=rowssize; i++) {
    	  
    	  String mainXpath=beforeXpathcountry+i+afterXpathcountry;
    	  WebElement ele=driver.findElement(By.xpath(mainXpath));
    	  System.out.println(ele.getText());
    	  count++;
    	  //List<WebElement> countcount=driver.findElements(By.xpath(mainXpath));
    	  
    	  
      }
      System.out.println("total countries are :"+count);
      
      
      //handling coulms
      
      
      String colBeforeXpath="//*[@id='customers']/tbody/tr[1]/th[";
      String colAfterXpath="]";
      List<WebElement> col=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th"));
      System.out.println("colum size is "+col.size());
      
      int colCount=col.size();
      
      for (int j = 1; j <= colCount; j++) {
    	  String mainColXpath=colBeforeXpath+j+colAfterXpath;
    	 WebElement ele1=driver.findElement(By.xpath(mainColXpath));
    	 System.out.println(ele1.getText());
	}
      
      
      
      String beforexpath1="//*[@id='customers']/tbody/tr[";
      String afterXpath1="]";
      for (int i = 1; 1 < rowssize;i++) {
    	  String mainRowxpath=beforexpath1+i+afterXpath1;
    	  WebElement ele2=driver.findElement(By.xpath(mainRowxpath));
    	  System.out.println("rows text is" +ele2.getText());
		
	}
      List<WebElement> countylist=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[]/td[3]"));
      int countrsize=countylist.size();
      System.out.println("total counties are :"+countrsize);
      
     
      
    
      driver.close();
   }
}