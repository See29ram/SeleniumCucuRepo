package com.webdriver.runner;

import com.webdriverlearn.custom.CustomAbstractTestNGCucumberTests;

import cucumber.api.CucumberOptions;

@CucumberOptions(features = "src\\main\\java\\com\\webdriverlearn\\custom",
glue="com.webdriverlearn.custom",
dryRun = false,
monochrome = true,
plugin = {"pretty","html:target/HtmlReports","junit:target/junitreport.xml"}
)
public class RunnerWithSearch extends CustomAbstractTestNGCucumberTests{

}
