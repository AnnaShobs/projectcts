package com.StepDefinition;

import com.Pages.Wishlist;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Wishlist_Stepdefinition {
	Wishlist w=new Wishlist();
	@Given("^the user launched the chrome session$")
	public void the_user_launched_the_chrome_session() throws Throwable {
		w.url("chrome");
	}

	@When("^the user opens the OPenCart windowpage$")
	public void the_user_opens_the_OPenCart_windowpage() throws Throwable {
		w.HomePage();
	}

	@Then("^the user select desktop buttonclick$")
	public void the_user_select_desktop_buttonclick() throws Throwable {
		w.desktopselect();
	}

	@Then("^the item to wishlist$")
	public void the_item_to_wishlist() throws Throwable {
		w.wish();
		Thread.sleep(3000);
		w.screenshot("src\\test\\resources\\Screenshots\\img5.png");
		Thread.sleep(3000);
		w.closebrowser();
	}


}
