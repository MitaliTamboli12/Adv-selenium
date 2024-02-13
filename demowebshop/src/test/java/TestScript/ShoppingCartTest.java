package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ReadExcelUtility;
import POMScript.CheckOutPage;
import POMScript.LoginPage;
import POMScript.ShoppingCartPage;
import POMScript.WelcomePage;

public class ShoppingCartTest extends BaseClass {
	public static WelcomePage w;
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
	public void shoppingcart() {
		w.getShoppingcartlink().click();
		ShoppingCartPage s= new ShoppingCartPage(driver);
		s.getTermslink().click();
		s.getCheckoutButton().click();
	}
	@Test(priority = 3)
	public void checkout() throws InterruptedException {
		CheckOutPage c=new CheckOutPage(driver);
		c.getContinue().click();
		Thread.sleep(3000);
	}
	
}
