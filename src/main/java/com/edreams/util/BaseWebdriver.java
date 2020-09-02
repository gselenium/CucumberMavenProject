package com.edreams.util;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.After;
public class BaseWebdriver {
	//Open Browser function:
	public static WebDriver driver;
	public void openBrowser(String browser) throws InterruptedException{
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "resources/drivers/geckodriver.exe");
			driver = new FirefoxDriver();			
		}else if(browser.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver", "resources/drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();		
		}else if(browser.equalsIgnoreCase("Edge")){
			System.setProperty("webdriver.ie.driver", "resources/drivers/msedgedriver.exe");
			driver = new EdgeDriver();	
		}
		
	}	
	
	//Navigete url/open url:
	public void navigateUrl(String url){
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	//get title function:
	public void getAppTitle(){
		String title = driver.getTitle();
		System.out.println("Application Title: "+title);
	}
	
	//Close Browser Function:
	@After
	public void closeBrowser(){
		driver.quit();
	}
	
	public void mouseHover(WebElement element) throws InterruptedException{
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
		Thread.sleep(2000);
	}
	
	public void selectNewWindow(){
		String mainWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();		
		for(String windowHandle : handles){
			if(windowHandle.equals(mainWindow)){
				driver.switchTo().window(windowHandle);
			}
		}
	}
}
