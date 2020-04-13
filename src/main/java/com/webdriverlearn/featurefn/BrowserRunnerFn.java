package com.webdriverlearn.featurefn;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = {"src\\main\\java\\com\\webdriverlearn\\featurefn\\Browserfn.feature"},
        glue = {"com.webdriverlearn.featurefn"},
		dryRun = false,
		monochrome = true
		)



public class BrowserRunnerFn extends AbstractTestNGCucumberTests{

}
