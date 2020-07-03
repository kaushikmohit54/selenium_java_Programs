package pratice.pratice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		
		
		/*
		ChromeOptions options = new ChromeOptions();As Discussed, 
		options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(options);*/
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
	
		driver.get("http://www.naukri.com/");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Set<String> wid=driver.getWindowHandles();
		
		System.out.println(wid.size());
		int widowsize=wid.size();
		if(widowsize==2) {
			Iterator<String> iter=wid.iterator();
			String pid=iter.next();
			String cid=iter.next();
			
			driver.switchTo().window(cid);
			driver.close();
			
		}
		

	}

}
