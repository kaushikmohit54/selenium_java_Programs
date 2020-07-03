import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class nk {
	public WebDriver driver = null;
	public WebDriverWait wait;
	
	@BeforeTest
	public void config() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		
		
		/*
		ChromeOptions options = new ChromeOptions();As Discussed, 
		options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(options);*/
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
	
		driver.get("http://www.naukri.com/");
		Thread.sleep(5000);
		String parentwindow=driver.getWindowHandle();
		System.out.println("Parent window :" + parentwindow);
		for(String childw:driver.getWindowHandles()) {
			driver.switchTo().window(childw);
			System.out.println("Child window :" +childw);
			if(driver.getTitle().contains("Amazon")) {
				driver.close();
			}
			
		}
		driver.switchTo().window(parentwindow);	
		
		Actions ac=new Actions(driver);
		
		driver.findElement(By.id("login_Layer")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div/label[text()='Email ID / Username']/parent::div/input")).sendKeys("mohit.test@hotmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Faltunaukri@123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();

		 wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//text()[contains(.,'My Naukri')]/ancestor::a[1]")));
		WebElement ele=driver.findElement(By.xpath("//text()[contains(.,'My Naukri')]/ancestor::a[1]"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(ele).build().perform();
		//ele.click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Edit Profile")).click();
		
	}
	
	@Test(invocationCount=500)
	public void updateProfile() throws InterruptedException {
		
		int count = 0;
		
		
		
		
		driver.findElement(By.xpath("//span[text()='Resume Headline']")).click();
		
		
		//(//span[@class='edit icon'][contains(.,'Edit')])[1]
		WebElement editicon=driver.findElement(By.xpath("(//span[@class='edit icon'][contains(.,'Edit')])[1]"));
		wait.until(ExpectedConditions.elementToBeClickable(editicon));
		Thread.sleep(3000);
		editicon.click();
		//WebElement element = driver.findElement(By.xpath("//div[@id='lazyResumeHead']//span[text()='Resume Headline']/following-sibling::span"));
		//Actions actions = new Actions(driver);
		//actions.moveToElement(element).click().perform();
		
		//driver.findElement(By.xpath("//div[@id='lazyResumeHead']//span[text()='Resume Headline']/following-sibling::span")).click();
		//new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='submit'])[3]"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='waves-effect waves-light btn-large blue-btn'][contains(.,'Save')]")).click();
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.findElement(By.xpath("//button[@class='waves-effect waves-light btn-large blue-btn'][contains(.,'Save')]")).click();
		String sucessmsg=driver.findElement(By.xpath("//p[@class='head'][contains(.,'Success')]")).getText();
		//System.out.println(sucessmsg);
		Assert.assertEquals(sucessmsg, "Success");
		System.out.println(sucessmsg);
		Thread.sleep(30000);
		count++;
		System.out.println(count);
		
		//new Actions(driver).dragAndDrop(source, target).build().perform();
		
		
		
		
		
		
		
		/*String parentwindow=driver.getWindowHandle();
		
		for(String currentwidnow:driver.getWindowHandles()) {
			System.out.println(currentwidnow);
			driver.switchTo().window(currentwidnow);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		}*/
		
		
		
  }
	@AfterTest
	public void sdf() {
	driver.quit();
		
	}
}
		
		
