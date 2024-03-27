package com.sevenrmartsupermarket.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.pages.AdminUserPage;
import com.sevenrmartsupermarket.pages.LoginPage;

public class AdminUserTest extends Base {
	AdminUserPage adminuUerPage;
	LoginPage loginPage;

	@Test
	public void verifyNameList() {
		loginPage = new LoginPage(driver);
		loginPage.login();
		adminuUerPage = new AdminUserPage(driver);
		System.out.println(adminuUerPage.deactivateUser("Kenneth"));
		String expectedResult = "Alert!";
		String actualResult = adminuUerPage.getAlert();
		Assert.assertEquals(actualResult,expectedResult);
	}
}
