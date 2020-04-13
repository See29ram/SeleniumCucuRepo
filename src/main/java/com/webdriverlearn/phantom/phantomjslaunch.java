package com.webdriverlearn.phantom;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class phantomjslaunch {

	
	
	public static void main(String[] args) throws Exception {
		
		
		

		System.setProperty("webdriver.chrome.driver", "D:\\seleniumJar\\chromedriver.exe"); 
        System.setProperty("webdriver.gecko.driver", "D:\\seleniumJar\\geckodriver.exe");
        
        WebDriver dr=new ChromeDriver();
        dr.manage().window().maximize();
        dr.get("https://www.google.com");
        dr=new FirefoxDriver();
        dr.get("https:www.bing.com");
        Thread.sleep(4000);
        dr.navigate().refresh();
        
        dr.quit();
		
		
        
       
	
		
		
		
	}
	
}
