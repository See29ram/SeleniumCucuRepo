package com.webdriverlearn.menu;

import org.openqa.selenium.WebDriver;

import com.webdriverlearn.pgfactory.PageBase;

public class ProductDashboardClass extends PageBase{

	
	private WebDriver dr;
	
	public ProductDashboardClass(WebDriver dr) {
		super(dr);
		this.dr=dr;
	}
}
