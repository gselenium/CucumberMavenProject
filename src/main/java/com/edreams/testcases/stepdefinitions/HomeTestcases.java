package com.edreams.testcases.stepdefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.edreams.pages.home.HomePage;
import com.edreams.pages.home.RegistrationPage;
import com.edreams.util.BaseWebdriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class HomeTestcases {
	public HomePage home;
	public RegistrationPage register;
	
	@Given("user opened browser as (.*?)")
	public void user_opened_browser(String browser) throws InterruptedException {
	   System.out.println("User opened browser as "+browser);	  
	   new BaseWebdriver().openBrowser(browser);
	}
	
	@Given("user closed the browser")
	public void user_closed_browser(){
	   System.out.println("User closed the browser");
	   new BaseWebdriver().closeBrowser();
	}

	@Then("user navigated the url as (.*?)")
	public void user_navigated_the_url(String url) {
		System.out.println("user navigated the url as "+url);
		 new BaseWebdriver().navigateUrl(url);
	}

	@When("user clicked on myaccount menu")
	public void user_clicked_on_myaccount_menu() throws InterruptedException {
	   System.out.println("user clicked on myaccount menu");
	   //driver.findElement(By.xpath("//*[@class='login_not_logged']")).click();
	   home = new HomePage();
	   home.clickMyAccountMenu();	   
	}

	@When("user clicked on login button")
	public void user_clicked_on_login_button() throws InterruptedException{
	   System.out.println("user clicked on login button");
	   home = new HomePage();
	   home.clickLoginButton();
	   Thread.sleep(2000);
	}

	@When("user entered email address as (.*?)")
	public void user_entered_email_address(String email) {
	   System.out.println("user entered email address as "+email);
	   home = new HomePage();
	   home.typeEmailAddress(email);
	}

	@Then("user entered password as (.*?)")
	public void user_entered_password(String pass) {
	   System.out.println("user entered password as "+pass);
	   home = new HomePage();
	   home.typePassword(pass);
	}

	@Then("user clicked on signin button")
	public void user_clicked_on_signin_button() {
	   System.out.println("user clicked on signin button");
	   home = new HomePage();
	   home.clickSigninButton();
	}
	
	
	@When("user clicked on create it now link")
	public void user_clicked_on_create_it_now_link() throws InterruptedException {
	   System.out.println("user clicked on create it now link");
	   register = new RegistrationPage();
	   register.clickCreateItNow();
	}
	
	@When("user entered registration email address as (.*?)")
	public void user_entered_registration_email_address(String email) {
	   System.out.println("user entered registration email address as "+email);
	   register = new RegistrationPage();
	   register.typeRegisterEmail(email);
	}

	@Then("user entered registration password as (.*?)")
	public void user_entered_registration_password(String pass) {
	   System.out.println("user entered registration password as "+pass);
	   register = new RegistrationPage();
	   register.typeRegisterPassword(pass);
	}
	

	@Then("user clicked on create your account button")
	public void user_clicked_on_create_your_account_button() {
	   System.out.println("user clicked on create your account button");
	   register = new RegistrationPage();
	   register.clickCreateYourAccount();
	}

}
