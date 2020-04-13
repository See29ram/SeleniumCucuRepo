package com.webdriverlearn.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	private WebDriver dr;
	
	public HomePage(WebDriver dr)
	{
		this.dr=dr;
	}
	
	//WebElements Section
	  public By fileabug=By.id("enter_bug");
	  public By quickSearch=By.id("quicksearch_main");
	
	
	//Action Section
	  public void quickSearchFunction(String searchText)
	  {
		  
	  }
	
	//Navigation Section
	  public LoginPage navigateToLoginPage()
	  {
		  LoginPage loginPage=new LoginPage(dr);
		  
		  dr.findElement(fileabug).click();	
		  WebDriverWait wait=getWait();
		  wait.until(ExpectedConditions.elementToBeClickable(loginPage.loginBtn));
		  return loginPage;
		  
	  }
	  
	  public WebDriverWait getWait()
	  {
		  
		  WebDriverWait wait=new WebDriverWait(dr,60);
		  wait.ignoring(NoSuchElementException.class);
		  return wait;
		  
	  }
	
	
}
