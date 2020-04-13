package com.webdriverlearn.menu;

import org.openqa.selenium.WebDriver;

import com.webdriverlearn.pgfactory.PageBase;

public class NewRunClass extends PageBase{

	
private WebDriver dr;
	
	public NewRunClass(WebDriver dr) {
		super(dr);
		this.dr=dr;
	}
	
}
