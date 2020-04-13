package com.webdriverlearn.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ButtonHelper {

	
	private static ButtonHelper btnHelp;
	private static WebDriver tbDr;

	private ButtonHelper(WebDriver dr) {
		tbDr = dr;
	}

	public static ButtonHelper getInstance(WebDriver dr) {

		if (btnHelp == null || tbDr.hashCode() != dr.hashCode()) {
			btnHelp = new ButtonHelper(dr);

		}
		return btnHelp;

	}
	
	
	public void eleClick(By element)
	{
		
		tbDr.findElement(element).click();
		
	}
	
	
	
}
