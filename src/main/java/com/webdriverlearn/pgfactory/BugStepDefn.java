package com.webdriverlearn.pgfactory;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.webddrivelearn.service.DriverService;
import com.webdriver.getutils.TestSettings;
import com.webdriverlearn.factorypattern.PageName;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BugStepDefn {

	private WebDriver dr;
	private DriverService driverService;
	private HomePage homePage;
	private LoginPage loginPage;
	private EnterBugClass enterBug;
	private SubmitBugClass submitBug;
	private BugSummaryPage bugsummary;
	private TestSettings testSetting;

	public BugStepDefn(DriverService driverService, TestSettings testSetting) {
		this.driverService = driverService;
		this.dr = driverService.getDr();
		this.testSetting = testSetting;
	}

	@Given("^Bugzilla_I am at Bugzilla Homepage$")
	public void bugzilla_i_am_at_Bugzilla_Homepage() throws Throwable {
		dr.get(driverService.getIreader().getApplicationUrl());
		testSetting.homePage = new HomePage(dr);
		testSetting.data = "Data1234";

	}

	@Then("^Bugzilla_Page Title should be \"([^\"]*)\"$")
	public void bugzilla_page_Title_should_be(String expected) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
       //Assert.assertEquals(dr.getTitle(), expected);
		Assert.fail("Title Failed");
		
//		try {
//			Assert.fail("Failed due to error");
//		} catch (AssertionError e) {
//			// TODO: handle exception
//			System.out.println("Title is not matched but still test continues..");
//		}
	}

	@Then("^Bugzilla_I click on file a bug and navigate to login page$")
	public void bugzilla_i_click_on_file_a_bug_and_navigate_to_login_page() throws Throwable {
		testSetting.loginPage = testSetting.homePage.navigateToLoginPage();
	}

	@Then("^Bugzilla_I enter login details and navigate to Product Selection$")
	public void bugzilla_i_enter_login_details_and_navigate_to_Product_Selection() throws Throwable {

		testSetting.enterBug = testSetting.loginPage.Login(driverService.getIreader().getUserName(),
				driverService.getIreader().getPassword());

	}

	@Then("^Bugzilla_I Testng Product and navigate submit bug page$")
	public void bugzilla_i_Testng_Product_and_navigate_submit_bug_page() throws Throwable {

		testSetting.submitBug = testSetting.enterBug.clickTestNgProd();

	}

	@Then("^Bugzilla_I Enter Componente as \"([^\"]*)\" Version as \"([^\"]*)\" Sev as \"([^\"]*)\" HW as \"([^\"]*)\" Os as \"([^\"]*)\" Priority as \"([^\"]*)\" Sum \"([^\"]*)\" Desc \"([^\"]*)\"$")
	public void bugzilla_i_Enter_Componente_as_Version_as_Sev_as_HW_as_Os_as_Priority_as_Sum_Desc(String comp,
			String ver, String severity, String hardw, String OS, String Priority, String summary, String description)
			throws Throwable {
		testSetting.submitBug.provideDetails(comp, ver, severity, hardw, OS, Priority, summary, description);
	}
	


	@Then("^Bugzilla_I click on Submit Bug$")
	public void bugzilla_i_click_on_Submit_Bug() throws Throwable {
		testSetting.bugsummary = testSetting.submitBug.clickSubmitBug();
	}

	@Then("^Bugzilla_I am summary page and i logout$")
	public void bugzilla_i_am_summary_page_and_i_logout() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		testSetting.bugsummary.logoutFromApp();
		
	}
	@Then("^Bugzilla_I click on Home button$")
	public void bugzilla_i_click_on_Home_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		testSetting.enterBug.home.click();
		testSetting.homePage=(HomePage) testSetting.enterBug.NavigateTo(PageName.HomePage, dr, testSetting.enterBug.home);
				
		
	}

	@Then("^Bugzilla_I click on New Button$")
	public void bugzilla_i_click_on_New_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		testSetting.homePage.newLink.click();
		testSetting.enterBug=(EnterBugClass) testSetting.homePage.NavigateTo(PageName.EnterBugClass, dr, testSetting.enterBug.weTestng);
	}

}
