package com.StepDefinition;

import com.Pages.Shownumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Shownumber_Stepdefinition {
	Shownumber sn=new Shownumber();
	@Given("^the user launched the chrome$")
	public void the_user_launched_the_chrome() throws Throwable {
		sn.url("chrome");
	}

	@When("^the user opens the OPenCart$")
	public void the_user_opens_the_OPenCart() throws Throwable {
		sn.HomePage();
	}

	@Then("^the user select desktop icon$")
	public void the_user_select_desktop_icon() throws Throwable {
		sn.desktopselect();
	}

	@Then("^the user selects the number$")
	public void the_user_selects_the_number() throws Throwable {
		sn.shownumbers();
		Thread.sleep(3000);
		sn.screenshot("src\\test\\resources\\Screenshots\\img2.png");
		Thread.sleep(2000);
		sn.closebrowser();
	}


}
