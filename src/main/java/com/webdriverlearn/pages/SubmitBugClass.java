package com.webdriverlearn.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.webdriverlearn.helper.DropdownHelper;

public class SubmitBugClass {

	
	
	private WebDriver dr;
	
	public SubmitBugClass(WebDriver dr)
	{
		this.dr=dr;
	}
	
	//WebElement Section
	public By component=By.id("component");
	public By version=By.id("version");
	public By severity=By.id("bug_severity");
	public By platform=By.id("rep_platform");
	public By os=By.id("op_sys");
	public By priority=By.id("priority");
	public By summary=By.id("short_desc");
	public By description=By.id("comment");
	public By submitBug=By.id("commit");
	
	//Action Section
	public void provideDetails(String strcomp,String strversion,String strseverity,String strPlatform, String strOs, String strPrioriy, String strSummary, String strDesc )
	{
		
		DropdownHelper ddlHelper=DropdownHelper.getInstance(dr);
		ddlHelper.setDDLvalue(component, "visibletext", strcomp, 0);
		ddlHelper.setDDLvalue(version, "visibletext", strversion, 0);
		ddlHelper.setDDLvalue(severity, "visibletext", strseverity, 0);
		ddlHelper.setDDLvalue(platform, "visibletext", strPlatform, 0);
		ddlHelper.setDDLvalue(os, "visibletext", strOs, 0);
		//ddlHelper.setDDLvalue(priority, "visibletext", strPrioriy, 0);
		
		dr.findElement(summary).sendKeys(strSummary);
		dr.findElement(description).sendKeys(strDesc);
		
		
	}
	
	//Navigation Section
	public void clickSubmitBug()
	{
		dr.findElement(submitBug).click();
	}
	
}
