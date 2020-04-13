package com.webdriverlearn.helper;

import org.openqa.selenium.WebDriver;

public class BrowserHelper {

	
	private static BrowserHelper browserHelper;
	private  static WebDriver wdr;
	private BrowserHelper(WebDriver dr)
	{
		wdr=dr;

	}
	
	
	public static BrowserHelper getInstance(WebDriver dr)
	{
		
		
		if(browserHelper==null || wdr.hashCode()!=dr.hashCode())
		{
			
			browserHelper=new BrowserHelper(dr);
			
		}
		System.out.println("Webdrive Name in other Init");
		return browserHelper;
	}
	
	public void moveForward()
	{
		System.out.println("Webdrive Name in forward"+wdr.toString());
		wdr.navigate().forward();
	}
	
	public void moveBack() throws Exception
	{
		System.out.println("Webdrive Name in back"+wdr.toString());
		wdr.navigate().back();
		Thread.sleep(4000);
		System.out.println("Back Navigated..");
	}
	public void refreshPage()
	{
		wdr.navigate().refresh();
	}
	public void BrowserMaximize()
	{
		wdr.manage().window().maximize();
	}
	
}
