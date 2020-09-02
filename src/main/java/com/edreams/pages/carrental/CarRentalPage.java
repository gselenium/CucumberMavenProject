package com.edreams.pages.carrental;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.edreams.util.BaseWebdriver;

public class CarRentalPage extends BaseWebdriver{
	public CarRentalPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='menu_cars']")WebElement carRentalsMenu;	
	public void clickCarRenatals() throws InterruptedException {
		carRentalsMenu.click();
		Thread.sleep(12000);
	}
	
	@FindBy(xpath = "//*[@id='pickupLocation']")WebElement cityPickupLocation;	
	@FindBy(xpath = "//*[@id='item-0-2']")WebElement cityautoOption;
	public void typePickupLocation(String city) throws InterruptedException {
		cityPickupLocation.sendKeys(city);
		Thread.sleep(4000);
		cityautoOption.click();
		Thread.sleep(3000);
	}
	
	@FindBy(xpath = "//*[@id='ct-pickup-calendar']")WebElement startDateEditbox;	
	@FindBy(xpath = "//*[@id='day-20200917']/span")WebElement selectStartDate;
	public void clickStartDate() throws InterruptedException {
		startDateEditbox.click();
		Thread.sleep(1000);
		selectStartDate.click();
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
	}

	@FindBy(xpath = "//*[@id='returnDate']")WebElement endDateEditbox;	
	@FindBy(xpath = "//*[@id='day-20200923']/span")WebElement selectEndDate;
	public void clickEndDate() throws InterruptedException {
		endDateEditbox.click();
		Thread.sleep(1000);
		selectEndDate.click();
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
	}
	
	@FindBy(xpath = "//*[@id='searchCarsFormBtn-searchcars']")WebElement searchCarsButton;
	public void clickSearchCarsButton() throws InterruptedException {
		searchCarsButton.click();
		Thread.sleep(3000);
	}

}
