package com.webdriverlearn.pgfactory;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import org.openqa.selenium.support.ui.ExpectedConditions;


public class EnterBugClass extends PageBase{

	private WebDriver dr;

	public EnterBugClass(WebDriver dr) {
		super(dr);
		this.dr = dr;
		//PageFactory.initElements(dr, this);
	}

	@FindBy(linkText="TsetNg")
	WebElement weTestng;
	
	@FindBy(how =How.XPATH,using="//a[text()='TestProduct']")
	WebElement weProdLink;
	
	//public By testngProdLink = By.xpath("//a[text()='TsetNg']");
	//public By testProdLink = By.xpath("//a[text()='TestProduct']");
	
	
	public SubmitBugClass clickTestNgProd()
	{
		
		SubmitBugClass submitBug=new SubmitBugClass(dr);
		weTestng.click();
		
		getWait().until(ExpectedConditions.elementToBeClickable(submitBug.weSubmitbug));
		return submitBug;
		
	}
	
	
	

}
