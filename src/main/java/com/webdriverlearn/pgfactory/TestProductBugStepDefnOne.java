package com.webdriverlearn.pgfactory;

import org.openqa.selenium.WebDriver;

import com.webddrivelearn.service.DriverService;
import com.webdriver.getutils.TestSettings;

import cucumber.api.java.en.Then;

public class TestProductBugStepDefnOne {

	private WebDriver dr;
	private DriverService driverService;
	private TestSettings testSetting;
	
	public TestProductBugStepDefnOne(DriverService driverService,TestSettings testSetting)
	{
		this.driverService=driverService;
		this.dr=driverService.getDr();
		this.testSetting=testSetting;;
	}
	@Then("^TestProduct Test Product and navigate submit bug page$")
	public void testproduct_Test_Product_and_navigate_submit_bug_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		testSetting.submitBug=testSetting.enterBug.clickTestNgProd();
	   
	}

	
}
