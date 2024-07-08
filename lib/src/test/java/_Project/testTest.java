package _Project;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class testTest {
	
	
	static ExtentReports extent;
	static ExtentTest test;
	
	@BeforeClass
	public void init()
		{
			
		extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Result.html");
		extent.attachReporter(spark);
		test = extent.createTest("MyFirstTest");
		
		
		
		
		}
	
  @Test
  public void f() {
	  test.pass("test1");
	  
  }
  
  @Test
  public void t1()
	{
		int a=10,b=9;
	  System.out.println("Automation Testing");
	  if(a<b)
	  test.pass("a="+a+" is less than b="+b);
	  else
		  test.fail("Fail");
		  
	}
  
  @AfterClass
  public void end()
  {
	  extent.flush();
  }
  
}
