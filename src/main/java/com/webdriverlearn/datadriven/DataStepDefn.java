package com.webdriverlearn.datadriven;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.webddrivelearn.service.DriverService;
import com.webdriver.getutils.TestSettings;
import com.webdriverlearn.pgfactory.*;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DataStepDefn {

	private DriverService driverService;
	private TestSettings testSetting;
	private WebDriver dr;
	
	public DataStepDefn(DriverService service, TestSettings testSetting)
	{
		this.driverService=service;
		this.testSetting=testSetting;
		dr=service.getDr();
	}
	
	@Given("^Datadriven_I am at Bugzilla Homepage$")
	public void datadriven_i_am_at_Bugzilla_Homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		dr.get(driverService.getIreader().getApplicationUrl());
		testSetting.homePage = new HomePage(dr);
		

	}

	@Then("^Datadriven_I click on file a bug and navigate to login page$")
	public void datadriven_i_click_on_file_a_bug_and_navigate_to_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		testSetting.loginPage = testSetting.homePage.navigateToLoginPage();
	}

	@Then("^Datadriven_I enter login details and navigate to Product Selection$")
	public void datadriven_i_enter_login_details_and_navigate_to_Product_Selection() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		testSetting.enterBug = testSetting.loginPage.Login(driverService.getIreader().getUserName(),
				driverService.getIreader().getPassword());
	}

	@Then("^Datadriven_I Test Product and navigate submit bug page$")
	public void datadriven_i_Test_Product_and_navigate_submit_bug_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		testSetting.submitBug = testSetting.enterBug.clickTestNgProd();
	}
	
	@Then("^Datadriven_I Enter below values$")
	public void datadriven_i_Enter_below_values(DataTable data) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		       List<Map<String,String>> dataList=data.asMaps(String.class, String.class);
		       Map<String,String> dataRange=dataList.get(0);
		       
		testSetting.submitBug.provideDetails(dataRange.get("component"), dataRange.get("Version"), dataRange.get("severity"), dataRange.get("HW"), dataRange.get("OS"), dataRange.get("Priority"), dataRange.get("Summary"), dataRange.get("Description"));
	}

	@Then("^Datadriven_I click on Submit Bug$")
	public void datadriven_i_click_on_Submit_Bug() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		testSetting.bugsummary = testSetting.submitBug.clickSubmitBug();
	}

	@Then("^Datadriven_I am summary page and i logout$")
	public void datadriven_i_am_summary_page_and_i_logout() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		testSetting.bugsummary.logoutFromApp();
	}
	
	
}
