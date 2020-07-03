package seleniumPrograms;


import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ExcelFileRead
{
   @SuppressWarnings("resource")
   public static void main(String[] args) throws Exception
   {
      WebDriver driver=new FirefoxDriver();
      driver.manage().window().maximize();
      driver.get("http://apps.qaplanet.in/qahrm/login.php");
      File ff=new File("G:\\Testdata\\orangehrm_login.xlsx");
      FileInputStream fi=new FileInputStream(ff);
      HSSFWorkbook wb=new HSSFWorkbook();
      HSSFSheet sh=wb.getSheetAt(0);
      int roc=sh.getLastRowNum();
      System.out.println(roc); 
      for(int i=0;i<=roc;i++)
      {
         String uname=sh.getRow(i).getCell(0).getStringCellValue();
         String upsw=sh.getRow(i).getCell(1).getStringCellValue();
         System.out.println(uname+" "+ upsw);
         driver.findElement(By.name("txtUserName")).clear();
         driver.findElement(By.name("txtUserName")).sendKeys(uname);
         driver.findElement(By.name("txtPassword")).sendKeys(upsw);
         driver.findElement(By.name("Submit")).click();		   
      }
   }
}
