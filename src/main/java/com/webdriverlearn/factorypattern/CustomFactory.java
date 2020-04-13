package com.webdriverlearn.factorypattern;

import org.openqa.selenium.WebDriver;

import com.webdriverlearn.menu.ProductDashboardClass;
import com.webdriverlearn.pgfactory.BugSummaryPage;
import com.webdriverlearn.pgfactory.EnterBugClass;
import com.webdriverlearn.pgfactory.HomePage;
import com.webdriverlearn.pgfactory.LoginPage;
import com.webdriverlearn.pgfactory.PageBase;
import com.webdriverlearn.pgfactory.SubmitBugClass;

public class CustomFactory {

	public static PageBase getInstance(PageName name, WebDriver dr) {

		switch (name) {

		case HomePage:
			return new HomePage(dr);
			
		case LoginPage:
			return new LoginPage(dr);
		case SubmitBugClass:
			return new SubmitBugClass(dr);
		case BugSummaryPage:
			return new BugSummaryPage(dr);
		case ProductDashboardClass:
			return new ProductDashboardClass(dr);
		case EnterBugClass:
			return new EnterBugClass(dr);
		default:
			throw new RuntimeException("Invalid Page");
		}

	}

}
