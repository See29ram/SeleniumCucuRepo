package com.webdriverlearn.testsome;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class GeneralHooks {

	
	public GeneralHooks()
	{
		System.out.println("Hook constructor invoked");
	}
	
	@Before
	public void Setup()
	{
		System.out.println("----Before----");
	}
	@After
	public void tearDown()
	{
		System.out.println("----After----");
	}
	
}
