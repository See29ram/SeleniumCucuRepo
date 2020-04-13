package com.webdriverlearn.featurefn;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.webdriverlearn.browsers.ChromeConfig;
import com.webdriverlearn.helper.BrowserHelper;
import com.webdriverlearn.helper.ButtonHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class WaitFnStepDefn {
   
	
	private WebDriver dr;
	private BrowserHelper browHelp;
	private ButtonHelper btnHelp;
	
	@Given("^Website to be open for checking wait conditions$")
	public void website_to_be_open_for_checking_wait_conditions() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		ChromeConfig chrome=new ChromeConfig();
		dr=chrome.getChormeBrowser();
		browHelp=BrowserHelper.getInstance(dr);
		browHelp.BrowserMaximize();
		btnHelp=ButtonHelper.getInstance(dr);
		dr.get("http://www.seleniumframework.com/Practiceform/");
	   
	}

	@Given("^wait for an element \"([^\"]*)\" using implicit wait in WebPage$")
	public void wait_for_an_element_using_implicit_wait_in_WebPage(String linkName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Wait Set start..");
		dr.manage().timeouts().implicitlyWait(Integer.parseInt(linkName), TimeUnit.SECONDS);
		System.out.println("Wait Set end..");
	}

	@Then("^Click on \"([^\"]*)\" in Webpage$")
	public void click_on_in_Webpage(String linkName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click start..");
		
		btnHelp.eleClick(By.linkText(linkName));
	}
	
					
	@Given("^I wait for \"([^\"]*)\" in webpage using Explicit wait with polling (\\d+) milliseconds and (\\d+) seconds$")
	public void i_wait_for_in_webpage_using_Explicit_wait_with_polling_milliseconds_and_seconds(String ele, int poll, int max) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		dr.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(dr,max);

		wait.ignoring(NoSuchElementException.class);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(ele)));
		wait.until(customWait(By.linkText(ele)));		
	   
	}



	@Then("^Close Browser$")
	public void close_Browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   if(dr!=null)
	   {
		   dr.quit();
	   }
	}
	
	
	private Function<WebDriver,Boolean> myCustomWait()
	{
		
		Function<WebDriver,Boolean> wait=new Function<WebDriver,Boolean>(){

			@Override
			public Boolean apply(WebDriver t) {
				// TODO Auto-generated method stub
				if(t.findElements(By.linkText("Element3")).size()>0)
				{
					System.out.println("Element Found");
					return true;
				}
				System.out.println("Element checking..");
				return false;
			}
			
		
		
		    };
		    return wait;
		}
	
	private Function<WebDriver,WebElement> customWait(By ele)
	{
		
		Function<WebDriver,WebElement> wait=new Function<WebDriver,WebElement>(){

			@Override
			public WebElement apply(WebDriver t) {


				if(t.findElements(ele).size()>0)
				{
					System.out.println("Element found");
					return t.findElement(ele);
				}
				System.out.println("Checking..");
				return null;
				
				
			}
			
			
			
			
		};
		
		return wait;
	}
	
}
