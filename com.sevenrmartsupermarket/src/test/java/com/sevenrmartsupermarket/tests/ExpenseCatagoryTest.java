package com.sevenrmartsupermarket.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.pages.ExpenseCatagoryPage;
import com.sevenrmartsupermarket.pages.LoginPage;
import com.sevenrmartsupermarket.utilities.GeneralUtility;

public class ExpenseCatagoryTest extends Base {

	LoginPage loginPage;
	ExpenseCatagoryPage expenseCatagoryPage;

	@Test
	public void verifyExpenseCatagory() {
		GeneralUtility utility=new GeneralUtility();
		loginPage = new LoginPage(driver);
		loginPage.login();
		expenseCatagoryPage = new ExpenseCatagoryPage(driver);
		expenseCatagoryPage.expenseCatagory(utility.get_RandomFirstname());
		Assert.assertEquals("Alert!",expenseCatagoryPage.alert());
	}
}