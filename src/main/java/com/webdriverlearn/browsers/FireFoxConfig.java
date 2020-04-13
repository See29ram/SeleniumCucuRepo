package com.webdriverlearn.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FireFoxConfig implements BrowserConfig {

	
	public void setFirefoxconfig()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\seleniumJar\\geckodriver.exe");
	}
	
	public FirefoxOptions setFireFoxOptions()
	{
		FirefoxOptions fopt=new FirefoxOptions();
		fopt.setAcceptInsecureCerts(true);
		return fopt;
	}
	
	public WebDriver getFireFoxBrowser()
	{
		
		setFirefoxconfig();
		WebDriver dr=new FirefoxDriver(setFireFoxOptions());
		return dr;
		
		
	}

	@Override
	public WebDriver getBrowserDriver() {
		// TODO Auto-generated method stub
		return getFireFoxBrowser();
	}
	
	
}
