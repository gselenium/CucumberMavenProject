package com.edreams.pages.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.edreams.util.BaseWebdriver;
public class RegistrationPage extends BaseWebdriver {
	
	public RegistrationPage() {		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='login-wrapper']/div/div[2]/div/div/div[1]/span[2]")WebElement createItNow;
	public void clickCreateItNow() throws InterruptedException {
		createItNow.click();
		Thread.sleep(2000);
	}
	
	@FindBy(xpath = "//*[@id='register-page']/div[2]/div[1]/div/div/form/div[3]/div/input")WebElement regEmail;
	public void typeRegisterEmail(String email) {
		regEmail.sendKeys(email);
	}

	@FindBy(xpath = "//*[@id='register-page']/div[2]/div[1]/div/div/form/div[4]/div/input")WebElement regPassword;
	public void typeRegisterPassword(String pass) {
		regPassword.sendKeys(pass);
	}
	
	@FindBy(xpath = "//*[@id='register-page']/div[2]/div[1]/div/div/form/div[5]/button")WebElement regCreateYourAccount;
	public void clickCreateYourAccount() {
		regCreateYourAccount.click();
	}
}
