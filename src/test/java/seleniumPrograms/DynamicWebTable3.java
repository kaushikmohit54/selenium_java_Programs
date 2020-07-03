package seleniumPrograms;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class DynamicWebTable3
{
   public static void main(String[] args) throws InterruptedException
   {
	   WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
     
      driver.manage().window().maximize();
      driver.get("http://demo.guru99.com/test/web-table-element.php");
      driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
      
      List<WebElement> row=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
      int rowCount=row.size();
      
      for (WebElement webElement : row) {
		
		//System.out.println(webElement.getText());
	}
     
     //System.out.println(rowCount);
     
     List<WebElement> col=driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
     int colCount=col.size();
    
    //System.out.println(colCount);
    
    
    //verifying text in row
    
  //table[@class='dataTable']/tbody/tr[5]
    
    String beforexpath="//table[@class='dataTable']/tbody/tr[";
    String afterXpath="]/td[1]";
    for (int i = 1; i < rowCount; i++) {
    	
    	WebElement ele=driver.findElement(By.xpath(beforexpath+i+afterXpath));
    	
    	String eletext=ele.getText();
    	//System.out.println(eletext);
    	if(eletext.equals("Sun Pharma.")) {
    		//System.out.println("text is found at position on" + i);
    		
    		break;
    	}
    	
    	//table[@class='dataTable']/tbody/tr[1]/td[1]
	}
    
    List<WebElement> ele2=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
	
    for (WebElement webElement : ele2) {
    	
		//System.out.println(webElement.getText());
	}
    
    String beforexpath1="//table[@class='dataTable']/tbody/tr[";
    String afterXpath1="]";
    String after2xpath="/td[4]";
    for (int i = 1; i < rowCount; i++) {
    	
    	WebElement ele=driver.findElement(By.xpath(beforexpath1+i+afterXpath1));
    	
    	String eletext=ele.getText();
    	System.out.println(eletext);
    	if(eletext.contains("Cera Sanitaryware L")){
    		WebElement ele5=driver.findElement(By.xpath(beforexpath1+i+afterXpath1+after2xpath));
    		String currentPrice=ele5.getText();
    		String preveious="";
    		System.out.println("Yes Bank current price is" +currentPrice);
    		
    		
    		
    		break;
    	}
    	
    }
    
   

    
      driver.close();
    
    }
}