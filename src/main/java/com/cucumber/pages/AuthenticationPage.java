package com.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import com.cucumber.baseSteps.steps.BaseSteps;
import com.cucumber.extent.ExtentTestManager;
import utils.generalUti;

public class AuthenticationPage extends BaseSteps {

	@FindBy(xpath = "//p[text()='Accept it to authenticate your login']")
	public static WebElement hd_Auth;

	@FindBy(xpath = "//button[text()='Use a backup method instead']")
	public static WebElement btn_BackUpMethod;

	@FindBy(xpath = "//h1[text()='How would you like to authenticate?']")
	public static WebElement hd_authentSecurty;

	@FindBy(xpath = "(//*[text()='Security questions'])[1]")
	public static WebElement btn_securityQuestions;

	// ############################################################################################################
	// Function Name:verifyAuthenticationPage
	// Input Parameter: None
	// Output Parameter: None
	// Description: To verify whether user successfully lands on Authentication page
	// Tester: Hitesh Ghai
	// ############################################################################################################
	public static void verifyAuthenticationPage() {
		try {
			Assert.assertTrue(generalUti.isElementVisible(hd_Auth));
			ExtentTestManager.logPass("User successfully routes to Authentication page");
		} catch (Exception e) {
			e.printStackTrace();
			ExtentTestManager.logFail("User fails to routes to Authentication page");
			Assert.fail();
		}
	}

	// ############################################################################################################
	// Function Name:  clickBackUpMethodBtn
	// Input Parameter: None
	// Output Parameter: None
	// Description: To click on 'Use a backup method instead button
	// Tester: Hitesh Ghai
	// ############################################################################################################

	public static void clickBackUpMethodBtn() {
		try {
			generalUti.click(btn_BackUpMethod);
			ExtentTestManager.logInfo("Backup method button clicked succesfully");
		} catch (Exception e) {
			e.printStackTrace();
			ExtentTestManager.logFail("Backup method button is not clicked");
			Assert.fail();
		}
	}
	
	// ############################################################################################################
	// Function Name:  verifSecurityAuthPage
	// Input Parameter: None
	// Output Parameter: None
	// Description: To click on 'Use a backup method instead button
	// Tester: Hitesh Ghai
	// ############################################################################################################

	public static void verifSecurityAuthPage() {
		try {
			Assert.assertTrue(generalUti.isElementVisible(hd_authentSecurty));
			ExtentTestManager.logPass("User successfully routes to Security Authentication page");
		} catch (Exception e) {
			e.printStackTrace();
			ExtentTestManager.logFail("User fails to route to Security Authentication page");
			Assert.fail();
		}
	}
	
	// ############################################################################################################
	// Function Name:  selectAuthenticationOption
	// Input Parameter: None
	// Output Parameter: None
	// Description: To select authentication option
	// Tester: Hitesh Ghai
	// ############################################################################################################

	public static void selectAuthenticationOption() {
		try {
			generalUti.click(btn_securityQuestions);
			ExtentTestManager.logInfo("Authentication option selected successfully");
		} catch (Exception e) {
			e.printStackTrace();
			ExtentTestManager.logFail("Authentication option is not selected");
			Assert.fail();
		}
	}

}
