package com.edreams.pages.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.edreams.util.BaseWebdriver;

public class HomePage extends BaseWebdriver {
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='login_not_logged']")WebElement myaccountMenu;
	public void clickMyAccountMenu() throws InterruptedException {
		myaccountMenu.click();
		Thread.sleep(2000);
	}
	
	@FindBy(xpath="//*[@id='login-wrapper']/div/div[2]/div/div/button[1]")WebElement loginButton;
	public void clickLoginButton() {
		loginButton.click();
	}
	
	@FindBy(xpath="(//*[@class='od-login-input-wrapper input_wrapper']//input[@placeholder='Email'])[1]")WebElement emailAddress;
	public void typeEmailAddress(String email) {
		driver.switchTo().activeElement().sendKeys(email);
		//emailAddress.sendKeys(email);
	}
	
	@FindBy(xpath="//*[@name='password']")WebElement password;
	public void typePassword(String pass) {
		password.sendKeys(pass);
	}
	
	@FindBy(xpath="(//*[contains(@class, 'login_button')])[2]")WebElement signInButton;
	public void clickSigninButton() {
		signInButton.click();
	}

}
