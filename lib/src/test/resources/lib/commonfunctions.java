package lib;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class commonfunctions {
	
	static ExtentReports extent;
	static ExtentTest test;
	
	public static void extentreport()
	{
		extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Result.html");
		extent.attachReporter(spark);
		test = extent.createTest("Test");
	}
	
	public void managechromedriverbinary()
	{
		// Automatically manage ChromeDriver binary
				WebDriverManager.chromedriver().browserVersion("126.0.6478.127").setup();
	}
	
	public static void LogPass(String msg)
	{
		test.pass(msg);
	}
	public void LogFail(String msg)
	{
		test.fail(msg);
	}
	
	public static void flush()
	{
		extent.flush();
	}

}
