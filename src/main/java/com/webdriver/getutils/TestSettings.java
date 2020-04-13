package com.webdriver.getutils;

import com.webdriverlearn.pgfactory.BugSummaryPage;
import com.webdriverlearn.pgfactory.EnterBugClass;
import com.webdriverlearn.pgfactory.HomePage;
import com.webdriverlearn.pgfactory.LoginPage;
import com.webdriverlearn.pgfactory.SubmitBugClass;

public class TestSettings {

	
	public HomePage homePage;
	public LoginPage loginPage;
	public EnterBugClass enterBug;
	public SubmitBugClass submitBug;
	public BugSummaryPage bugsummary;
	public String data="";
	public TestSettings() {
		System.out.println("Test seetings Initiated..");
	}
	
	
}
