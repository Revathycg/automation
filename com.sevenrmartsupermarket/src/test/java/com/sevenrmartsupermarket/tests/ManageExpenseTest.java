package com.sevenrmartsupermarket.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.pages.LoginPage;
import com.sevenrmartsupermarket.pages.ManageExpensePage;

public class ManageExpenseTest extends Base{

	LoginPage loginpage;
	ManageExpensePage manageexpensepage;
	@Test
	public void manageExpense() {
		loginpage=new LoginPage(driver);
		manageexpensepage=new ManageExpensePage(driver);
		loginpage.login();
		manageexpensepage.manageExpenseDetails("1000");
		String expected=" Alert!";
		String actual=manageexpensepage.alert();
		Assert.assertEquals(actual,expected);;
	}
}
