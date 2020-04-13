package com.webdriverlearn.framesex;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src\\main\\java\\com\\webdriverlearn\\framesex\\FramesEx.feature"},
glue= {"com.webdriverlearn.framesex"},
dryRun = false,
monochrome = true)
public class FrameRunner extends AbstractTestNGCucumberTests {

	
	
	
}
