package automobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public  class seleniumImplematation implements Selenium {

	protected WebDriver driver;
	
	public void launchBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.findElement(By.xpath("")).sendKeys();
			
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			
			
		}
		
	}

	public WebDriver openUrl(String url) {
		driver.get(url);
		return driver;
		
		
	}

	public void maximizeBrowser() {
		driver.manage().window().maximize();
		
		
	}

	public void enterText(WebElement element, String text) {
		element.sendKeys(text);
		
	}

	public void clickElement() {
		
		
		
	}

	public void waitForTheElementPresent(String xpath, WebDriver driver) {
		
		
	}

	public void enterTextUsingJavaScriptById(String text, String id, WebDriver driver) {
		
		
	}

	public void clickUsingJavaScript(WebElement element, WebDriver driver) {
		
		
	}

	public void VerifyTitle() {
		
		
	}

	public void selectDropdown(String value, WebElement element) {
		
		
	}

	public void GetCurrentUrl() {
		
		
	}

	public void deleteCokkies() {
		
		
	}

}
