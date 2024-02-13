package TestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import POMScript.LoginPage;
import POMScript.WelcomePage;

public class Sample4Test extends BaseClass {

	
	@Test
	public void testCase() {
		
		String username=System.getProperty("username");
		String password=System.getProperty("password");
		 WelcomePage w = new WelcomePage(driver);
	//	w.getLogoutlink().click();
		w.getLoginlink().click();
	 LoginPage l = new LoginPage(driver);
		l.getEmailTextField().sendKeys(username);
		l.getPasswordTextField().sendKeys(password);
		l.getLoginButton().click();
		Reporter.log(username,true);
		Reporter.log(password,true);
	}
}
