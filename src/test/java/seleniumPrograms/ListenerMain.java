
package seleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class ListenerMain implements ITestListener
{
   @Override
   public void onFinish(ITestContext Result) 
   {	
      System.out.println("Test Casse Is Finished"+Result.getName());
   }
   @Override
   public void onStart(ITestContext Result) 
   {
      System.out.println("Test Casse Is Started"+Result.getName());	
   }
   @Override
   public void onTestFailedButWithinSuccessPercentage(ITestResult Result) 
   {
      System.out.println("Test Casse Is FailedwithSucesspercentage"+Result.getName());	
   }
   @Override
   public void onTestFailure(ITestResult Result) 
   {
      System.out.println("Test Casse Is Failed"+Result.getName());	
   }
   @Override
   public void onTestSkipped(ITestResult Result) 
   {
      System.out.println("Test Casse Is Skipped"+Result.getName());
   }

   @Override
   public void onTestStart(ITestResult Result) 
   {
      System.out.println("Test Casse Is Started on Test"+Result.getName());
   }

   @Override
   public void onTestSuccess(ITestResult Result) 
   {
      System.out.println("Test Casse Is Sucess"+Result.getName());		
   }
}








