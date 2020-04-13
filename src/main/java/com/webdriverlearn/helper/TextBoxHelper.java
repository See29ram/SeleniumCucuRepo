package com.webdriverlearn.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBoxHelper {

	private static TextBoxHelper tbHelper;
	private static WebDriver tbDr;

	private TextBoxHelper(WebDriver dr) {
		tbDr = dr;
	}

	public static TextBoxHelper getInstance(WebDriver dr) {

		if (tbHelper == null || tbDr.hashCode() != dr.hashCode()) {
			tbHelper = new TextBoxHelper(dr);

		}
		return tbHelper;

	}

	public void tbEnterText(By locator, String value) throws Exception {

		tbDr.findElement(locator).sendKeys(value);
		Thread.sleep(4000);

	}

	public void tbGetText(By locator) {
		String textEmail=tbDr.findElement(locator).getAttribute("value");
		System.out.println("Getting text :"+textEmail);
	}

	public void tbClearText(By locator) throws Exception {
		tbDr.findElement(locator).clear();
		Thread.sleep(4000);
	}

}
