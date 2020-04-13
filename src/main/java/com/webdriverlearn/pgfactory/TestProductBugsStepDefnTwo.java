package com.webdriverlearn.pgfactory;

import org.openqa.selenium.WebDriver;

import com.webddrivelearn.service.DriverService;
import com.webdriver.getutils.TestSettings;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

public class TestProductBugsStepDefnTwo {

	private WebDriver dr;
	private DriverService driverService;
	TestSettings testSetting;
	
	public TestProductBugsStepDefnTwo(DriverService driverService,TestSettings testSetting)
	{
		this.driverService=driverService;
		this.dr=driverService.getDr();
		this.testSetting=testSetting;
	}
	
	@Then("^TestProduct Enter Componente as \"([^\"]*)\" Version as \"([^\"]*)\" Sev as \"([^\"]*)\" HW as \"([^\"]*)\" Os as \"([^\"]*)\" Priority as \"([^\"]*)\" Sum \"([^\"]*)\" Desc \"([^\"]*)\"$")
	public void testproduct_Enter_Componente_as_Version_as_Sev_as_HW_as_Os_as_Priority_as_Sum_Desc(String comp, String ver, String severity, String hardw, String OS, String Priority, String summary, String description) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		testSetting.submitBug.provideDetails(comp, ver, severity, hardw, OS, Priority, summary, description);
	}

	@Then("^TestProduct click on Submit Bug$")
	public void testproduct_click_on_Submit_Bug() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		testSetting.bugsummary=testSetting.submitBug.clickSubmitBug();
	}

	@Then("^TestProduct am summary page and i logout$")
	public void testproduct_am_summary_page_and_i_logout() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		testSetting.bugsummary.logoutFromApp();
		System.out.println("----->>>>"+testSetting.data);
	}
	
}
