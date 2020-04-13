package com.webdriverlearn.actionex;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src\\main\\java\\com\\webdriverlearn\\actionex\\ActionsFeature.feature"},
glue= {"com.webdriverlearn.actionex"},
dryRun = false,
monochrome = true
		
		)

public class ActionsRunner extends AbstractTestNGCucumberTests{

}
