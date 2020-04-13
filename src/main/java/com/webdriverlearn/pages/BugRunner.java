package com.webdriverlearn.pages;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = {"src/main/java/com/webdriverlearn/pages/BugCreation.feature"},
glue= {"com.webdriverlearn.pages","com.webdriverlearn.generichook"},
dryRun=false,
monochrome = true
		)

public class BugRunner extends AbstractTestNGCucumberTests{

}
