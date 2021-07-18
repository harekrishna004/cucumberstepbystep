package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import pages.LoginPage;


public class LoginDemoSteps_POM {

//	WebDriver d=null;
//	LoginPage login;
//	
//
//	@Given("^browser is open$")
//	public void browser_is_open() throws Throwable {
//
//		System.out.println("user open browser");
//		String projectpath= System.getProperty("user.dir");
//		System.out.println("project path is"+projectpath);
//	
//		System.setProperty("webdriver.chrome.driver",projectpath+"/src/test/resources/Drivers/chromedriver.exe");
//
//		d=new ChromeDriver();
//
//		d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		d.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		d.manage().window().maximize();
//	}
//
//	@When("^user enters (.+) and (.+)$")
//	public void user_enters_and(String username, String password) {
//		
//		 login=new LoginPage(d);
//		
//		login.enterUserName(username);
//		login.enterPassword(password);
//		
//		
//
//		//d.findElement(By.id("name")).sendKeys(username);
//		//d.findElement(By.id("password")).sendKeys(password);
//	}
//
//	@Then("^user is navigated to home page$")
//	public void user_is_navigated_to_home_page() throws Throwable {
//
//		login.checkLogOutIsDisplayed();
//		d.close();
//		d.quit();
//	}
//
//	@And("^user is on login page$")
//	public void user_is_on_login_page() throws Throwable {
//
//		d.navigate().to("https://example.testproject.io/web/");
//	}
//
//	@And("^user clicks on login$")
//	public void user_clicks_on_login() throws Throwable {
//
//		login.ClickLogin();
//	}



}
