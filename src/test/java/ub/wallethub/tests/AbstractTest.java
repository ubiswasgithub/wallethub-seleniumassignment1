package ub.wallethub.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import ub.wallethub.Browser;
import ub.wallethub.Nav;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class AbstractTest {

	public static String facebookUsername = "uttam29@yahoo.com";
	public static String facebookPassword = "uttamcsedu2935829";

	//
	// public static String facebookUsername ;
	// public static String facebookPassword ;

	public static WebDriver driver;
	protected Browser newBrowser;
	private String facebookUrl = "https://www.facebook.com/";
	Scanner sc;

	@BeforeClass
	@Parameters("browser")
	public void beforeTest(@Optional("chrome") String browser) {
		// sc = new Scanner(System.in);
		// System.out.println("Enter your facebook user name: ");
		// facebookUsername = sc.next();
		// System.out.println("Enter your facebook password: ");
		// facebookPassword = sc.next();
		newBrowser = new Browser(browser);
		Nav.toURL(facebookUrl);

		driver = Browser.getDriver();
	}

	@AfterClass(alwaysRun = true)
	public void closeAllBrowserAfterTest() {
		if (newBrowser != null) {
			newBrowser.quit();
		}
	}

}
