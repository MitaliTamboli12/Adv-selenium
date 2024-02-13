package POMScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DigitalDownloadPage extends BasePage {

	public DigitalDownloadPage(WebDriver driver) {
		super(driver);
	}
   
   @FindBy(xpath = "//a[text()='3rd Album']/../../..//input[@value='Add to cart']")
   private WebElement product1;
   
   @FindBy(xpath = "(//a[text()='Music 2'])[2]/../../..//input[@value='Add to cart']")
   private WebElement product2;
   
   @FindBy(xpath = "(//a[text()='Music 2'])[3]/../../..//input[@value='Add to cart']")
   private WebElement product3;


public WebElement getProduct1() {
	return product1;
}

public WebElement getProduct2() {
	return product2;
}

public WebElement getProduct3() {
	return product3;
}
   
}
