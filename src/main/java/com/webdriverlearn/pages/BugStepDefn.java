package com.webdriverlearn.pages;

import org.openqa.selenium.WebDriver;

import com.webddrivelearn.service.DriverService;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BugStepDefn {

	
	private WebDriver dr;
	private DriverService driverService;
	private HomePage homePage;
	private LoginPage loginPage;
	private EnterBugClass enterBug;
	private SubmitBugClass submitBug;
	public BugStepDefn(DriverService driverService)
	{
		this.driverService=driverService;
		this.dr=driverService.getDr();
	}
	

	
}
