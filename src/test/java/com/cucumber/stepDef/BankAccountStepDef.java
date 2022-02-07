package com.cucumber.stepDef;

import com.cucumber.baseSteps.steps.BaseSteps;
import com.cucumber.pages.BankAccountPage;

import cucumber.api.java.en.When;

public class BankAccountStepDef extends BaseSteps {

	@When("^I check Bank Account page is opened and Add Bank Account button is displayed$")
	public void i_check_Add_Bank_Account_page_is_opened_and_Add_Bank_Account_button_is_displayed() throws Throwable {
		BankAccountPage.verifyBankAccountPage();
	}

	@When("^I click on Add Bank Account button$")
	public void i_click_on_Add_Bank_Account_button() throws Throwable {
		BankAccountPage.clickAddBankAccount();
	}

}
