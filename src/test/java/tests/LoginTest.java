package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

//Base test became parent and LoginTest became child class
public class LoginTest extends BaseTest {

	@Test
	public void testValidLogin() {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName("admin@yourstor.com");
		loginpage.enterPassword("admin");
		loginpage.ClcikLoginButton();
		System.out.println("Title of the page is: " + driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Just a moment...");
	}
}
