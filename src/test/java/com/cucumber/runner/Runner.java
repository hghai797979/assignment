package com.cucumber.runner;

import org.testng.annotations.Test;
//import com.cucumber.baseSteps.steps.BaseSteps1;
import com.cucumber.baseSteps.steps.BaseSteps;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
		//features="src/test/resources/Feature_KSRetirementCalculator",
		features="src/test/resources/Features_Xero",
		glue={"com.cucumber.stepDef"}
		//dryRun=true
		)
public class Runner extends BaseSteps{
	@Test
	public void runCuke()
	{
		new TestNGCucumberRunner(getClass()).runCukes();		
	}
}
