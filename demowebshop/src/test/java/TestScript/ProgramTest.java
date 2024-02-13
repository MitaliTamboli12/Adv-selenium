package TestScript;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ProgramTest {//extend report 
@Test
public void testCase() {
	ExtentSparkReporter esr=new ExtentSparkReporter("C:\\Users\\HP\\eclipse-workspace\\demowebshop\\extent report\\import.html");
	ExtentReports er=new ExtentReports();
    er.attachReporter(esr);
   ExtentTest et = er.createTest("ProgramTest");
   et.log(Status.INFO, "TestCase Successfully Attached to the reports");
   er.flush();
}
}
