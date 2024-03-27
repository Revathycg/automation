package com.sevenrmartsupermarket.tests;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.pages.HomePage;
import com.sevenrmartsupermarket.pages.LoginPage;
import com.sevenrmartsupermarket.utilities.Data_Provider;
import com.sevenrmartsupermarket.utilities.ScreenShot;

public class LoginTest extends Base {
	HomePage homePage;
	LoginPage loginPage;
	SoftAssert softassert=new SoftAssert();
	@Test(retryAnalyzer = com.sevenrmartsupermarket.listeners.RetryAnalyzer.class)
	public void verifyLogin() {
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		loginPage.login();
		String expectedProfileName = "Admin";
		String actualProfileName = homePage.getProfileName();
		Assert.assertEquals(actualProfileName, expectedProfileName);
	}
	
	@Test(groups = "smoke")

	public void verifyInvalidLogin() {
		loginPage = new LoginPage(driver);
		String actualInvalidMessage = loginPage.invalidlogin("abc", "ert");
		String expectedInvalidMessage = "Alert!";
		Assert.assertEquals(actualInvalidMessage, expectedInvalidMessage);
	}

	@Test(groups = "sanity")
	public void verifyRememberme() {
		loginPage = new LoginPage(driver);
		loginPage.clickOnRememberMeCheckbox();
		softassert.assertTrue(loginPage.isRemembermeCheckboxDisplayed());
		softassert.assertTrue(loginPage.isrememberMeCheckboxSelected());
		softassert.assertAll();
	}

	

}