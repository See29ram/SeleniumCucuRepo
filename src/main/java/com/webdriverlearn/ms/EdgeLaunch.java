package com.webdriverlearn.ms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class EdgeLaunch {

	
	
	public static void main(String[] args) {
		
		
//		System.setProperty("webdriver.edge.driver", "D:\\seleniumJar\\msedgedrivernew.exe");
//		WebDriver edge=new EdgeDriver();
//		edge.get("https://www.google.com");
//		edge.manage().window().maximize();
		
		System.setProperty("webdriver.ie.driver", "D:\\seleniumJar\\IEDriverServer.exe");
		WebDriver dr=new InternetExplorerDriver();
		dr.get("https://www.google.com");
		
		
	}
	
}
