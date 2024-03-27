package com.sevenrmartsupermarket.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.pages.LoginPage;
import com.sevenrmartsupermarket.pages.ManageOrderPage;

public class ManageOrderTest extends Base {
	LoginPage loginPage;
	ManageOrderPage manageOrderPage;

	@Test

	public void verifyManageOrder() {
		loginPage = new LoginPage(driver);
		loginPage.login();
		manageOrderPage = new ManageOrderPage(driver);
		manageOrderPage.manageOrder("125");
		String expected = "125";
		String actual = (manageOrderPage.result());
		Assert.assertEquals(actual, expected);
	}
}
