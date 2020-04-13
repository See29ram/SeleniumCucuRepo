package com.webdriverlearn.framesex;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/main/java/com/webdriverlearn/framesex/windowscheck.feature"},
glue= {"com.webdriverlearn.framesex"},
dryRun = false,
monochrome = true)
public class WindowRunnerButton extends AbstractTestNGCucumberTests{

	
	
	
}
