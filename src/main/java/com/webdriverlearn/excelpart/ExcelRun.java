package com.webdriverlearn.excelpart;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features ={"src\\main\\java\\com\\webdriverlearn\\excelpart\\ExcelData.feature"},
glue= {"com.webdriverlearn.excelpart"},
dryRun = false,
monochrome = true)
public class ExcelRun extends AbstractTestNGCucumberTests{

}
