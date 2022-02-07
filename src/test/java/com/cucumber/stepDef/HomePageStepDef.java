package com.cucumber.stepDef;

import com.cucumber.baseSteps.steps.BaseSteps;
import com.cucumber.pages.HomePage;

import cucumber.api.java.en.When;

public class HomePageStepDef extends BaseSteps {

	@When("^I check home page is displayed$")
	public void i_check_home_page_is_displayed() throws Throwable {
		HomePage.verifyHomePage();
	}

	@When("^I hover over \"([^\"]*)\" and choose \"([^\"]*)\"$")
	public void i_hover_over_and_choose(String arg1, String arg2) throws Throwable {
		HomePage.selectAccountingMenuOption(arg2);
	}

}
