package com.webdriverlearn.pgfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BugSummaryPage extends PageBase{

	
	private WebDriver dr;
	
	@FindBy(how=How.ID,using="comment")
	WebElement weaddcmnt;
	@FindBy(how=How.ID,using="commit")
	WebElement wesavet;
	
	public BugSummaryPage(WebDriver dr)
	{
		super(dr);
		this.dr=dr;
	}
	
	
	
	
	
}
