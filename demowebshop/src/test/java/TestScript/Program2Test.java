package TestScript;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Program2Test { //extent report with screenshot
@Test
public void testCase() {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	String img=driver.getScreenshotAs(OutputType.BASE64);
	ExtentSparkReporter esr=new ExtentSparkReporter("C:\\Users\\HP\\eclipse-workspace\\demowebshop\\extent report\\import.html");
	ExtentReports er=new ExtentReports();
    er.attachReporter(esr);
   ExtentTest et = er.createTest("Program2Test");
   et.log(Status.INFO, "TestCase Successfully Attached to the reports");
   et.addScreenCaptureFromBase64String(img);
   er.flush();
	driver.quit();

}
}
