package com.StepDefinition;

import com.Pages.StoreToExcel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StoreToExcel_Stepdefinition {
	StoreToExcel se=new StoreToExcel();
	@Given("^the user launched the chrome page$")
	public void the_user_launched_the_chrome_page() throws Throwable {
	   se.url("chrome");
	}

	@When("^the user opens the OPenCart window$")
	public void the_user_opens_the_OPenCart_window() throws Throwable {
	    se.HomePage();
	}

	@Then("^the user select desktop button$")
	public void the_user_select_desktop_button() throws Throwable {
	   se.desktopselect();
	   Thread.sleep(3000);
	   se.screenshot("src\\test\\resources\\Screenshots\\img4.png");
	}

	@Then("^the user adds the details of items to excelsheet$")
	public void the_user_adds_the_details_of_items_to_excelsheet() throws Throwable {
		
		se.exceldata();
	    Thread.sleep(3000);
	    
	    Thread.sleep(1000);
	    se.closebrowser();
	}

}
