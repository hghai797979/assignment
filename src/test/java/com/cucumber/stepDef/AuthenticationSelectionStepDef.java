package com.cucumber.stepDef;

import com.cucumber.baseSteps.steps.BaseSteps;
import com.cucumber.pages.AuthenticationPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class AuthenticationSelectionStepDef extends BaseSteps {
	
	@Given("^I check Authentication Selection page is opened$")
	public void i_check_Authentication_Selection_page_is_opened() throws Throwable {
		AuthenticationPage.verifyAuthenticationPage();
	}

	@When("^I choose a backup method instead$")
	public void i_choose_a_backup_method_instead() throws Throwable {
		AuthenticationPage.clickBackUpMethodBtn();

	}

}
