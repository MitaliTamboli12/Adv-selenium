package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ReadExcelUtility;
import POMScript.LoginPage;
import POMScript.WelcomePage;

public class LoginTest extends BaseClass {
	@Test(dataProvider = "cred")
	public void login(String em, String pass) {
		WelcomePage w = new WelcomePage(driver);
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
}
