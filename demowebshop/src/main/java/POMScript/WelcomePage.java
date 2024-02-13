package POMScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage extends BasePage {
	
 public WelcomePage(WebDriver driver) {
	 super(driver);
//	PageFactory.initElements(driver, this);
}
 @FindBy(linkText="Register")
  private WebElement Registerlink;
 
 @FindBy(linkText="Log in")
 private WebElement loginlink;
 
 @FindBy(linkText="Shopping cart")
 private WebElement shoppingcartlink;
 
 @FindBy(linkText = "Wishlist")
 private WebElement whishlistlink;
 
 @FindBy(linkText = "Log out")
 private WebElement logoutlink;
 
 @FindBy(partialLinkText = "Digital downloads")
 private WebElement digitaldownloadpage;

public WebElement getDigitaldownloadpage() {
	return digitaldownloadpage;
}

public WebElement getRegisterlink() {
	return Registerlink;
}

public WebElement getLoginlink() {
	return loginlink;
}

public WebElement getShoppingcartlink() {
	return shoppingcartlink;
}

public WebElement getWhishlistlink() {
	return whishlistlink;
}

public WebElement getLogoutlink() {
	return logoutlink;
}
}
