package com.StepDefinition;

import com.Pages.Storetoexcel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Storetoexcelsd {
	Storetoexcel se=new Storetoexcel();
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
	}

	@Then("^the user adds the details of items to excelsheet$")
	public void the_user_adds_the_details_of_items_to_excelsheet() throws Throwable {
	    se.exceldata();
	    Thread.sleep(3000);
	    //se.screenshot("C:\\Users\\User\\eclipse-workspace\\noonproject\\src\\test\\resources\\Screenshots\\img4.png");
	    Thread.sleep(1000);
	    se.closebrowser();
	}

}
