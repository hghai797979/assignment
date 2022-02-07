package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.cucumber.baseSteps.steps.BaseSteps;
import com.cucumber.extent.ExtentTestManager;

import utils.generalUti;

public class HomePage extends BaseSteps {

	@FindBy(xpath = "//a[@data-name='navigation-menu/dashboard']")
	public static WebElement btn_Dashboard;

	@FindBy(xpath = "//button[@data-name='navigation-menu/accounting']")
	public static WebElement btn_Accounting;

	@FindBy(xpath = "//a[contains(text(),'Bank accounts')]")
	public static WebElement lnk_BankAccounts;
	
	// ############################################################################################################
	// Function Name:  verifyHomePage
	// Input Parameter: 
	// Output Parameter: None
	// Description: To verify the add bank account page 
	// Tester: Hitesh Ghai
	// ############################################################################################################

	public static void verifyHomePage() {
		try {
			generalUti.waitUntilElementVisible(btn_Dashboard);
			generalUti.isElementVisible(btn_Dashboard);
			ExtentTestManager.logInfo(("Xero Home page is displayed"));
		} catch (Exception e) {
			e.printStackTrace();
			ExtentTestManager.logFail(("Xero Home page is not displayed"));
			Assert.assertTrue(false);
		}
	}
	
	// ############################################################################################################
	// Function Name:  selectAccountingMenuOption
	// Input Parameter: menuOption
	// Output Parameter: None
	// Description: To select menu option such as 'Bank Accounts' or 'Reports' based on data passed from feature file
	// Tester: Hitesh Ghai
	// ############################################################################################################

	public static void selectAccountingMenuOption(String menuOption) {
		try {
			generalUti.click(btn_Accounting);
			//getDriver().findElement(By.xpath("//a[contains(text(),'REF')]".replace("REF", menuOption))).click();
			driver.findElement(By.xpath("//a[contains(text(),'REF')]".replace("REF", menuOption))).click();
			ExtentTestManager.logInfo(("Bank Account option is selected"));
		} catch (Exception e) {
			e.printStackTrace();
			ExtentTestManager.logFail(("Bank Accounting option is not selected"));
			Assert.assertTrue(false);
		}
	}
}