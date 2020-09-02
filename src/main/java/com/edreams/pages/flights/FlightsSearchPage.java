package com.edreams.pages.flights;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.edreams.util.BaseWebdriver;

public class FlightsSearchPage extends BaseWebdriver{
	
	public FlightsSearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@placeholder='From']")WebElement destination;
	@FindBy(xpath="//*[@class='odf-dropdown-col lg odf-text-nowrap']")List<WebElement> destautoOptions;
	public void typeDestination(String dest) throws InterruptedException {
		destination.sendKeys(dest);
		Thread.sleep(3000);
		destautoOptions.get(1).click();
	}
	
	@FindBy(xpath = "//*[@placeholder='To']")WebElement arrival;
	@FindBy(xpath="//*[@class='odf-dropdown-col lg odf-text-nowrap']")List<WebElement> arrivalautoOptions;
	public void typeArrival(String arrive) throws InterruptedException {
		arrival.sendKeys(arrive);
		Thread.sleep(3000);
		arrivalautoOptions.get(1).click();
	}

}
