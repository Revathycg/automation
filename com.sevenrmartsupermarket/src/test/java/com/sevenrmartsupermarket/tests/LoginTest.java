package com.sevenrmartsupermarket.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.pages.HomePage;
import com.sevenrmartsupermarket.pages.LoginPage;
import com.sevenrmartsupermarket.utilities.ScreenShot;

public class LoginTest extends Base {
 
	HomePage homepage;
	 LoginPage loginpage;
	 
	
	@Test
	public void verifyLogin() {
		loginpage=new LoginPage(driver);
		homepage=new HomePage(driver);
		loginpage.login();
		String expectedProfileName="Admin";
		String actualProfileName= homepage.getProfileName();
		Assert.assertEquals(actualProfileName,expectedProfileName);
	}
	@Test(groups="smoke")

public void verifyInvalidLogin() {
	loginpage=new LoginPage(driver);

	String actualInvalidMessage=loginpage.invalidlogin("abc","ert");
	String expectedInvalidMessage="Alert!";
			
	
	Assert.assertEquals(actualInvalidMessage,expectedInvalidMessage);
	
}@Test(groups="sanity")
public void verifyRemembermeCheckbox() {
	loginpage=new LoginPage(driver);
	boolean x=loginpage.remembermeCheckbox();
	
	Assert.assertTrue(x);
}
}