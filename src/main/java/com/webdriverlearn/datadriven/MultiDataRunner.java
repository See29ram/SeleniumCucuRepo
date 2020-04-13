package com.webdriverlearn.datadriven;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src\\main\\java\\com\\webdriverlearn\\datadriven\\MultiData.feature"},
glue = {"com.webdriverlearn.datadriven","com.webdriverlearn.generichook"},
dryRun = false,
monochrome = true)
public class MultiDataRunner extends AbstractTestNGCucumberTests{

}
