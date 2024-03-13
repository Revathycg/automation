package com.sevenrmartsupermarket.tests;

import org.testng.annotations.Test;

import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.pages.ExpenseCatagoryPage;
import com.sevenrmartsupermarket.pages.LoginPage;

public class ExpenseCatagoryTest extends Base {

	LoginPage loginpage;
	ExpenseCatagoryPage expensecatagorypage;
	
	
	@Test
	
	public void verifyExpenseCatagory() {
		loginpage=new LoginPage(driver);
		loginpage.login();
		expensecatagorypage=new ExpenseCatagoryPage(driver);
		
		expensecatagorypage.expenseCatagory("revathy");
}
}