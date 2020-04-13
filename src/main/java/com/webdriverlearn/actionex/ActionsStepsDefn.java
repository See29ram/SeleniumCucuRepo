package com.webdriverlearn.actionex;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.webdriverlearn.browsers.ChromeConfig;
import com.webdriverlearn.helper.BrowserHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ActionsStepsDefn {
	private WebDriver dr;
	private BrowserHelper brwHelp;
	Actions action;
	
	@Given("^Launch web \"([^\"]*)\"$")
	public void launch_web(String url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ChromeConfig chrome=new ChromeConfig();
		dr=chrome.getChormeBrowser();
		brwHelp=BrowserHelper.getInstance(dr);
		brwHelp.BrowserMaximize();
		dr.get(url);
		action=new Actions(dr);
	}

	@Given("^I perform context click$")
	public void i_perform_context_click() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	
		action.contextClick();
		
	    
	}

	@Given("^I Perform Drag Element$")
	public void i_Perform_Drag_Element() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement src=dr.findElement(By.id("draggable"));
		WebElement dst=dr.findElement(By.id("droppable"));
		
		action.clickAndHold(src).moveToElement(dst).release().build().perform();
		
		
	   //action.dragAndDrop(src,dst).build().perform();
	}

	@Then("^Element should be dropped$")
	public void element_should_be_dropped() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Drop is done");
		dr.quit();
	   
	}
	
	
	
}
