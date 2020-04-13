package com.webdriverlearn.actionex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.webdriverlearn.alerthelp.AlertHelper;
import com.webdriverlearn.browsers.ChromeConfig;
import com.webdriverlearn.helper.BrowserHelper;

import cucumber.api.java.en.Given;

public class ActionsOtherStepDefn {

	private WebDriver dr;
	private BrowserHelper brwHelp;
	Actions action;
	private AlertHelper altHelp;
	@Given("^move to web \"([^\"]*)\"$")
	public void move_to_web(String url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ChromeConfig chrome=new ChromeConfig();
		dr=chrome.getChormeBrowser();
		brwHelp=BrowserHelper.getInstance(dr);
		brwHelp.BrowserMaximize();
		altHelp=AlertHelper.getInstance(dr);
		dr.get(url);
		action=new Actions(dr);
	}

	@Given("^Perform Doubleclick$")
	public void perform_Doubleclick() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		action.doubleClick(dr.findElement(By.id("doubleClickBtn"))).build().perform();
		altHelp.acceptAlert();
		Thread.sleep(4000);
		
	 
	}

	@Given("^Perform mouseHover$")
	public void perform_mouseHover() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
		action.moveToElement(dr.findElement(By.id("tooltipDemo"))).build().perform();
		Thread.sleep(4000);
		
	}

	@Given("^Perfrom Rightclick$")
	public void perfrom_Rightclick() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    action.contextClick(dr.findElement(By.id("rightClickBtn"))).build().perform();
	}
	
	
}
