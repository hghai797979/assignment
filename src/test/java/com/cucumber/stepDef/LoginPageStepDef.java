package com.cucumber.stepDef;

import com.cucumber.baseSteps.steps.BaseSteps;
import com.cucumber.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginPageStepDef extends BaseSteps {
	LoginPage loginPg = null;

	@Given("^I launch browser \"([^\"]*)\" and access Xero site$")
	public void i_launch_browser_and_access_Xero_site(String browserName) throws Throwable {
		openBrowser(browserName);
		//getDriver().navigate().to(BaseSteps.appURL);
		driver.navigate().to(BaseSteps.appURL);
	}

	@Given("^I am on login page$")
	public void i_am_on_login_page() throws Throwable {
		LoginPage.verifLoginPage();
	}

	@Given("^I enter \"([^\"]*)\" and \"([^\"]*)\" and press login button$")
	public void i_enter_and_and_press_login_button(String emailAddr, String password) throws Throwable {
		LoginPage.loginIntoApp(emailAddr, password);
	}

	@Then("^I log out from the application$")
	public void i_log_out_from_the_application() throws Throwable {
		LoginPage.logOut();
	}

}
