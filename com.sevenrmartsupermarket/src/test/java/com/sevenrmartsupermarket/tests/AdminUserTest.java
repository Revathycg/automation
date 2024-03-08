package com.sevenrmartsupermarket.tests;

import org.testng.annotations.Test;

import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.pages.AdminUserPage;
import com.sevenrmartsupermarket.pages.LoginPage;

public class AdminUserTest extends Base{
AdminUserPage adminuserpage;
	LoginPage loginpage;
	@Test
	public void verifyNameList() {
		loginpage=new LoginPage(driver);
		loginpage.login();
		adminuserpage	=new AdminUserPage(driver);
		System.out.println(adminuserpage.deactivateUser("admin123**Mandy"));	
	}
}
