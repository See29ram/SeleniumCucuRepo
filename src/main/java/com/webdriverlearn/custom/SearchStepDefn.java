package com.webdriverlearn.custom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.webddrivelearn.service.DriverService;
import com.webdriver.getutils.TestSettings;
import com.webdriverlearn.pgfactory.BugSummaryPage;
import com.webdriverlearn.pgfactory.EnterBugClass;
import com.webdriverlearn.pgfactory.HomePage;
import com.webdriverlearn.pgfactory.LoginPage;
import com.webdriverlearn.pgfactory.SubmitBugClass;

import cucumber.api.java.en.Given;

public class SearchStepDefn {

	private WebDriver dr;
	private DriverService driverService;
	private HomePage homePage;
	private LoginPage loginPage;
	private EnterBugClass enterBug;
	private SubmitBugClass submitBug;
	private BugSummaryPage bugsummary;
	private TestSettings testSetting;
	
	
	public SearchStepDefn(DriverService driverService, TestSettings testSetting)
	{
	   this.driverService = driverService;
	   this.dr = driverService.getDr();
	   this.testSetting = testSetting;
	}
	@Given("^I am given with \"([^\"]*)\"$")
	public void i_am_given_with(String url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	    dr.get(url);
	    dr.manage().window().maximize();
	    dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Given("^I Search \"([^\"]*)\" and click Search$")
	public void i_Search_and_click_Search(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   dr.findElement(By.name("q")).sendKeys(arg1);
	   dr.close();
	}

	@Given("^I click on gmail$")
	public void i_click_on_gmail() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 dr.findElement(By.linkText("Gmail")).click();
	 dr.close();
		
	}
	@Given("^I am navigating to \"([^\"]*)\"$")
	public void i_am_navigating_to(String url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    dr.get(url);
	    dr.manage().window().maximize();
	    dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Given("^I look for \"([^\"]*)\" and click Search$")
	public void i_look_for_and_click_Search(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		dr.findElement(By.id("header-search-input")).sendKeys(arg1);
		   dr.close();
	}
	
	
	
	
}
