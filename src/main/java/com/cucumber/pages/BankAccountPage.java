package com.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.cucumber.baseSteps.steps.BaseSteps;
import com.cucumber.extent.ExtentTestManager;
import utils.generalUti;

public class BankAccountPage extends BaseSteps {

	@FindBy(xpath = "//span[text()='Bank accounts']")
	public static WebElement hd_BankAccountPg;

	@FindBy(xpath = "//span[text()='Add Bank Account']")
	public static WebElement btn_AddBankAccount;
	
	// ############################################################################################################
	// Function Name:  verifyBankAccountPage
	// Input Parameter: 
	// Output Parameter: None
	// Description: To verify the add bank account page 
	// Tester: Hitesh Ghai
	// ############################################################################################################

	public static void verifyBankAccountPage() {
		try {
			generalUti.waitUntilElementVisible(hd_BankAccountPg);
			generalUti.isElementVisible(hd_BankAccountPg);
			ExtentTestManager.logInfo(("Add bank account page is displayed"));
		} catch (Exception e) {
			e.printStackTrace();
			ExtentTestManager.logFail("Add bank account is not displayed");
			Assert.fail();
		}
	}
	
	// ############################################################################################################
	// Function Name:  clickAddBankAccount
	// Input Parameter: 
	// Output Parameter: None
	// Description: To click Add bank account button
	// Tester: Hitesh Ghai
	// ############################################################################################################

	public static void clickAddBankAccount() {
		try {
			generalUti.click(btn_AddBankAccount);
			ExtentTestManager.logInfo("Add bank button is clicked");
		} catch (Exception e) {
			e.printStackTrace();
			ExtentTestManager.logFail("Add bank button is not clicked");
			Assert.fail();
		}
	}
}
