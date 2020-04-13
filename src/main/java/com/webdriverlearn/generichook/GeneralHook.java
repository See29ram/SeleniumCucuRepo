package com.webdriverlearn.generichook;

import org.openqa.selenium.WebDriver;

import com.webddrivelearn.service.DriverService;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class GeneralHook {

	
	private DriverService drService;
	private WebDriver dr;
	public GeneralHook(DriverService drs)
	{
		this.drService=drs;
		this.dr=drs.getDr();
	}
	
	
	@Before(value="@regression",order=1)
	public void setUpRegression()
	{
		System.out.println("This is regression hook");
	}
	@Before(order=2)
	public void setUp()
	{
		System.out.println("This is normal hook method");
	}
	
	@After
	public void tearDown(Scenario scenario)
	{
		
		if(scenario.isFailed())
		{
			int random=(int)(Math.random()*1000);
			drService.getGenericHelper().takeScreenshot("BugzilaScreenshot", "Bug"+random+".png");
			
			scenario.embed(drService.getGenericHelper().takeScreenshot(), "image/png");
			
		}
		
		System.out.println("Browser going to close..");
		
		if(dr!=null)
		{
			dr.quit();
		}
		
	}
	
	
	
	
	
}
