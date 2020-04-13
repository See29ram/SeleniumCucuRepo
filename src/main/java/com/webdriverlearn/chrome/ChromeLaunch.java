package com.webdriverlearn.chrome;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumJar\\chromedriver.exe");
		
        ChromeDriver chrome=new ChromeDriver();
		chrome.get("https://www.google.com");
		
	}
	
	
}
