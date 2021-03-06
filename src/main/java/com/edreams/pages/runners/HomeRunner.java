package com.edreams.pages.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/com/edreams/features/home",							
					 glue="com.edreams.testcases.stepdefinitions",
					 plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json",
							 "junit:target/cucumber-reports/Cucumber.xml",
							 "html:target/cucumber-reports/cucumber"
					 })					
public class HomeRunner extends AbstractTestNGCucumberTests{
	
}