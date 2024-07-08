package lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class test12 {
	
	
	//static ExtentReports extent;
	//static ExtentTest test;
	WebDriver d;
	SoftAssert softAssert;
	commonfunctions c=new commonfunctions();
	
	@BeforeSuite
	public void init()
		{
			
		commonfunctions.extentreport();
		c.managechromedriverbinary();
		softAssert = new SoftAssert();
		
				
		}
	
  @Test(priority=4)
  public void f() {
	  try
		{
			
		  
		d=new ChromeDriver();
	    d.manage().window().maximize();
	    d.get("https://www.google.com/");
	    String title=d.getTitle();
	    System.out.println("Title is"+title);
	   
	    softAssert.assertEquals(title,"Google");
	    softAssert.assertAll();
	    Assert.assertEquals(title,"Google");
	    commonfunctions.LogPass("Login To Google page successful");
	    d.quit();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	  
	

	}
  
  @Test(priority=2)
  public void g()
  {
	  System.out.println("Hello");
	  commonfunctions.LogPass("Hello");
  }
  
  @Test(priority=1)
  public void h()
  {
	  System.out.println("Hello1");
	  commonfunctions.LogPass("Hello1");
  }
  
  @Test(priority=3)
  public void i()
  {
	  System.out.println("Hello2");
	  commonfunctions.LogPass("Hello2");
  }
  
  @AfterSuite
  public void end()
  {
	 commonfunctions.flush();
  }
  
  
  
  
  
 

}
