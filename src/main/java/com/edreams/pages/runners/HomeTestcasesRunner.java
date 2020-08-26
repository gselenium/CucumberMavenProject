package com.edreams.pages.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="D:/Online_Batches/BasheerIrland/Workspace/CucumberMavenProject/src/test/resources/com/edreams/features/home/login.feature",
					 glue="com.edreams.testcases"					 
					 )
public class HomeTestcasesRunner extends AbstractTestNGCucumberTests{

}