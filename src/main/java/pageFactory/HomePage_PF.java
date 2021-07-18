package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {
	
	WebDriver d;
	
	@FindBy(id="logout")
	WebElement btn_logout;
	
     public HomePage_PF(WebDriver d) {
		
		this.d=d;
		PageFactory.initElements(d, this);
		//or
		//PageFactory.initElements(d,LoginPage_PF.class);
	}
	
	public void logoutIsDisplayed() {
		btn_logout.isDisplayed();
		
	}

}
