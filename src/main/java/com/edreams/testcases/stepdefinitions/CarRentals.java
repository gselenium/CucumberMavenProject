package com.edreams.testcases.stepdefinitions;
import com.edreams.pages.carrental.CarRentalPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class CarRentals {
	public CarRentalPage carRental;
	
	@When("user clicked on Car rentals menu")
	public void user_clicked_on_Car_rentals_menu() throws InterruptedException {
	  System.out.println("user clicked on Car rentals menu");
	  carRental = new CarRentalPage();
	  carRental.clickCarRenatals();	  
	}

	@When("user entered city as (.*?)")
	public void user_entered_city(String city) throws InterruptedException {
	   System.out.println("user entered city as "+city);
	   carRental = new CarRentalPage();
	   carRental.typePickupLocation(city);
	}

	@When("user entered start date as (.*?)")
	public void user_entered_start_date(String startDate) throws InterruptedException {
	    System.out.println("user entered start date as "+startDate);
	    carRental = new CarRentalPage();
		carRental.clickStartDate();
	}

	@Then("user entered end date as (.*?)")
	public void user_entered_end_date(String endDate) throws InterruptedException{
		System.out.println("user entered end date as "+endDate);
		carRental = new CarRentalPage();
		carRental.clickStartDate();
	}

	@Then("user clicked on Search Cars Button")
	public void user_clicked_on_Search_Cars_Button() throws InterruptedException {
	    System.out.println("user clicked on Search Cars Button");
	    carRental = new CarRentalPage();
		carRental.clickSearchCarsButton();
	}
	
}
