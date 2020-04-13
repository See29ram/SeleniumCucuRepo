package com.webdriverlearn.pgfactory;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginPage extends PageBase{

	
	private WebDriver dr;
	
	public LoginPage(WebDriver dr)
	{
		super(dr);
		this.dr=dr;
		//PageFactory.initElements(dr, this);
	}
	
	//WebElements
	@FindBy(how=How.ID,using="Bugzilla_login")
	WebElement weUserName;
	@FindBy(id="Bugzilla_password")
	WebElement wepassword;
	@FindBy(how=How.XPATH,using="//input[@id='log_in']")
	WebElement weLoginBtn;
	//public By userName=By.id("Bugzilla_login");
	//public By passWord=By.id("Bugzilla_password");
	//public By loginBtn=By.id("log_in");
	
	//Actions
	  //Reset Password
	  //Search
	
	//Navigation
	
	public EnterBugClass Login(String username,String password)
	{
		EnterBugClass enterBug=new EnterBugClass(dr);
		weUserName.sendKeys(username);
		wepassword.sendKeys(password);
		weLoginBtn.click();
		getWait().until(ExpectedConditions.elementToBeClickable(enterBug.weTestng));
		return enterBug;
		
	}
	
	
	
	
}
