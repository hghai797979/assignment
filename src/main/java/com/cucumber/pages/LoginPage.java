package com.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.cucumber.baseSteps.steps.BaseSteps;
import com.cucumber.extent.ExtentTestManager;
import utils.generalUti;

public class LoginPage extends BaseSteps {
	@FindBy(xpath = "//h2[text()='Log in to Xero']")
	public static WebElement lbl_Login;

	@FindBy(xpath = "//input[@data-automationid='Username--input']")
	public static WebElement txt_EmailAddd;

	@FindBy(xpath = "//input[@data-automationid='PassWord--input']")
	public static WebElement txt_Password;

	@FindBy(xpath = "//button[@value='login']")
	public static WebElement btn_login;

	@FindBy(xpath = "(//div//abbr[@role='presentation'])[1]")
	public static WebElement tag_Profile;

	@FindBy(xpath = "(//a[text()='Log out'])[1]")
	public static WebElement lnk_logout;

	// ############################################################################################################
	// Function verifLoginPage
	// Input Parameter: None
	// Output Parameter: None
	// Description: To verify whether user successfully lands on login page
	// Tester:
	// ############################################################################################################
	public static void verifLoginPage() {
		try {
			Assert.assertTrue(generalUti.isElementVisible(lbl_Login));
			ExtentTestManager.logPass("User successfully routes to login page");
		} catch (Exception e) {
			e.printStackTrace();
			ExtentTestManager.logFail("User fails to routes to login page");
		}
	}

	// ############################################################################################################
	// Function loginIntoApp
	// Input Parameter: emailAddress,password
	// Output Parameter: None
	// Description: To enter login details to login into application
	// Tester: Hitesh Ghai
	// ############################################################################################################

	public static void loginIntoApp(String emailAddress, String password) {
		try {
			generalUti.enterText(txt_EmailAddd, emailAddress);
			generalUti.enterText(txt_Password, password);
			generalUti.click(btn_login);
			ExtentTestManager.logInfo("User sucessfully login into app");
		} catch (Exception e) {
			e.printStackTrace();
			ExtentTestManager.logFail("User fails to login into app");
			Assert.fail();
		}
	}
	// ############################################################################################################
	// Function logOut
	// Input Parameter:
	// Output Parameter: None
	// Description: To log out from application
	// Tester: Hitesh Ghai
	// ############################################################################################################
	
	public static void logOut() {
		try {
			generalUti.click(tag_Profile);
			generalUti.click(lnk_logout);
			ExtentTestManager.logInfo("User sucessfully logs out successfully");
		} catch (Exception e) {
			e.printStackTrace();
			ExtentTestManager.logFail("User fails to log out");
			Assert.fail();
		}
	}

}
