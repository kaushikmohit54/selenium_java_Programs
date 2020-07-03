package seleniumPrograms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownsort {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.firefoxdriver().setup();
		   driver=new FirefoxDriver();
   driver.get("http://www.ebay.in/");
   Thread.sleep(3000);  
   WebElement element = driver.findElement(By.id("gh-cat"));
   element.click();
   List<WebElement> values=driver.findElements(By.tagName("option"));
   	ArrayList<String> optionvalues=new ArrayList<String>();
   	
	ArrayList<String> al1=new ArrayList<String>();
   	
   	for (WebElement droptext : values) {
   		optionvalues.add(droptext.getText());	
   		al1.add(droptext.getText());	
	}
   
   	
   	Collections.sort(optionvalues);
   	System.out.println(optionvalues);
   //	Assert.assertEquals(optionvalues, al1);
   	
   	if (optionvalues.equals(al1)) {
   		System.out.println("sorted");
		
	} else {
		System.out.println("not sorted");

	}
   	WebElement element1 = driver.findElement(By.id("gh-cat"));
   	Select sel=new Select(element1);
   	sel.selectByVisibleText("Business & Industrial");
   	System.out.println(sel.isMultiple());
	List<WebElement> dropdown=sel.getOptions();
	int sizeDropdown=dropdown.size();
	
	for (int i = 0; i < sizeDropdown; i++) {
		String drop_values=dropdown.get(i).getText();
		System.out.println("dropdown values are : "+drop_values);
		
	}
   
   	System.out.println(sel.getFirstSelectedOption().getText());
   	System.out.println(sel.getAllSelectedOptions());
   	boolean b=element1.isSelected();
   	System.out.println(b);
   	try {
		Screenshots.takeScreenshot(driver);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   	
  Assert.assertTrue(false);
   	
   	

   	

	}

}
