package GenericUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility extends WebDriverUtility {
	/**
	 * this method is used to scroll the webpage according to the x axis and y axis
	 * 
	 * @param x
	 * @param y
	 */
	public static void scrollBy(int x, int y) {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + "," + y + ")");
	}

	/**
	 * this method is used to scroll the webpage from the resume point
	 * 
	 * @param x
	 * @param y
	 */
	public static void scrollTo(int x, int y) {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(" + x + "," + y + ")");
	}

	/**
	 * this method is used to scroll the webpage until the element is visible
	 * 
	 * @param b
	 * @param element
	 */
	public static void scrollInToView(boolean b, WebElement element, int index) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[" + index + "].scrollInToView(" + b + ");", element);
	}

	/**
	 * this method is used to click the disabled element
	 * 
	 * @param element
	 */
	public static void clickDisable(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].click();", element);
	}

}
