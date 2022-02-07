package com.cucumber.stepDef;

import com.cucumber.pages.BankAccountDetailsPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BankAccountDetailsStepDef {
	
	@Given("^I check Bank Account details page is opened$")
	public void i_check_Bank_Account_details_page_is_opened() throws Throwable {
		BankAccountDetailsPage.verifyBankAccountDetailsPage();
	}
	
	@Then("^I enter \"([^\"]*)\", \"([^\"]*)\" and choose \"([^\"]*)\"$")
	public void i_enter_and_choose(String arg1, String arg2, String arg3) throws Throwable {
		BankAccountDetailsPage.enterBankDetails(arg1, arg2);
	}
}
