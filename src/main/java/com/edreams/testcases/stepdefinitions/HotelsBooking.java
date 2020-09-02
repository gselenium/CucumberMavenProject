package com.edreams.testcases.stepdefinitions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class HotelsBooking {
	@When("user clicked on Hotels menu")
	public void user_clicked_on_Hotels_menu() {
	   System.out.println("user clicked on Hotels menu");	   
	}

	@When("user entered where you are going as (.*?)")
	public void user_entered_where_you_are_going(String wheregoing) {
	   System.out.println("user entered where you are going as "+wheregoing);
	}

	@When("user entered checkin date as (.*?)")
	public void user_entered_checkin_date(String checkinDate) {
	  System.out.println("user entered checkin date as "+checkinDate);
	}

	@Then("user entered checkout date as (.*?)")
	public void user_entered_checkout_date(String checkoutDate) {
	    System.out.println("user entered checkout date as "+checkoutDate);
	}

	@Then("user clicked on Search Button")
	public void user_clicked_on_Search_Button() {
	   System.out.println("user clicked on Search Button");
	}
}
