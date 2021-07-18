package StepsFor_Hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class HooksDemoSteps {
	WebDriver d=null;
	
	//@Before(order=1)
	//@Before()
	@Before(value="@smoke",order=1)
	public void browserSetup() {
		
		System.out.println("i am inside browsersetup  method");
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\Drivers\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS );
		d.manage().window().maximize();
	}
	
	@After(order=1)
	public void tearDown() {
		System.out.println("i am inside terdown method");
		d.close();
		d.quit();
	}
	
	@After(order=2)
	public void tearDown2() {
		System.out.println("i am inside teardown2 ----\n");
	}
	
	@Before(order=0)
	public void setUp2() {
		System.out.println("i am inside setup2---\n");
	}
	// @Beforesteps and @AfterSteps will run before and after every given,when keywords
//	@BeforeSteps
//	public void beforeSteps() {
//		
//		System.out.println("i am inside beforesteps------");
//	}
//	@AfterSteps
//    public void afterSteps() {
//		
//		System.out.println("i am inside beforesteps------");
//	}

	@Given(value="^user is on login page$", timeout=5000)
	public void user_is_on_login_page() throws Throwable {
	}

	@When("^user enters valid username and password$")
	public void user_enters_valid_username_and_password() throws Throwable {
	}

	@Then("^user is navigated to home page$")
	public void user_is_navigated_to_home_page() throws Throwable {
	}

	@And("^clicks on login button$")
	public void clicks_on_login_button() throws Throwable {
	}

}
