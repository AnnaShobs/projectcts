package com.TestRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\main\\resources\\featurefolder\\cumberdemocart.feature",
		plugin = {"pretty", "html:reports/cucumber-html-reports","json:reports/cucumber-json-report/jsonreport","com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"},
		tags = {"@TC01_selectingitem,@TC02_shownumber,@TC03_sorting,@TC04_storetoexcellsheet,@TC05_storetowishlist"},
		glue = {"com.StepDefinition"},
		monochrome = true
		)
public class TestRunner {
	@AfterClass
	  public static void extendReport() 
	{
	      Reporter.loadXMLConfig("src\\test\\resources\\extend-config.xml");
	      Reporter.setSystemInfo("user", System.getProperty("user.name"));
	      Reporter.setSystemInfo("os", "Windows");
	      Reporter.setTestRunnerOutput("Sample test runner output message");
	}
	
	
	
	

}
