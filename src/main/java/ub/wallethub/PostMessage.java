package ub.wallethub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.base.Verify;

public class PostMessage {
	
	@FindBy(xpath = "//textarea[@name='xhpc_message']")
	private WebElement element_post_message_editor;
	

	By element_post_button = new By.ByXPath("//button[contains(.,'Post')]");
	By element_posted_text = new By.ByXPath("//div[@class='_5_jv _58jw']");

	
	UiHelper uihelper = new UiHelper();
	WebDriver driver;
	public PostMessage(WebDriver driver){
		this.driver = driver;		
		PageFactory.initElements(driver, this);
	}
	
	public void createYourPost(String message){
		element_post_message_editor.sendKeys(message);	
		uihelper.moveToActiveElement();	
		UiHelper.click(element_post_button);		
		uihelper.waitForElementTorender();
		Verify.verify(messageComposerIsPresent());
	}
	
	public boolean messageComposerIsPresent(){
		
		return element_post_message_editor.isDisplayed();
	}
	
	public String getPostedMesage(){
		uihelper.getPageReresh();
		uihelper.moveToActiveElement();	
		uihelper.waitUntilElementIsClickable(element_posted_text);
		return uihelper.getText(element_posted_text);
		
	}

	public void matchYourPost(String message) {		
		  Verify.verify(getPostedMesage().equalsIgnoreCase(message));
	}

}
