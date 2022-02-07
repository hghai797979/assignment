package com.cucumber.stepDef;

import com.cucumber.baseSteps.steps.BaseSteps;
import com.cucumber.pages.AddBankAccountPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AddBankAccountStepDef extends BaseSteps {

	@Given("^I check Add Bank Account page is opened$")
	public void i_check_Add_Bank_Account_page_is_opened() throws Throwable {
		AddBankAccountPage.verifyAddBankAccountPage();

	}

	@Then("^I select \"([^\"]*)\"$")
	public void i_select(String arg1) throws Throwable {
		AddBankAccountPage.selectBank(arg1);
	}
}
