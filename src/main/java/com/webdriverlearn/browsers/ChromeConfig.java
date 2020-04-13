package com.webdriverlearn.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.webdriver.getutils.ResourcePath;

public class ChromeConfig implements BrowserConfig{

	private void SetChromeConfig() {

		String chromePath=ResourcePath.getResourcePath("chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "D:\\\\seleniumJar\\\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", chromePath);
	}

	private ChromeOptions setChromeOptions() {
		ChromeOptions chromeOption = new ChromeOptions();
		chromeOption.setAcceptInsecureCerts(true);
		chromeOption.addArguments("--log-level=3");
		return chromeOption;
	}

	public WebDriver getChormeBrowser() {
		SetChromeConfig();

		WebDriver dr = new ChromeDriver(setChromeOptions());
		return dr;

	}

	@Override
	public WebDriver getBrowserDriver() {
		// TODO Auto-generated method stub
		return getChormeBrowser();
	}

}
