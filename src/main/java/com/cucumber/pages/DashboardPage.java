package com.cucumber.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cucumber.baseSteps.steps.BaseSteps;
import com.cucumber.extent.ExtentTestManager;

import utils.generalUti;

public class DashboardPage extends BaseSteps {

	@FindBy(xpath = "//button[@data-name='navigation-menu/dashboard']")
	public static WebElement btn_Dashboard;

	@FindBy(xpath = "//button[@data-name='navigation-menu/accounting']")
	public static WebElement btn_Accounting;

	@FindBy(xpath = "//a[contains(text(),'Bank accounts')]")
	public static WebElement lnk_BankAccounts;
	
	// ############################################################################################################
	// Function Name:  clickDashboardLink
	// Input Parameter: 
	// Output Parameter: None
	// Description: To verify the add bank account page 
	// Tester: Hitesh Ghai
	// ############################################################################################################

	public static void clickDashboardLink() {
		try {
			generalUti.waitUntilClickable(btn_Dashboard);
			ExtentTestManager.logInfo(("Button for retirement projection clicked successfully"));
		} catch (Exception e) {
			e.printStackTrace();
			ExtentTestManager.logFail(("Kiwi Saver projection button could not be clicked"));
			Assert.fail();
		}
	}
	
	// ############################################################################################################
	// Function Name:  selectAccountingMenuOption
	// Input Parameter: 
	// Output Parameter: None
	// Description: To verify the add bank account page 
	// Tester: Hitesh Ghai
	// ############################################################################################################

	public static void selectAccountingMenuOption(String menuOption) {
		try {
			//getDriver().findElement(By.xpath("//a[contains(text(),'REF')]".replace("REF", menuOption))).click();
			driver.findElement(By.xpath("//a[contains(text(),'REF')]".replace("REF", menuOption))).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}
	}
}
