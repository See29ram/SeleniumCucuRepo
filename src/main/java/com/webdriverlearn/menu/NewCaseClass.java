package com.webdriverlearn.menu;

import org.openqa.selenium.WebDriver;

import com.webdriverlearn.pgfactory.PageBase;

public class NewCaseClass extends PageBase{

	
private WebDriver dr;
	
	public NewCaseClass(WebDriver dr) {
		super(dr);
		this.dr=dr;
	}
	
}
