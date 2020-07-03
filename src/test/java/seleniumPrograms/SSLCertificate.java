package seleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
public class SSLCertificate
{
   public static void main(String[] args)
   {
	  /* 
	   Steps for Chrome Browser:

		    Create An object for Desiredcpabilities class
		    Set the ACCEPT_SSL_CERTS as true
		    Open the chrome browser with the capability

		// Create object of DesiredCapabilities class
		DesiredCapabilities cap=DesiredCapabilities.chrome();

		// Set ACCEPT_SSL_CERTS variable to true
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);


		// Set the driver path
		System.setProperty("webdriver.chrome.driver","Chrome driver path");


		// Open browser with capability
		WebDriver driver=new ChromeDriver(cap);*/
	   
      //It create firefox profile
      FirefoxProfile profile=new FirefoxProfile();
      // This will set the true value
      profile.setAcceptUntrustedCertificates(true);
      // This will open firefox browser using above created profile
      //WebDriver driver=new FirefoxDriver(profile);
     // driver.get("pass the url as per your requirement");
   }
}