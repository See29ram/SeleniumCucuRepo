package com.webdriverlearn.framesex;

import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.webdriverlearn.browsers.ChromeConfig;
import com.webdriverlearn.helper.BrowserHelper;
import com.webdriverlearn.helper.ButtonHelper;
import com.webdriverlearn.windowshelp.WindowsHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class WndsStepDefn {

	
	private WebDriver dr;
	private BrowserHelper brwHelp;
	private ButtonHelper btnHelp;
	private WindowsHelper wndHelp;
	
	@Given("^Open web \"([^\"]*)\"$")
	public void open_web(String url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ChromeConfig chrome=new ChromeConfig();
		dr=chrome.getChormeBrowser();
		brwHelp=BrowserHelper.getInstance(dr);
		brwHelp.BrowserMaximize();
		btnHelp=ButtonHelper.getInstance(dr);
		wndHelp=WindowsHelper.getInstance(dr);
		dr.get(url);
	}

	@Given("^I click on new window button$")
	public void i_click_on_new_window_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		btnHelp.eleClick(By.xpath("//button[@onclick='newBrwTab()']"));
		
		
	}

	@Then("^I switch to new window with title as \"([^\"]*)\"$")
	public void i_switch_to_new_window_with_title_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		wndHelp.switchToWnd(2);
		btnHelp.eleClick(By.xpath("//a[@class='submit']"));
		Thread.sleep(4000);
		wndHelp.switchToParent();
		/*
		 * WebDriverWait wait=getWait(dr,20);
		 * wait.until(ExpectedConditions.numberOfWindowsToBe(2)); String
		 * pwnd=dr.getWindowHandle(); Set<String> totwnds = dr.getWindowHandles();
		 * for(String wnd:totwnds) { String
		 * url=dr.switchTo().window(wnd).getCurrentUrl();
		 * if(url.equals("http://www.seleniumframework.com/")) {
		 * 
		 * wait=getWait(dr,20);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//a[@class='submit']")));
		 * btnHelp.eleClick(By.xpath("//a[@class='submit']")); break; } }
		 * 
		 * Thread.sleep(2000); dr.close(); dr.switchTo().window(pwnd);
		 */
		btnHelp.eleClick(By.xpath("//button[@onclick='newBrwWin()']"));
		Thread.sleep(4000);
		wndHelp.switchToParentAndCloseOthers();
		Thread.sleep(4000);
		
	    
	}

	@Then("^I close all windows$")
	public void i_close_all_windows() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(dr!=null)
		   {
		  
			dr.quit();
			   //dr.close();
		   }
	}
	
	public WebDriverWait getWait(WebDriver ddr,int ms)
	{
		
		WebDriverWait wait=new WebDriverWait(ddr,ms);
		wait.ignoring(NoSuchElementException.class);
		return wait;
		
		
	}
	
	
}
