package pratice.pratice;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumConfig {
public static void main(String[] args) {
//String path = System.getProperty("user.dir"); System.setProperty("webdriver.chrome.silentOutput", "true"); System.setProperty("webdriver.chrome.driver", path + "/chromedriver");
WebDriverManager.chromedriver().setup();	
WebDriver driver = new ChromeDriver(); driver.get("https://testuserautomation.github.io/WebTable/");
// Method 1
String before_xpath = "//table/tbody/tr[";
String after_xpath = "]/td[2]";
List rows = driver.findElements(By.xpath("//table/tbody/tr"));
int rowSize = rows.size();
System.out.println(rowSize);
for (int i = 2; i <= rowSize; i++) {
String firstNames = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
System.out.println(firstNames);
// Now click the checkBox where first Name would be Will
if (firstNames.contains("Will")) {
// click the checkBox
driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[1]/input")).click(); System.out.println("candidate has been selected");
break;
}
}
// Method 2 : By custom xpath:
driver.findElement(By.xpath("//td[contains(text(),'Will')]//preceding-sibling::td//input[@type='checkbox']")) .click();
driver.close();
}
}