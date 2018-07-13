package ub.wallethub;

public class Nav {
	public static void toURL(String url) {

		Browser.getDriver().get(url);
	}
}
