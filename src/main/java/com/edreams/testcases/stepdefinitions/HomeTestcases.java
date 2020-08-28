package com.edreams.testcases.stepdefinitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class HomeTestcases {
	
	@Given("user opened browser as (.*?)")
	public void user_opened_browser(String browser) {
	   System.out.println("User opened browser as "+browser);
	}

	@Then("user navigated the url as (.*?)")
	public void user_navigated_the_url(String url) {
		System.out.println("user navigated the url as "+url);
	}

	@When("user clicked on myaccount menu")
	public void user_clicked_on_myaccount_menu() {
	   System.out.println("user clicked on myaccount menu");
	}

	@When("user clicked on login button")
	public void user_clicked_on_login_button() {
	   System.out.println("user clicked on login button");
	}

	@When("user entered email address as (.*?)")
	public void user_entered_email_address(String email) {
	   System.out.println("user entered email address as "+email);
	}

	@Then("user entered password as (.*?)")
	public void user_entered_password(String pass) {
	   System.out.println("user entered password as "+pass);
	}

	@Then("user clicked on signin button")
	public void user_clicked_on_signin_button() {
	   System.out.println("user clicked on signin button");
	}
	
	
	@When("user clicked on create it now link")
	public void user_clicked_on_create_it_now_link() {
	   System.out.println("user clicked on create it now link");
	}

	@Then("user clicked on create your account button")
	public void user_clicked_on_create_your_account_button() {
	   System.out.println("user clicked on create your account button");
	}

}
