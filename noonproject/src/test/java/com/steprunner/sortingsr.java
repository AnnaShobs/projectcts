package com.steprunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "noonproject\\src/main/resources\\featurefolder\\cumberdemocart.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@tc03_sorting"},
		glue = {"com.StepDefinition"},
		monochrome = true
		)
public class sortingsr {

}
