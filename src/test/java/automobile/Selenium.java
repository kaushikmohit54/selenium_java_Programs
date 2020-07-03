package automobile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface Selenium {
	public void launchBrowser(String browserName);
	public WebDriver openUrl(String url);
	public void maximizeBrowser();
	public void enterText(WebElement element,String text);
	public void clickElement();
	public void waitForTheElementPresent(String xpath,WebDriver driver);
	public void enterTextUsingJavaScriptById(String text,String id,WebDriver driver);
	public void clickUsingJavaScript(WebElement element,WebDriver driver);
	public void VerifyTitle();
	public void selectDropdown(String value,WebElement element);
	public void GetCurrentUrl();
	public void deleteCokkies();

}
