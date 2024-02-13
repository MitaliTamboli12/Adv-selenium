package POMScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	// Constructor
		public LoginPage(WebDriver driver) {
			super(driver);
	//		PageFactory.initElements(driver, this);
		}

		@FindBy(id = "Email")
	//	@FindAll({@FindBy(id = "Email"),@FindBy(xpath = "//input[@id='Email']")})
		//@FindAll({@FindBy(id = "Value"),@FindBy(xpath = "//input[@id='Email']")})//healing process if one element is not working then second element will work it work as a or operator.
		private WebElement emailTextField;
		
		@FindBy(id="Password")
		//@FindAll({@FindBy(id="password"),@FindBy(xpath = "//input[@id='Password']")})
		private WebElement passwordTextField;
		
		@FindBy(xpath="//input[@value='Log in']")
		private WebElement loginButton;

		public WebElement getEmailTextField() {
			return emailTextField;
		}

		public WebElement getPasswordTextField() {
			return passwordTextField;
		}

		public WebElement getLoginButton() {
			return loginButton;
 }
		
		//Business Logic
		public void LoginFunction() {
			emailTextField.sendKeys("Mitali@gmail.com");
			passwordTextField.sendKeys("Mitali@123");
			loginButton.click();
		}
		
		
		
		
		
		
		
		
		
}
