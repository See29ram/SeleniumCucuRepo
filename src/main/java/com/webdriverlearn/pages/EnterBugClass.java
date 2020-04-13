package com.webdriverlearn.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnterBugClass {

	private WebDriver dr;

	public EnterBugClass(WebDriver dr) {
		this.dr = dr;
	}

	public By testngProdLink = By.xpath("//a[text()='TsetNg']");
	public By testProdLink = By.xpath("//a[text()='TestProduct']");
	
	
	public SubmitBugClass clickTestNgProd()
	{
		
		SubmitBugClass submitBug=new SubmitBugClass(dr);
		dr.findElement(testngProdLink).click();
		
		getWait().until(ExpectedConditions.visibilityOfElementLocated(submitBug.submitBug));
		return submitBug;
		
	}
	
	
	public WebDriverWait getWait()
	{
		
		WebDriverWait wait=new WebDriverWait(dr,50);
		wait.ignoring(NoSuchElementException.class);
		return wait;
		
	}

}
