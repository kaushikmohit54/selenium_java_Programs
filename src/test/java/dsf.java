/*import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class dsf {

	public static void main(String[] args) {
		WebDriver driver = null;
		Boolean b=driver.findElement(By.xpath("")).isDisplayed();
		Boolean b1=driver.findElement(By.xpath("")).isEnabled();
		
		if(driver.getPageSource().contains("abc")) {
			Wait w=new FluentWait(driver)
					.withTimeout(30,TimeUnit.SECONDS)
					.pollingEvery(5,TimeUnit.SECONDS)
					.ignoring(NoSuchElementException.class);
			
			WebElement ele=w.until(new Function() {
				public WebElement apply(WebDriver driver) {
					return driver.findElement(By.id(""))
				}
			})
			
		}
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementId("textbox_id").value='abc'");
		js.executeScript("arguments[0.scrollIntoView();]",elemetn)
		driver.findElement(By.xpath("")).sendKeys(Keys.ENTER);
		Actions act=new Actions(driver);
		act.contextClick().perform();
		act.doubleClick("");
		act.dragAndDrop("abc", "dd").per
		driver.wait();
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		driver.getCurrentUrl();
		driver.navigate().to("");		
		driver.findElement(By.id("")).sendKeys(Keys.F5);
		
		
				
	   
		
	}

}
*/