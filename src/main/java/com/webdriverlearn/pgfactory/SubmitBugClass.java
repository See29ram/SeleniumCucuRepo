package com.webdriverlearn.pgfactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.webdriverlearn.helper.DropdownHelper;

public class SubmitBugClass extends PageBase{

	
	
	private WebDriver dr;
	
	public SubmitBugClass(WebDriver dr)
	{
		super(dr);
		this.dr=dr;
		//PageFactory.initElements(dr, this);
	}
	
	//WebElement Section
	@FindBy(how=How.ID,using="component")
	WebElement wecomponent;
	
	@FindBy(id="version")
	WebElement weversion;
	
	@FindBy(how=How.ID,using="bug_severity")
	WebElement webugseverity;
	
	@FindBy(id="rep_platform")
	WebElement webrepplatform;
	
	@FindBy(id="op_sys")
	WebElement weos;
	
	@FindBy(how=How.ID,using="priority")
	WebElement wepriority;
	
	@FindBy(how=How.CSS,using="input[id='short_desc']")
	WebElement weshortdesc;
	
	@FindBy(css="textarea[id='comment']")
	WebElement wedescription;
	
	@FindBy(how=How.ID,using="commit")
	WebElement weSubmitbug;
	
	/*
	 * public By component=By.id("component"); public By version=By.id("version");
	 * public By severity=By.id("bug_severity"); public By
	 * platform=By.id("rep_platform"); public By os=By.id("op_sys"); public By
	 * priority=By.id("priority"); public By summary=By.id("short_desc"); public By
	 * description=By.id("comment"); public By submitBug=By.id("commit");
	 */
	
	//Action Section
	public void provideDetails(String strcomp,String strversion,String strseverity,String strPlatform, String strOs, String strPrioriy, String strSummary, String strDesc )
	{
		
		DropdownHelper ddlHelper=DropdownHelper.getInstance(dr);
		ddlHelper.setDDLvalue(wecomponent, "visibletext", strcomp, 0);
		ddlHelper.setDDLvalue(weversion, "visibletext", strversion, 0);
		ddlHelper.setDDLvalue(webugseverity, "visibletext", strseverity, 0);
		ddlHelper.setDDLvalue(webrepplatform, "visibletext", strPlatform, 0);
		ddlHelper.setDDLvalue(weos, "visibletext", strOs, 0);
		//ddlHelper.setDDLvalue(priority, "visibletext", strPrioriy, 0);
		
		weshortdesc.sendKeys(strSummary);
		wedescription.sendKeys(strDesc);
		
		
	}
	
	//Navigation Section
	public BugSummaryPage clickSubmitBug()
	{
		BugSummaryPage bugSummary=new BugSummaryPage(dr);
		weSubmitbug.click();
		getWait().until(ExpectedConditions.elementToBeClickable(bugSummary.wesavet));
		return bugSummary;
	}
	
}
