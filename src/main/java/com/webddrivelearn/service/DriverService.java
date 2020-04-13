package com.webddrivelearn.service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;

import com.webdriver.getutils.IReader;
import com.webdriver.getutils.ReadConfig;
import com.webdriverlearn.alerthelp.AlertHelper;
import com.webdriverlearn.browsers.BrowserConfig;
import com.webdriverlearn.browsers.ChromeConfig;
import com.webdriverlearn.browsers.FireFoxConfig;
import com.webdriverlearn.helper.BrowserHelper;
import com.webdriverlearn.helper.ButtonHelper;
import com.webdriverlearn.helper.DropdownHelper;
import com.webdriverlearn.helper.GenericHelper;
import com.webdriverlearn.helper.TextBoxHelper;
import com.webdriverlearn.windowshelp.WindowsHelper;

public class DriverService {

	private WebDriver dr;

	public WebDriver getDr() {
		return dr;
	}

	public BrowserHelper getBrowserHelp() {
		return browserHelp;
	}

	public TextBoxHelper getTbHelp() {
		return tbHelp;
	}

	public ButtonHelper getBtnHelper() {
		return btnHelper;
	}

	public DropdownHelper getDdlHelp() {
		return ddlHelp;
	}

	public WindowsHelper getWndHelper() {
		return wndHelper;
	}

	public AlertHelper getAltHelper() {
		return altHelper;
	}

	public IReader getIreader() {
		return ireader;
	}
	public GenericHelper getGenericHelper() {
		return genericHelper;
	}

	private BrowserHelper browserHelp;
	private TextBoxHelper tbHelp;
	private ButtonHelper btnHelper;
	private DropdownHelper ddlHelp;
	private WindowsHelper wndHelper;
	private AlertHelper altHelper;
	private IReader ireader;
	private BrowserConfig brwconfig;
	private GenericHelper genericHelper;

	

	public void launchBrowser() {
		// ChromeConfig chrome=new ChromeConfig();
		// dr=chrome.getChormeBrowser();

		// dr.get(url);
		ireader = new ReadConfig();
		dr=getBrowserType();
		browserHelp = BrowserHelper.getInstance(dr);
		browserHelp.BrowserMaximize();
		tbHelp = TextBoxHelper.getInstance(dr);
		btnHelper = ButtonHelper.getInstance(dr);
		ddlHelp = DropdownHelper.getInstance(dr);
		altHelper = AlertHelper.getInstance(dr);
		genericHelper=GenericHelper.getInstance(dr);
	}

	public DriverService() {
		System.out.println("---Driver Service Initiated---");
		launchBrowser();
	}

	public WebDriver getBrowserType() {

		switch (ireader.getBrowserType()) {

		case BrowserType.CHROME:

			//ChromeConfig chrome = new ChromeConfig();
			//return chrome.getChormeBrowser();
			brwconfig = new ChromeConfig();
			return brwconfig.getBrowserDriver();

		case BrowserType.FIREFOX:
			//FireFoxConfig firefox = new FireFoxConfig();
			//return firefox.getFireFoxBrowser();
			brwconfig=new FireFoxConfig();
			return brwconfig.getBrowserDriver();

		default:
			throw new RuntimeException("Invalid Browser Type " + ireader.getBrowserType());
		}

	}

}
