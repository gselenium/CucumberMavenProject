package com.edreams.testcases.stepdefinitions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class FlightsBooking {
	@When("user clicked on Flights menu")
	public void user_clicked_on_Flights_menu() {
		System.out.println("user clicked on Flights menu");
	}

	@When("user clicked on Return button")
	public void user_clicked_on_Return_button() {
	   System.out.println("user clicked on Return button");
	}

	@When("user entered departure address as (.*?)")
	public void user_entered_departure_address(String departure) {
	    System.out.println("user entered departure address as "+departure);
	}

	@Then("user entered arrival address as (.*?)")
	public void user_entered_arrival_address(String arrival) {
	   System.out.println("user entered arrival address as "+arrival);
	}

	@Then("user entered departure date as (.*?)")
	public void user_entered_departure_date(String depDate) {
	   System.out.println("user entered departure date as "+depDate);
	}

	@Then("user entered Return date as (.*?)")
	public void user_entered_Return_date(String arrDate) {
		System.out.println("user entered Return date as "+arrDate);
	}

	@Then("user clicked on search Flights Button")
	public void user_clicked_on_search_Flights_Button() {
		System.out.println("user clicked on search Flights Button");
	}
	
	
	@When("user clicked on Multi-City radio button")
	public void user_clicked_on_Multi_City_radio_button() {
	    System.out.println("user clicked on Multi-City radio button");
	}

	@Then("user clicked Add another flight")
	public void user_clicked_Add_another_flight() {
	   System.out.println("user clicked Add another flight");
	}

}
