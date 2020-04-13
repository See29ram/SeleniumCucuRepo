package com.webdriverlearn.excelpart;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;

public class LoginStepsDefn {

	
	@Given("^user is at the login page$")
	public void user_is_at_the_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User Logged In");
	   
	}

	@Given("^User Login with different user ids from Excel at \"([^\"]*)\"$")
	public void user_Login_with_different_user_ids_from_Excel_at(@Transform(ExcelToDataTable.class)DataTable table) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		List<String> list=table.asList(String.class);
		for(String s:list)
		{
			System.out.println(s);
		}
		
		
	    
	}
	@Given("^UserId has data of \"([^\"]*)\"$")
	public void userid_has_data_of(String user) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(user);
	}

	@Given("^SiteURL has data of \"([^\"]*)\"$")
	public void siteurl_has_data_of(String url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(url);
	   
	}

	@Given("^Region has data of \"([^\"]*)\"$")
	public void region_has_data_of(String region) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(region);
	}
	
	
	
}
