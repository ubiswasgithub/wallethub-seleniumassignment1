package ub.wallethub.tests;

import org.testng.annotations.Test;
import ub.wallethub.FacebookLogin;

/**
 * 
 * @author ubiswas
 *
 */

public class FacebookLoginTest extends AbstractTest {

	FacebookLogin loginPage;

	@Test
	public void verifyFacebookLogin() {
		loginPage = new FacebookLogin(driver);
		loginPage.loginToFacebookWithYourCrendentials(facebookUsername, facebookPassword);
	}

}
