package com.webdriverlearn.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownHelper {

	private static DropdownHelper ddlHelper;
	private static WebDriver ddr;

	private DropdownHelper(WebDriver dr) {

		ddr = dr;
	}

	public static DropdownHelper getInstance(WebDriver dr) {

		if (ddlHelper == null || ddr.hashCode() != dr.hashCode()) {
			ddlHelper = new DropdownHelper(dr);
		}
		return ddlHelper;
	}

	public void setDDLvalue(By locator, String optionvalue, String ddlvalue, int indexvalue) {

		WebElement ddl = ddr.findElement(locator);
		Select dropdown = new Select(ddl);

		switch (optionvalue) {
		case "Index":
			dropdown.selectByIndex(indexvalue);
			break;
		case "visibletext":
			dropdown.selectByVisibleText(ddlvalue);
			break;
		case "option":
			dropdown.selectByValue(ddlvalue);
			break;
		default:
			System.out.println("Wrong option");
		}

	}
	public void setDDLvalue(WebElement we, String optionvalue, String ddlvalue, int indexvalue) {

		WebElement ddl = we;
		Select dropdown = new Select(ddl);

		switch (optionvalue) {
		case "Index":
			dropdown.selectByIndex(indexvalue);
			break;
		case "visibletext":
			dropdown.selectByVisibleText(ddlvalue);
			break;
		case "option":
			dropdown.selectByValue(ddlvalue);
			break;
		default:
			System.out.println("Wrong option");
		}

	}

}
