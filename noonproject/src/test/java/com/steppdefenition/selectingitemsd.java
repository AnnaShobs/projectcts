package com.steppdefenition;

import com.pages.selectingitem;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class selectingitemsd {
	selectingitem s=new selectingitem();
	@Given("^the user launched the chrome browser$")
	public void the_user_launched_the_chrome_browser() throws Throwable {
		s.url();
	}

	@When("^the user opens the OPenCart homepage$")
	public void the_user_opens_the_OPenCart_homepage() throws Throwable {
		s.HomePage();
	}

	@Then("^the user select desktop$")
	public void the_user_select_desktop() throws Throwable {
		s.desktopselect();
	}

	@Then("^the user select on the item$")
	public void the_user_select_on_the_item() throws Throwable {
		s.item();
		Thread.sleep(3000);
		s.screenshot("C:\\Users\\User\\eclipse-workspace\\noonproject\\src\\test\\resources\\Screenshots\\img1.png");
		Thread.sleep(3000);
		s.closebrowser();
	}

}