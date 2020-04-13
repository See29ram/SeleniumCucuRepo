package com.webddriverlearn.firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFire {

	
	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.gecko.driver", "D:\\seleniumJar\\geckodriver.exe");
		WebDriver dr=new FirefoxDriver();
		dr.manage().window().maximize();
		dr.get("https://www.google.com");
		
		
	}
	
}
