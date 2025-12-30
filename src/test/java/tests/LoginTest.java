package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest{
	@Test
	public void loginAndLogout() {

		LoginPage a = PageFactory.initElements(driver, LoginPage.class);
		a.clickOnLoginHome();
		a.clickOnLogin();

	    a.enterEmail("shivajith1998@gmail.com");
	    a.enterPassword("Ajith@!34");
	    a.clickSignIn();

	}
}
