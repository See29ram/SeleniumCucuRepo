package com.webdriverlearn.custom;

import cucumber.api.CucumberOptions;

@CucumberOptions(features = "src/main/java/com/webdriverlearn/custom",
glue="com.webdriverlearn.custom",
dryRun = false,
monochrome = true,
plugin = {"pretty","html:target/HtmlReports"})
public class CustomSearchRunnerWithTag extends CustomAbstractTestNGCucumberTestsWithTag{
	

}
