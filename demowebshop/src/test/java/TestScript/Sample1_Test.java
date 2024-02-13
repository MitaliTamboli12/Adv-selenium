package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ReadExcelUtility;

public class Sample1_Test extends BaseClass {
@Test(dataProvider = "cred")
public static void testCase(String username,String paasword) {
	Reporter.log("sample test is executing",true);
	
	Reporter.log(username,true);
	Reporter.log(paasword,true);
}
	@DataProvider(name="cred")
	public Object[][]data() throws EncryptedDocumentException, IOException {
		return ReadExcelUtility.fetcheallthedata("Sheet2");
	} 
 
}
