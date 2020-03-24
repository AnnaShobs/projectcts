package com.steppdefenition;

import com.pages.sorting;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sortingsd {
	sorting k=new sorting();
	@Given("^the user launched the chrome window$")
	public void the_user_launched_the_chrome_window() throws Throwable {
		k.url();
	}

	@When("^the user opens the OPenCart page$")
	public void the_user_opens_the_OPenCart_page() throws Throwable {
		k.HomePage();
	}

	@Then("^the user select desktop iccon$")
	public void the_user_select_desktop_iccon() throws Throwable {
		k.desktopselect();
	}

	@Then("^the user selects the type of sorting$")
	public void the_user_selects_the_type_of_sorting() throws Throwable {
		k.sorting();
		Thread.sleep(3000);
		k.screenshot("C:\\Users\\User\\eclipse-workspace\\noonproject\\src\\test\\resources\\Screenshots\\img3.png");
		Thread.sleep(2000);
		k.closebrowser();
	}

}
