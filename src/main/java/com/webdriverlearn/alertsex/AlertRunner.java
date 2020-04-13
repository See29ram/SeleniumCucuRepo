package com.webdriverlearn.alertsex;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src\\main\\java\\com\\webdriverlearn\\alertsex\\AlertsFeatures.feature"},
glue= {"com.webdriverlearn.alertsex","com.webdriverlearn.generichook"},
dryRun = false,
monochrome = true)
public class AlertRunner extends AbstractTestNGCucumberTests{

	
	
}
