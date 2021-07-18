package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocator;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage_PF {
	WebDriver d;
	
	@FindBy(id="name")
	//@CacheLookup // to store in memory dont use for ajax or where element keep on changing
	WebElement txt_username;
	
	@FindBy(id="password")
	WebElement txt_password;
	
	@FindBy(id="login")
	WebElement btn_login;
	
//	@FindBy(id="logout")
//	WebElement btn_logout;
	
	public LoginPage_PF(WebDriver d) {
		
		this.d=d;
		PageFactory.initElements(d, this);
		//or
		//PageFactory.initElements(d,LoginPage_PF.class);
		//for ajax element loading we can use
		//PageFactory.initElements(new AjaxElementLocatorFactory(d, 30),this);
		
	}
	
	public void enterUserName(String username) {
		txt_username.sendKeys(username);
		
	}
	
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
		
	}
	
	public void clickOnLogin() {
		btn_login.click();
		
	}
	
//	public void logoutIsDisplayed() {
//		btn_logout.isDisplayed();
//		
//	}

}
