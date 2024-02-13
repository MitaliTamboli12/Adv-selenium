package GenericUtility;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class BaseClass extends WebDriverUtility{
	
	  @BeforeSuite
	  public void connectToServer() {
		  Reporter.log("Connection to the Server",true);
	  }
	  @BeforeTest
	  public void connectToDatabase() {
		  Reporter.log("Connection to the Database", true);
	  }
	 
	  @BeforeClass
	  public void openBrowser() throws IOException {
		  driver= new ChromeDriver();
		  maximise();
		  implicitwait();
		  String url=PropertyFileUtility.propertyData("url");
		  getUrl(url);
		  Reporter.log("Open the Browser", true);
	  }
//	  @BeforeMethod
//	  public void login() {
//		 // driver.findElement(By.linkText("Log in")).click();
//		  driver.findElement(By.linkText("Register")).click();
//		  Reporter.log("Registration page open successfully", true);
//	  }
//	  @AfterMethod
//	  public void logout() {
//		  driver.findElement(By.linkText("")).click();
//		  Reporter.log("logout successfully", true);
//	  }
	  @AfterClass
	  public void closeBrowser() {
		  driver.quit();
		  Reporter.log("Close the Browser", true);
	  }
	  @AfterTest
	  public void disconnectToDatabase() {
		  Reporter.log("Disconnect the Database", true);
	  }
	  @AfterSuite
	  public void disconnectToServer() {
		  Reporter.log("Disconnect the Server",true);
	  }
}
