package com.StepRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "noonproject\\src/main/resources\\featurefolder\\cumberdemocart.feature",
		plugin = {"pretty", "html:reports/cucumber-html-reports","json:reports/cucumber-json-report/jsonreport","com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"},
		tags = {"@tc01_selectingitem,@tc02_shownumber,@tc03_sorting,@tc04_storetoexcellsheet,@tc05_storetowishlist"},
		glue = {"com.StepDefinition"},
		monochrome = true
		)
public class Democartrunner {
	@AfterClass
	  public static void extendReport() 
	{
	      Reporter.loadXMLConfig("src\\test\\resources\\extent-config.xml");
	      Reporter.setSystemInfo("user", System.getProperty("user.name"));
	      Reporter.setSystemInfo("os", "Windows");
	      Reporter.setTestRunnerOutput("Sample test runner output message");
	}
	
	
	
	

}
