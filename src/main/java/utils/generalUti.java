package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.cucumber.baseSteps.steps.BaseSteps;

public class generalUti extends BaseSteps {

	public static boolean isElementVisible(WebElement we) {
		if (we.isDisplayed()) {
			return true;
		} else {
			System.out.println("The target is null");
			return false;
		}
	}

	public static void waitUntilElementClickable(WebElement ele) {
		//WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

	public static void waitUntilElementVisible11(WebElement ele) {
		//WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

	// public static void click(WebDriver driver, By by) {
	public static void waitUntilClickable(WebElement ele) {
		try {
			//WebDriverWait wait = new WebDriverWait(getDriver(), 20);
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(ele));
		} catch (Exception ex) {
			ex.getMessage();
		} 
	}

	public static void waitUntilElementVisible(WebElement ele) {
		//WebDriverWait wait = new WebDriverWait(getDriver(), 30);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}

	public static void click(WebElement we) {
		try {
			we.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void enterText(WebElement we, String data) {
		try {
			// getDriver().switchTo().frame(0);
			we.sendKeys(data);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
