package com.webdriverlearn.featurefn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.webdriverlearn.helper.BrowserHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class BrowserFnStepDefn {

	
	private WebDriver dr;
	private BrowserHelper browserHelp;
	
	@Given("^Browser Function I have chrome browser$")
	public void browser_Function_I_have_chrome_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "D:\\\\seleniumJar\\\\chromedriver.exe");
		dr=new ChromeDriver();
		System.out.println("Webdrive Name in steps"+dr.toString());
		browserHelp=BrowserHelper.getInstance(dr);
		
		
	
	}

	

	@Then("^Browser should be closed$")
	public void browser_should_be_closed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(dr!=null)
		{
			dr.quit();
		}
	   
	}
	
	@Given("^I am navigating to \"([^\"]*)\" and then corresponding should be displayed$")
	public void i_am_navigating_to_and_then_corresponding_should_be_displayed(String navigateURL) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    dr.get(navigateURL);
	}

	@Then("^I call Back method then it should call old url$")
	public void i_call_Back_method_then_it_should_call_old_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //dr.navigate().back();
	    
		browserHelp.moveBack();
	    
	}

	@Then("^I call navigate method then it should call New Url$")
	public void i_call_navigate_method_then_it_should_call_New_Url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   //dr.navigate().forward();

	   browserHelp.moveForward();
	}

	@Then("^I call refresh and page should be refreshed$")
	public void i_call_refresh_and_page_should_be_refreshed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  // dr.navigate().refresh();
		
	   browserHelp.refreshPage();
	}
	@Given("^I maximize Browser$")
	public void i_maximize_Browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //dr.manage().window().maximize();
		
	    browserHelp.BrowserMaximize();
	}

	
	
	
	
}
