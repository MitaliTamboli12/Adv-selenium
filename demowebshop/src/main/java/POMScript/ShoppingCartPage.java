package POMScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage{

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}
   @FindBy(id = "termsofservice")
   private WebElement termslink;
   
   public WebElement getTermslink() {
	return termslink;
}

public WebElement getCheckoutButton() {
	return checkoutButton;
}
@FindBy(id = "checkout")
   private WebElement checkoutButton;
}
