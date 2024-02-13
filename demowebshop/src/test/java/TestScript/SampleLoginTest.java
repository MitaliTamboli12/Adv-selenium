package TestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import POMScript.LoginPage;
import POMScript.WelcomePage;

public class SampleLoginTest extends BaseClass{
	public class LoginTest {
		WelcomePage w;
		LoginPage l;
		@Test
		public void testCase() {
			String username=System.getProperty("username");
			String password=System.getProperty("password");
			 w= new WelcomePage(driver);
			w.getLogoutlink().click();
			w.getLoginlink().click();
		 l= new LoginPage(driver);
			l.getEmailTextField().sendKeys(username);
			l.getPasswordTextField().sendKeys(password);
			l.getLoginButton().click();
			Reporter.log(username,true);
			Reporter.log(password,true);
			
		}
	}
}
