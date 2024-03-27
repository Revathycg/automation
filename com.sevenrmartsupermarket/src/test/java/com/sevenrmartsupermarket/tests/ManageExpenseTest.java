package com.sevenrmartsupermarket.tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.pages.LoginPage;
import com.sevenrmartsupermarket.pages.ManageExpensePage;
public class ManageExpenseTest extends Base{
	LoginPage loginPage;
	ManageExpensePage manageExpensePage;
	@Test
	public void manageExpense() {
		loginPage=new LoginPage(driver);
		manageExpensePage=new ManageExpensePage(driver);
		loginPage.login();
		manageExpensePage.manageExpenseDetails("1000");
		String expected="Alert!";
		String actual=manageExpensePage.alert();
		Assert.assertEquals(actual,expected);	
		}
}
