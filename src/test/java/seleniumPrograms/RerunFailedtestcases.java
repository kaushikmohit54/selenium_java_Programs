package seleniumPrograms;


import java.util.ArrayList;
import java.util.List;
import org.testng.TestNG;
public class RerunFailedtestcases 
{
   public static void main(String[] args) 
   {
      TestNG runner=new TestNG();
      List <String> list=new ArrayList<String>();
      list.add("G:\\Git_Base_Folder\\softwaretestingblog\\Daily_Practice\\test-output\\testng-failed.xml");
      runner.setTestSuites(list);
      runner.run();
   }
}