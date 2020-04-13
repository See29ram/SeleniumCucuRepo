package com.webdriverlearn.webelementsfn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.webdriverlearn.browsers.ChromeConfig;
import com.webdriverlearn.browsers.FireFoxConfig;
import com.webdriverlearn.helper.BrowserHelper;
import com.webdriverlearn.helper.ButtonHelper;
import com.webdriverlearn.helper.DropdownHelper;
import com.webdriverlearn.helper.TextBoxHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbWebElementsStepDefn {

	private WebDriver dr;
	private BrowserHelper browserHelp;
	private WebElement we;
	private List<WebElement> totWes;
	private TextBoxHelper tbHelp;
	private ButtonHelper btnHelper;
	private DropdownHelper ddlHelp;
	
	@Given("^Launching Chrome Browser and navigating to \"([^\"]*)\" to test$")
	public void launching_Chrome_Browser_and_navigating_to_to_test(String url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\\\seleniumJar\\\\chromedriver.exe"); ChromeOptions chromeOption=new
		 * ChromeOptions(); chromeOption.setAcceptInsecureCerts(true);
		 * chromeOption.setHeadless(true); dr=new ChromeDriver(chromeOption);
		 */
		ChromeConfig chrome=new ChromeConfig();
		dr=chrome.getChormeBrowser();
		//FireFoxConfig fireFox=new FireFoxConfig();
		//dr=fireFox.getFireFoxBrowser();
		dr.get(url);
		browserHelp=BrowserHelper.getInstance(dr);
		browserHelp.BrowserMaximize();
		tbHelp=TextBoxHelper.getInstance(dr);
		btnHelper=ButtonHelper.getInstance(dr);
		ddlHelp=DropdownHelper.getInstance(dr);
	}

	@Given("^I provide unique locator for webelement$")
	public void i_provide_unique_locator_for_webelement() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		we=dr.findElement(By.id("email"));
		
	    
	}

	@Then("^I should get desired webelement$")
	public void i_should_get_desired_webelement() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(we.toString());
	}

	@Then("^I close Browser$")
	public void i_close_Browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    if(dr!=null)
	    {
	    	dr.quit();
	    }
	}
	@When("^I give non unique locator$")
	public void i_give_non_unique_locator() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    totWes= dr.findElements(By.tagName("input"));
	    
	}

	@Then("^I should get list of elements$")
	public void i_should_get_list_of_elements() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Total Elements "+totWes.size());
	}
	@When("^I enter value \"([^\"]*)\" in text box using sendkeys$")
	public void i_enter_value_in_text_box_using_sendkeys(String value) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//we=dr.findElement(By.id("email"));
		  //we.sendKeys(value);
		tbHelp.tbEnterText(By.id("email"), value);
	}

	@When("^I get value from textbox using gettext$")
	public void i_get_value_from_textbox_using_gettext() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.println(we.toString());
	    //System.out.println("Getting value from text "+we.getText());
	    tbHelp.tbGetText(By.id("email"));
	}

	@Then("^I clear textbox$")
	public void i_clear_textbox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//we.clear();
		tbHelp.tbClearText(By.id("email"));
		
	   
	}
	@Given("^I select value from radio button$")
	public void i_select_value_from_radio_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//dr.findElement(By.xpath("//label[text()='Custom']//preceding-sibling::input")).click();
		btnHelper.eleClick(By.xpath("//label[text()='Custom']//preceding-sibling::input"));
	   
	}

	@Given("^I click on button$")
	public void i_click_on_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // dr.findElement(By.id("u_0_b")).click();
		btnHelper.eleClick(By.id("u_0_b"));
		Thread.sleep(3000);
	    browserHelp.moveBack();
	    
	}

	@Then("^I click on New Page Link$")
	public void i_click_on_New_Page_Link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//dr.findElement(By.partialLinkText("Create a Page")).click();
		btnHelper.eleClick(By.partialLinkText("Create a Page"));
	    
	}
	
	@Given("^I select value based on Index$")
	public void i_select_value_based_on_Index() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		//WebElement day=dr.findElement(By.id("day"));
		//Select dayD=new Select(day);
		//dayD.selectByIndex(2);
		ddlHelp.setDDLvalue(By.id("day"), "Index", "", 2);
	   
	}

	@Given("^I select value based on Visible text$")
	public void i_select_value_based_on_Visible_text() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//WebElement month=dr.findElement(By.id("month"));
		//Select monthD=new Select(month);
		//monthD.selectByValue("8");
		ddlHelp.setDDLvalue(By.id("month"), "option", "8", 0);
	   
	}

	@Given("^I select value based on Option$")
	public void i_select_value_based_on_Option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//WebElement year=dr.findElement(By.id("year"));
		//Select yearD=new Select(year);
		//yearD.selectByVisibleText("1989");
		ddlHelp.setDDLvalue(By.id("year"), "visibletext", "1989", 0);
	}
	
	
}
