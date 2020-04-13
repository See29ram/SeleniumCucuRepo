package com.webdriverlearn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
//    	System.setProperty("webdriver.chrome.driver", "D:\\seleniumJar\\chromedriver.exe");
//    	WebDriver dr=new ChromeDriver();
//    	dr.get("https://www.google.com");
//    	dr.manage().window().maximize();
//    	Actions act=new Actions(dr);
//    	act.keyDown(Keys.SHIFT).sendKeys(dr.findElement(By.name("q")), "selenium").keyUp(Keys.SHIFT).build().perform();
//    	act.sendKeys(Keys.chord(Keys.ENTER)).build().perform();
    	
    	
    	//System.out.println(System.getProperty("file.separator"));
    	System.out.println(new App().getClass().getClassLoader().getResource(""));
    	
    	
    }
}
