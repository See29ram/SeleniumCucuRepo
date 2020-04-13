package com.webdriverlearn.alertsex;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.TakesScreenshot;
import com.webddrivelearn.service.DriverService;
import com.webdriver.getutils.IReader;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class AlertStepDefn {

	private WebDriver dr;
	private DriverService drService;
	private IReader iread;
	
	public AlertStepDefn(DriverService drService)
	{
		System.out.println("---Alert Step Defn Initiated---");
		this.drService=drService;
		dr=drService.getDr();
		iread=drService.getIreader();
	}
	
	@Given("^Alert Site \"([^\"]*)\" have launched$")
	public void alert_Site_have_launched(String url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//		ChromeConfig chrome=new ChromeConfig();
//		dr=chrome.getChormeBrowser();
//		brwHelp=BrowserHelper.getInstance(dr);
//		brwHelp.BrowserMaximize();
//		btnHelp=ButtonHelper.getInstance(dr);
//		altHelp=AlertHelper.getInstance(dr);
		//Assert.fail("Failing Alert");
		dr.get(url);
		//dr.get(iread.getApplicationUrl());
	}

	@And("^I click deal Alert Box$")
	public void i_click_deal_Alert_Box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		WebDriverWait wait=getWait();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@onclick='myAlertFunction()']")));
		drService.getBtnHelper().eleClick(By.xpath("//button[@onclick='myAlertFunction()']"));
		
		/*
		 * wait.until(ExpectedConditions.alertIsPresent()); Alert
		 * alt=dr.switchTo().alert(); Thread.sleep(2000); alt.accept();
		 */
		
		drService.getAltHelper().acceptAlert();
		
	   
	}
	
	@And("^I click Confirm box$")
	public void i_click_Confirm_box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverWait wait=getWait();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@onclick='myAlertFunction()']")));
		drService.getBtnHelper().eleClick(By.xpath("//button[@onclick='myConfirmFunction()']"));
		
		/*
		 * wait.until(ExpectedConditions.alertIsPresent()); Alert
		 * alt=dr.switchTo().alert(); Thread.sleep(2000); alt.dismiss();
		 */
		System.out.println("Getting dismiss alert text "+drService.getAltHelper().getTextAlert());
		drService.getAltHelper().dismissAlert();
	}

	@And("^I click Promt box and send message as \"([^\"]*)\"$")
	public void i_click_Promt_box_and_send_message_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverWait wait=getWait();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@onclick='myAlertFunction()']")));
		drService.getBtnHelper().eleClick(By.xpath("//button[@onclick='myPromptFunction()']"));
		
		/*
		 * wait.until(ExpectedConditions.alertIsPresent()); Alert
		 * alt=dr.switchTo().alert(); Thread.sleep(2000); alt.sendKeys("Hey Ram");
		 * Thread.sleep(2000); alt.accept();
		 */
		drService.getAltHelper().sendTextAlert("Hi Selenium");
		System.out.println("Getting sendkeys alert text "+drService.getAltHelper().getTextAlert());
		drService.getAltHelper().acceptAlert();
		
	}
	@Given("^I Take Screenshot$")
	public void i_Take_Screenshot() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		//File screenshot=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(screenshot, new File("src.png"));
		drService.getGenericHelper().takeScreenshot("D:\\scrshot\\vb\\uv", "s.png");
	}

	
	
	public WebDriverWait getWait()
	{
		
		WebDriverWait wait=new WebDriverWait(dr,iread.getExplicitWait());
		return wait;
		
	}
	
}
