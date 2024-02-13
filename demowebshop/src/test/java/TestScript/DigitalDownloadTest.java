package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ReadExcelUtility;
import POMScript.DigitalDownloadPage;
import POMScript.LoginPage;
import POMScript.WelcomePage;

public class DigitalDownloadTest extends BaseClass{
	public static 	WelcomePage w ;
	@Test(dataProvider = "cred" ,priority = 1)
	public void login(String em, String pass) {
		 w = new WelcomePage(driver);
		w.getLoginlink().click();
		LoginPage l = new LoginPage(driver);
		l.getEmailTextField().sendKeys(em);
		l.getPasswordTextField().sendKeys(pass);
		l.getLoginButton().click();
	}

	@DataProvider(name = "cred")
	public Object[][] data() throws EncryptedDocumentException, IOException {
		return ReadExcelUtility.fetcheallthedata("Sheet2");
	}
@Test(priority = 2)
public void digitalDownload() throws InterruptedException {
	 w = new WelcomePage(driver);
	w.getDigitaldownloadpage().click();
	DigitalDownloadPage d=new DigitalDownloadPage(driver);
	d.getProduct1().click();
	Thread.sleep(2000);
	
}
}
