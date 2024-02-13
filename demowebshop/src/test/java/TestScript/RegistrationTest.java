package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ReadExcelUtility;
import POMScript.RegistrationPage;
import POMScript.WelcomePage;

public class RegistrationTest extends BaseClass{
@Test(dataProvider = "cred")
public void registration(String fn ,String ln, String em,String pass,String cpass) {
	WelcomePage w= new WelcomePage(driver);
	w.getRegisterlink().click();
	RegistrationPage r=new RegistrationPage(driver);
	r.getRadiobutton().click();
	r.getFirstname().sendKeys(fn);
	r.getLastname().sendKeys(ln);
	r.getEmail().sendKeys(em);
	r.getPassword().sendKeys(pass);
	r.getConfirmpassword().sendKeys(cpass);
	r.getRegisterButton().click();
	
	Reporter.log(cpass);
}
@DataProvider(name="cred")
public Object[][]data() throws EncryptedDocumentException, IOException {
	return ReadExcelUtility.fetcheallthedata("Sheet4");
} 
}
