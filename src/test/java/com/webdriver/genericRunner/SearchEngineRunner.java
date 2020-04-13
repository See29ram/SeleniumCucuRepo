package com.webdriver.genericRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/main/java/com/webdriverlearn/custom/google.feature",
glue="",
dryRun = true,
monochrome = true)
public class SearchEngineRunner extends AbstractTestNGCucumberTests{

}
