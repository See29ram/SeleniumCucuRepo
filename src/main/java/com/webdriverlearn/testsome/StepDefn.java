package com.webdriverlearn.testsome;

import cucumber.api.java.en.Given;

public class StepDefn {

	
	
	public StepDefn(BaseClass b,SecondBase s)
	{
		System.out.println("Step Defn Cosntructor Invoked");
	}
	
	@Given("^step one from scenario one$")
	public void step_one_from_scenario_one() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("Step1-1");
	    
	}

	@Given("^step(\\d+) from scenario(\\d+)$")
	public void step_from_scenario(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step2-1");
	}

	@Given("^step one from scenario two$")
	public void step_one_from_scenario_two() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step1-2");
	}

	@Given("^step two from scenario two$")
	public void step_two_from_scenario_two() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step2-2");
	}

	
	
}
