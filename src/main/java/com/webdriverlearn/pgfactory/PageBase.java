package com.webdriverlearn.pgfactory;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.webdriverlearn.factorypattern.CustomFactory;
import com.webdriverlearn.factorypattern.PageName;

public class PageBase {

	
	private WebDriver dr;
	
	@FindBy(how=How.XPATH,using="//div[@id='header']//li[11]//a[1]")
	public WebElement welogout;
	
	@FindBy(xpath="//a[text()='Home']")
	public WebElement home;
	@FindBy(xpath="//a[text()='New']")
	public WebElement newLink;
	
	public PageBase(WebDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	
	public WebDriverWait getWait()
	  {
		  
		  WebDriverWait wait=new WebDriverWait(dr,60);
		  wait.ignoring(NoSuchElementException.class);
		  return wait;
		  
	  }
	
	
	public HomePage logoutFromApp()
	{
		
		welogout.click();
		HomePage homePage=new HomePage(dr);
		
		getWait().until(ExpectedConditions.elementToBeClickable(homePage.Wefileabug));
		return homePage;
	}
	
	public PageBase NavigateTo(PageName pagename,WebDriver dr,WebElement we)
	{
		
		getWait().until(ExpectedConditions.visibilityOf(we));   
		
		return CustomFactory.getInstance(pagename, dr);
		
		
		
	}
	
		
		
	
	
	
}
