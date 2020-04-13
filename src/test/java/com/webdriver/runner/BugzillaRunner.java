package com.webdriver.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src\\main\\java\\com\\webdriverlearn\\pgfactory\\BugCreation.feature"},
glue= {"com.webdriverlearn.pgfactory","com.webdriverlearn.generichook"},
dryRun=false,
monochrome = true,
plugin = {"pretty","json:target/jsonrreport.json","html:target/htmlreport/","junit:target/junitreport.xml"}
		)
public class BugzillaRunner extends AbstractTestNGCucumberTests{

}
