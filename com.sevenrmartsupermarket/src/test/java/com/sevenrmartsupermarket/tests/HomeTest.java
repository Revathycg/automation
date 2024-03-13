package com.sevenrmartsupermarket.tests;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.pages.HomePage;
import com.sevenrmartsupermarket.pages.LoginPage;
import com.sevenrmartsupermarket.utilities.Excel;

public class HomeTest extends Base{

 LoginPage loginpage;
 HomePage homepage;
 
 @Test
 public void verifycontent() {
	 loginpage=new LoginPage(driver);
	 homepage=new HomePage(driver);
	 loginpage.login();
		 List<String> names=new ArrayList();
	 names.add("Manage Pages");
	names.add("Admin Users");
	names.add("Dashboard");
	names.add("Category");
	names.add("Manage Product");
	names.add("Manage Offer Code");
	names.add("Manage Slider");
	names.add("Manage Delivery Boy");
	names.add("Manage Users");
	names.add("Manage Orders");
	names.add("Manage Location");
	names.add("Mobile Slider");
	names.add("Manage News");
	names.add("Manage Expense");
	names.add("Manage Gift cards &vouchers");
	names.add("Manage Gift cards &vouchers");
	List<String> expectedlist=names;
	List<String>actuallist=homepage.content();
	Assert.assertEquals(actuallist,expectedlist);
	
	
	
 }
}