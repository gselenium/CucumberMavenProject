package com.edreams.pages.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/com/edreams/features/flights",							
					 glue="com.edreams.testcases",
					 plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json",
							 "junit:target/cucumber-reports/Cucumber.xml",
							 "html:target/cucumber-reports/cucumber"
					 })					
public class FlightsRunner extends AbstractTestNGCucumberTests{

}