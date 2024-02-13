package POMScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BasePage {
	public RegistrationPage(WebDriver driver) {
		super(driver);
		// PageFactory.initElements(driver, this);
	}

	@FindBy(id = "gender-male")
	private WebElement radiobutton;

	@FindBy(id = "FirstName")
	private WebElement firstname;

	@FindBy(id = "LastName")
	private WebElement lastname;

	@FindBy(id = "Email")
	private WebElement email;

	@FindBy(id = "Password")
	private WebElement password;

	@FindBy(id = "ConfirmPassword")
	private WebElement confirmpassword;

	@FindBy(id = "register-button")
	private WebElement registerButton;

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmpassword() {
		return confirmpassword;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}
   //business logic
	public void registerFunction() {
		radiobutton.click();
        firstname.sendKeys("java");
        lastname.sendKeys("python");
        email.sendKeys("pytho1234njava@gmail.com");
        password.sendKeys("pytho1234njava@9876");
        confirmpassword.sendKeys("pytho1234njava@9876");
        registerButton.click();
	}
}
