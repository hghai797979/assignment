package com.cucumber.stepDef;

import com.cucumber.baseSteps.steps.BaseSteps;
import com.cucumber.pages.SecurityQuestionsPage;

import cucumber.api.java.en.When;

public class SecurityQuestionsStepDef extends BaseSteps {

	@When("^I check Security questionnarie page is opened$")
	public void i_check_Security_questionnarie_page_is_opened() throws Throwable {
		SecurityQuestionsPage.verifSecurityQuestionPage();
	}

	@When("^I answer the security questions and click on Confirm button$")
	public void i_answer_the_security_questions_and_click_on_Confirm_button() throws Throwable {
		SecurityQuestionsPage.enterSecurityAnswers();
	}

}
