package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.cucumber.baseSteps.steps.BaseSteps;
import com.cucumber.extent.ExtentTestManager;

import utils.generalUti;

public class AddBankAccountPage extends BaseSteps {

	@FindBy(xpath = "//h1[text()='Add Bank Accounts']")
	public static WebElement hd_AddBankAccountPg;

	@FindBy(xpath = "//span[contains(text(),'ANZ')]")
	public static WebElement btn_BankName;

	
	// ############################################################################################################
	// Function Name:  verifyAddBankAccountPage
	// Input Parameter: None
	// Output Parameter: None
	// Description: To verify the display of Add bank account page
	// Tester: Hitesh Ghai
	// ############################################################################################################
	
	public static void verifyAddBankAccountPage() {
		try {
			generalUti.waitUntilElementVisible(hd_AddBankAccountPg);
			generalUti.isElementVisible(hd_AddBankAccountPg);
			ExtentTestManager.logPass(("Add bank account is displayed"));
		} catch (Exception e) {
			e.printStackTrace();
			ExtentTestManager.logFail(("Add bank account is not displayed"));
			Assert.assertTrue(false);
		}
	}

	// ############################################################################################################
	// Function Name:  selectBank
	// Input Parameter: bankName
	// Output Parameter: None
	// Description: To selected bank name based on value passed from feature file
	// Tester: Hitesh Ghai
	// ############################################################################################################
	
	public static void selectBank(String bankName) {
		try {
			generalUti.waitUntilElementVisible(btn_BankName);
			//getDriver().findElement(By.xpath("//span[contains(text(),'" + bankName + "')]")).click();
			driver.findElement(By.xpath("//span[contains(text(),'" + bankName + "')]")).click();
			ExtentTestManager.logInfo(("Bank is selected"));
		} catch (Exception e) {
			e.printStackTrace();
			ExtentTestManager.logFail(("Bank is not selected"));
			Assert.assertTrue(false);
		}

	}

}