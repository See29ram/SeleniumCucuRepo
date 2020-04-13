package com.webdriver.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src\\main\\java\\com\\webdriverlearn\\alertsex\\AlertsFeatures.feature"},
glue= {"com.webdriverlearn.alertsex","com.webdriverlearn.generichook"},
dryRun = false,
monochrome = true)
public class AlertsRunner extends AbstractTestNGCucumberTests{

}
