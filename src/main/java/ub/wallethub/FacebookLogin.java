package ub.wallethub;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.base.Verify;

public class FacebookLogin {
	
	@FindBy(id= "email")
	@CacheLookup
	WebElement element_facebook_username;
	
	@FindBy(id= "pass")	
	@CacheLookup
	WebElement element_facebook_password;
	
	@FindBy(id ="loginbutton")
	@CacheLookup
	WebElement element_facebook_login;
	
	
	WebDriver driver;


	public FacebookLogin(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}



	public void loginToFacebookWithYourCrendentials(String facebookUsername, String facebookPassword) {
		element_facebook_username.sendKeys(facebookUsername);
		element_facebook_password.sendKeys(facebookPassword);
		element_facebook_login.click();
		
	}

}
