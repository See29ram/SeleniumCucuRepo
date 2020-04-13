package com.webdriverlearn.webelementsfn;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions( features =  {"src\\main\\java\\com\\webdriverlearn\\webelementsfn\\webelementsfn.feature"},
                  glue= {"com.webdriverlearn.webelementsfn"},
                  dryRun = false,
                  monochrome = true
		
		)

public class FbRunner extends AbstractTestNGCucumberTests{

	
	
	
}
