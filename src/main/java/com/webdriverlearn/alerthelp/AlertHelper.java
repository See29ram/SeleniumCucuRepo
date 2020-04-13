package com.webdriverlearn.alerthelp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AlertHelper {

	
	
	private static AlertHelper alertHelper;

	private static WebDriver ddr;

	private AlertHelper(WebDriver dr) {
		ddr = dr;
	}

	public static AlertHelper getInstance(WebDriver dr) {

		if (alertHelper == null || ddr.hashCode() != dr.hashCode()) {
			alertHelper = new AlertHelper(dr);
		}

		return alertHelper;

	}
	
	
	private WebDriverWait alertWait()
	{
		WebDriverWait wait =new WebDriverWait(ddr,30);
		wait.ignoring(NoAlertPresentException.class);
		return wait;
	}
	
	public void acceptAlert() throws Exception
	{
		
		
		Alert alt = getAlert();
		Thread.sleep(4000);
		alt.accept();
	
		
	}

	private Alert getAlert() {
		WebDriverWait wait=alertWait();
		Alert alt=wait.until(ExpectedConditions.alertIsPresent());
		return alt;
	}
	
	public void dismissAlert() throws Exception
	{
		
		
		Alert alt = getAlert();
		Thread.sleep(4000);
		alt.dismiss();
	
		
	}
	public void sendTextAlert(String msg) throws Exception
	{
		
		
		Alert alt = getAlert();
		alt.sendKeys(msg);
		Thread.sleep(4000);
	
		
	}
	public String getTextAlert()
	{
		
		
		Alert alt = getAlert();
		return alt.getText();
	
		
	}
	
	
}
