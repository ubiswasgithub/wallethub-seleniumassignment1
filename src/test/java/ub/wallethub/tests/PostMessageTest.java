package ub.wallethub.tests;

import org.testng.annotations.Test;
import ub.wallethub.FacebookLogin;
import ub.wallethub.PostMessage;

/**
 * 
 * @author ubiswas
 *
 */

public class PostMessageTest extends AbstractTest {

	PostMessage postMessagePage;
	FacebookLogin loginPage;
	private String postMessage = "Hello World";

	@Test
	public void verifyUserCanPostAMessageToHisWall() {
		loginPage = new FacebookLogin(driver);
		loginPage.loginToFacebookWithYourCrendentials(facebookUsername, facebookPassword);
		postMessagePage = new PostMessage(driver);
		postMessagePage.createYourPost(postMessage);
		postMessagePage.matchYourPost(postMessage);

	}

}
