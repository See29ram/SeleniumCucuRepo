package com.webdriverlearn.framesex;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.webdriverlearn.browsers.ChromeConfig;
import com.webdriverlearn.helper.BrowserHelper;
import com.webdriverlearn.helper.ButtonHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FrameStepDefn {

	
	private WebDriver dr;
	private BrowserHelper brwHelp;
	private ButtonHelper btnHelp;
	
	
	
	@Given("^Luanching browser \"([^\"]*)\"$")
	public void luanching_browser(String url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		ChromeConfig chrome=new ChromeConfig();
		dr=chrome.getChormeBrowser();
		brwHelp=BrowserHelper.getInstance(dr);
		brwHelp.BrowserMaximize();
		btnHelp=ButtonHelper.getInstance(dr);
		dr.get(url);
		
		
	}

	@Given("^I click on frame \"([^\"]*)\"$")
	public void i_click_on_frame(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverWait wait=getWait(dr,20);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("IF2")));
		dr.findElement(By.linkText("Droppable")).click();
		btnHelp.eleClick(By.linkText("Droppable"));
		
		dr.switchTo().defaultContent();
		dr.switchTo().frame(0);
		dr.findElement(By.name("s")).sendKeys("Heyyy");
		//dr.findElement(By.xpath("//a[@title='Tooltip and Double click']")).click();
		//dr.switchTo().defaultContent();
		
	    
	}

	@Then("^Browser should close$")
	public void browser_should_close() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   if(dr!=null)
	   {
		   //dr.quit();
	   }
	}
	
	public WebDriverWait getWait(WebDriver ddr,int ms)
	{
		
		
		WebDriverWait wait =new WebDriverWait(ddr,ms);
		wait.ignoring(NoSuchElementException.class);
		return wait;
		
		
	}

	
	
}
