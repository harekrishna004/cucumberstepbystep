package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class GoogleSearchSteps {

	WebDriver d=null;
	
//	@Given("^browser is open$")
//	public void browser_is_open() throws Throwable {
//		
//		System.out.println("user open browser");
//		String projectpath= System.getProperty("user.dir");
//		System.out.println("project path is"+projectpath);
//		System.setProperty("webdriver.chrome.driver",projectpath+"/src/test/resources/Drivers/chromedriver.exe");
//		
//		d=new ChromeDriver();
//		
//		d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		d.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		d.manage().window().maximize();
//		
//	}
//
//	@When("^user enters a text in search box$")
//	public void user_enters_a_text_in_search_box() throws Throwable {
//		System.out.println("enters text in search box");
//		d.findElement(By.name("q")).sendKeys("automation step by step");
//	}
//
//	@Then("^user is navigated to search result$")
//	public void user_is_navigated_to_search_result() throws Throwable {
//		System.out.println("user to search result");
//		
//		d.getPageSource().contains("Online Courses");
//		d.close();
//		d.quit();
//	}
//
//	@And("^user is on google search pagee$")
//	public void user_is_on_google_search_pagee() throws Throwable {
//		System.out.println("enters search page");
//		d.navigate().to("https://www.google.com/");
//	}
//
//	@And("^hits enter$")
//	public void hits_enter() throws Throwable {
//		System.out.println("user enters ");
//		d.findElement(By.name("q")).sendKeys(Keys.ENTER);
//	}
//

}
