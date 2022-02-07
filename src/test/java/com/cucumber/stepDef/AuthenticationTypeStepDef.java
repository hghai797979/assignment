package com.cucumber.stepDef;

import com.cucumber.baseSteps.steps.BaseSteps;
import com.cucumber.pages.AuthenticationPage;

import cucumber.api.java.en.When;

public class AuthenticationTypeStepDef extends BaseSteps {

	@When("^I check Authentication type page is opened$")
	public void i_check_Authentication_type_page_is_opened() throws Throwable {
		AuthenticationPage.verifSecurityAuthPage();
	}

	@When("^I click on security questions option$")
	public void i_click_on_security_questions_option() throws Throwable {
		AuthenticationPage.selectAuthenticationOption();
	}

}
