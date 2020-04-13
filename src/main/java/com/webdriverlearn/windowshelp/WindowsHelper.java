package com.webdriverlearn.windowshelp;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowsHelper {

	private static WindowsHelper wndhelper;

	private static WebDriver ddr;

	private WindowsHelper(WebDriver dr) {
		ddr = dr;
	}

	public static WindowsHelper getInstance(WebDriver dr) {

		if (wndhelper == null || ddr.hashCode() != dr.hashCode()) {
			wndhelper = new WindowsHelper(dr);
		}

		return wndhelper;

	}

	public ArrayList<String> getAllWnds() {

		Set<String> allwnds = ddr.getWindowHandles();
		ArrayList<String> arrwnds = new ArrayList<>(allwnds);
		return arrwnds;

	}

	public void switchToWnd(int index) {

		WebDriverWait wait=getWait();
		wait.until(ExpectedConditions.numberOfWindowsToBe(index));
		
		ArrayList<String> wnds = getAllWnds();
		
		if(index<0 || wnds.size()<index)
			
			throw new IllegalArgumentException("Invalid Index");

		ddr.switchTo().window(wnds.get(index-1));

	}
	
	public WebDriverWait getWait()
	{
		
		WebDriverWait wait=new WebDriverWait(ddr,20);
		return wait;
		
	}
	
	public void switchToParent()
	{
		ArrayList<String> wnds = getAllWnds();
		ddr.switchTo().window(wnds.get(0));
	}
	
	public void switchToParentAndCloseOthers()
	{
		
		ArrayList<String> wnds = getAllWnds();
		
		for(int i=1;i<wnds.size();i++)
		{
			ddr.switchTo().window(wnds.get(i)).close();
		}
		switchToParent();
		
	}

}
