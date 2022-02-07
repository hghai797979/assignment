package com.cucumber.pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.cucumber.baseSteps.steps.BaseSteps;
import com.cucumber.extent.ExtentTestManager;
import utils.generalUti;

public class BankAccountDetailsPage extends BaseSteps {

	@FindBy(xpath = "//h1[text()='Bank Accounts']")
	public static WebElement hd_BankAccountDetailsPg;

	@FindBy(xpath = "//input[@id='accountname-1025-inputEl']")
	public static WebElement txt_AccountName;

	@FindBy(xpath = "//input[@id='accounttype-1027-inputEl']")
	public static WebElement dropDown_AccType;

	@FindBy(xpath = "//input[@id='accountnumber-1056-inputEl']")
	public static WebElement txt_AccountNum;
	
	
	// ############################################################################################################
	// Function Name:  verifyBankAccountDetailsPage
	// Input Parameter: None
	// Output Parameter: None
	// Description: To verify the display of Bank account details page
	// Tester: Hitesh Ghai
	// ############################################################################################################

	public static void verifyBankAccountDetailsPage() {
		try {
			generalUti.waitUntilElementVisible(hd_BankAccountDetailsPg);
			generalUti.isElementVisible(hd_BankAccountDetailsPg);
			ExtentTestManager.logPass("Bank account details page is displayed");
		} catch (Exception e) {
			e.printStackTrace();
			ExtentTestManager.logFail("Bank account details page is not displayed");
			Assert.fail();
		}
	}
	
	// ############################################################################################################
	// Function Name:  enterBankDetails
	// Input Parameter: accountName,accountNum
	// Output Parameter: None
	// Description: To enter account name, account number based on data passed from feature file
	// Tester: Hitesh Ghai
	// ############################################################################################################

	public static void enterBankDetails(String accountName, String accountNum) {
		try {
			generalUti.enterText(txt_AccountName, accountName);
			generalUti.click(dropDown_AccType);
			dropDown_AccType.sendKeys(Keys.DOWN, Keys.RETURN);
			generalUti.waitUntilElementVisible(txt_AccountNum);
			generalUti.enterText(txt_AccountNum, accountNum);
			ExtentTestManager.logPass("Bank details entered successfully");
		} catch (Exception e) {
			e.printStackTrace();
			ExtentTestManager.logFail("Bank details not entered successfully");
			Assert.fail();
		}

	}
}
