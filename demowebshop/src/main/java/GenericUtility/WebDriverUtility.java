package GenericUtility;

import java.time.Duration;
import java.util.Properties;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author HP
 *
 */
public class WebDriverUtility {
	public static WebDriver driver; // for opening the browser
	public static WebDriverWait wait; // for giving explicit wait
	public static Select s; // for dropdown
	public static Actions a; // for mouseover actions
	public static JavascriptExecutor js; // for scrolling action
    public static Properties p; //
    
	/**
	 * this method is used give the url of the webpage
	 * 
	 * @param url
	 */
	public static void getUrl(String url) {
		driver.get(url);
	}

	/**
	 * this method is used to get the Url of the webpage
	 * 
	 * @return
	 */
	public static String currentUrl() {
		return driver.getCurrentUrl();
	}

	/**
	 * this method is used to get the source code of the webpage
	 * 
	 * @return
	 */
	public static String pageSource() {
		return driver.getPageSource();
	}

	/**
	 * this method is used to get the title of the webpage
	 * 
	 * @return
	 */
	public static String title() {
		return driver.getTitle();
	}

	/**
	 * this method is used to get sessionId of current window
	 * 
	 * @return
	 */
	public static String currentwindow() {
		return driver.getWindowHandle();
	}

	/**
	 * this method used to get the sessionId of all the windows
	 * 
	 * @return
	 */
	public static Set<String> allwindow() {
		return driver.getWindowHandles();
	}

	/**
	 * this method is to maximize the webpage
	 */
	public static void maximise() {
		driver.manage().window().maximize();
	}

	/**
	 * this method is use dto minimise the webpage
	 */
	public static void minimise() {
		driver.manage().window().maximize();
	}

	/**
	 * this method is to navigate to forward page of the application
	 */
	public static void forward() {
		driver.navigate().forward();
	}

	/**
	 * this method is used to navigate to backpage of the application
	 */
	public static void backward() {
		driver.navigate().back();
	}

	/**
	 * this method is used to refresh the webpage
	 */
	public static void refresh() {
		driver.navigate().refresh();
	}

	/**
	 * this method is to navigate to the application
	 * 
	 * @param url
	 */
	public static void toUrl(String url) {
		driver.navigate().to(url);
	}

	/**
	 * this method is used to close the browser
	 */
	public static void closeWindow() {
		driver.close();
	}

	/**
	 * this method is used to close the browser and stop the server
	 */
	public static void quitWindow() {
		driver.quit();
	}
	/**
	 * this method is used to load the element for given period of time
	 */
	public static void implicitwait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	/**
	 * this method is used to wait until the element is visible
	 * 
	 * @param element
	 */
	public static void Explicitwait(WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * this method is used to select the option from the dropdown using index value
	 * 
	 * @param i
	 * @param element
	 */
	public static void dropDown(int i, WebElement element) {
		s = new Select(element);
		s.selectByIndex(i);
	}

	/**
	 * this method is used to select the option from the dropdown using attribute
	 * value
	 * 
	 * @param value
	 * @param element
	 */
	public static void dropDown(String value, WebElement element) {
		s = new Select(element);
		s.selectByValue(value);
	}

	/**
	 * this method is used to select the option from the dropdown by using text
	 * function
	 * 
	 * @param element
	 * @param visibletext
	 */
	public static void dropDown(WebElement element, String visibletext) {
		s = new Select(element);
		s.selectByVisibleText(visibletext);
	}

	/**
	 * this method is used to move the cursor to the targeted webelement
	 * 
	 * @param element
	 */
	public static void moveCursor(WebElement element) {
		a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	/**
	 * this method is used to do the right click on the targeted webelement
	 * 
	 * @param element
	 */
	public static void rightClick(WebElement element) {
		a = new Actions(driver);
		a.contextClick(element).perform();
	}

	/**
	 * this method is used to do the double click on the targeted webelement
	 * 
	 * @param element
	 */
	public static void doubleClick(WebElement element) {
		a = new Actions(driver);
		a.doubleClick(element).perform();
	}

	/**
	 * this method is used to drag the source element and place in to the
	 * destination point
	 * 
	 * @param source
	 * @param destination
	 */
	public static void dragAndDrop(WebElement source, WebElement destination) {
		a = new Actions(driver);
		a.dragAndDrop(source, destination).perform();
	}

	/**
	 * this method is used to click on the targeted webelement
	 * 
	 * @param element
	 */
	public static void clickElement(WebElement element) {
		a = new Actions(driver);
		a.click(element).perform();
	}

	/**
	 * this method is used to click anywhere in the webpage
	 */
	public static void clickElement() {
		a = new Actions(driver);
		a.click().perform();
	}
}
