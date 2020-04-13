package com.webdriverlearn.pgfactory;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends PageBase{

	private WebDriver dr;
	
	public HomePage(WebDriver dr)
	{
		super(dr);
		this.dr=dr;
		//PageFactory.initElements(dr, this);
	}
	
	@FindBy(how=How.ID,using="enter_bug")
	WebElement Wefileabug;
	
	@FindBy(how=How.ID,using="quicksearch_main")
	WebElement WequickSearch;
	//WebElements Section
	  //public By fileabug=By.id("enter_bug");
	  //public By quickSearch=By.id("quicksearch_main");
	
	
	//Action Section
	  public void quickSearchFunction(String searchText)
	  {
		  
	  }
	
	//Navigation Section
	  public LoginPage navigateToLoginPage()
	  {
		  LoginPage loginPage=new LoginPage(dr);
		  
		  Wefileabug.click();	
		  WebDriverWait wait=getWait();
		  wait.until(ExpectedConditions.elementToBeClickable(loginPage.weLoginBtn));
		  return loginPage;
		  
	  }
	  
	 
	
	
}
