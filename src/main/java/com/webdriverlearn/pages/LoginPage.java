package com.webdriverlearn.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	
	private WebDriver dr;
	
	public LoginPage(WebDriver dr)
	{
		this.dr=dr;
	}
	
	//WebElements
	public By userName=By.id("Bugzilla_login");
	public By passWord=By.id("Bugzilla_password");
	public By loginBtn=By.id("log_in");
	
	//Actions
	  //Reset Password
	  //Search
	
	//Navigation
	
	public EnterBugClass Login(String username,String password)
	{
		EnterBugClass enterBug=new EnterBugClass(dr);
		dr.findElement(userName).sendKeys(username);
		dr.findElement(passWord).sendKeys(password);
		dr.findElement(loginBtn).click();
		getWait().until(ExpectedConditions.elementToBeClickable(enterBug.testngProdLink));
		return enterBug;
		
	}
	
	public WebDriverWait getWait()
	  {
		  
		  WebDriverWait wait=new WebDriverWait(dr,60);
		  wait.ignoring(NoSuchElementException.class);
		  return wait;
		  
	  }
	
	
}
