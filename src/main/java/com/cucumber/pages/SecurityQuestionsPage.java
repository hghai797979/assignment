package com.cucumber.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cucumber.baseSteps.steps.BaseSteps;
import com.cucumber.extent.ExtentTestManager;

import utils.generalUti;

public class SecurityQuestionsPage extends BaseSteps {
	@FindBy(xpath = "//h1[text()='Answer your security questions to authenticate']")
	public static WebElement hd_SecurityQuestion;

	@FindBy(xpath = "//label[@class='auth-firstquestion xui-text-label xui-fieldlabel-layout']")
	public static WebElement lblSecurityQuestion1;

	@FindBy(xpath = "//input[@data-automationid='auth-firstanswer--input']")
	public static WebElement SecurityQuestion1_inputfield;

	@FindBy(xpath = "//*[text()='As a child, what did you want to be when you grew up?']")
	public static WebElement SecurityQuestion2;

	@FindBy(xpath = "//*[text()='What street did you live on when you were 10 years old?']")
	public static WebElement SecurityQuestion3;

	@FindBy(xpath = "//label[@class='auth-secondquestion xui-text-label xui-fieldlabel-layout']")
	public static WebElement lblSecurityQues2;

	@FindBy(xpath = "//input[@data-automationid='auth-secondanswer--input']")
	public static WebElement SecurityQuestion2_inputfield;

	@FindBy(xpath = "//button[text()='Confirm']")
	public static WebElement btnConfirm;

	public static void verifSecurityQuestionPage() {
		try {
			Assert.assertTrue("User fails to route to home page", generalUti.isElementVisible(hd_SecurityQuestion));
			ExtentTestManager.logPass("User successfully routes to home page");
		} catch (Exception e) {
			e.printStackTrace();
			ExtentTestManager.logFail("User fails to routes to home page");
		}
	}

	public static void enterSecurityAnswers() {

		String Q1text = lblSecurityQuestion1.getText();
		String Q2text = lblSecurityQues2.getText();

		if (Q1text.contains("grew up")) {
			generalUti.enterText(SecurityQuestion1_inputfield, "pilot");
		} else if (Q1text.contains("What street")) {
			generalUti.enterText(SecurityQuestion1_inputfield, "patiala");
		}

		else if (Q1text.contains("favourite place")) {
			generalUti.enterText(SecurityQuestion1_inputfield, "delhi");
		}

		if (Q2text.contains("grew up")) {
			generalUti.enterText(SecurityQuestion2_inputfield, "pilot");
		} else if (Q2text.contains("What street")) {
			generalUti.enterText(SecurityQuestion2_inputfield, "patiala");
		}

		else if (Q2text.contains("favourite place")) {
			generalUti.enterText(SecurityQuestion2_inputfield, "delhi");
		}

		generalUti.click(btnConfirm);

	}

}
