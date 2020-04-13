package com.webdriverlearn.testsome;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src\\main\\java\\com\\webdriverlearn\\testsome\\featuretest.feature"},
glue = "com.webdriverlearn.testsome",
dryRun = false,
monochrome = true)
public class TestRun extends AbstractTestNGCucumberTests{

}
