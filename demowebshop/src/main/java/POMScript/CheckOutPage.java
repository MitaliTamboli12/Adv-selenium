package POMScript;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage {
 public CheckOutPage(WebDriver driver) {
		super(driver);
	}
  @FindBy(id = "BillingNewAddress_FirstName")
  private WebElement FirstName;
  
  @FindBy(id = "BillingNewAddress_LastName")
  private WebElement LastName;
  
  @FindBy(id = "BillingNewAddress_Email")
  private WebElement Email;
  
  @FindBy(id = "BillingNewAddress_Company")
  private WebElement Company;
  
  @FindBy(id = "BillingNewAddress_CountryId")
  private WebElement Country;
  
  @FindBy(id = "BillingNewAddress_StateProvinceId")
  private WebElement State;
  
  @FindBy(id = "BillingNewAddress_City")
  private WebElement City;
  
  @FindBy(id = "BillingNewAddress_Address1")
  private WebElement Address;
  
  @FindBy(id = "BillingNewAddress_Address2")
  private WebElement Address2;
  
  @FindBy(id = "BillingNewAddress_ZipPostalCode")
  private WebElement PostalCode;
  
  @FindBy(id = "BillingNewAddress_PhoneNumber")
  private WebElement PhoneNumber;
  
  @FindBy(id = "BillingNewAddress_FaxNumber")
  private WebElement FaxNumber;
  
  @FindBy(xpath = "//input[@title='Continue']")
  private WebElement Continue;
  
  @FindBy(id = "paymentmethod_0")
  private WebElement PaymentMethod;
  
 @FindBy(xpath = "//input[@value='Continue'and@onclick='PaymentMethod.save()']")
 private WebElement ContinueButton1;
  

public WebElement getFirstName() {
	return FirstName;
}

public WebElement getLastName() {
	return LastName;
}

public WebElement getEmail() {
	return Email;
}

public WebElement getCompany() {
	return Company;
}

public WebElement getCountry() {
	return Country;
}

public WebElement getState() {
	return State;
}

public WebElement getCity() {
	return City;
}

public WebElement getAddress() {
	return Address;
}

public WebElement getAddress2() {
	return Address2;
}

public WebElement getPostalCode() {
	return PostalCode;
}

public WebElement getPhoneNumber() {
	return PhoneNumber;
}

public WebElement getFaxNumber() {
	return FaxNumber;
}

public WebElement getContinue() {
	return Continue;
}
}
