package com.sevenrmartsupermarket.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.pages.LoginPage;
import com.sevenrmartsupermarket.pages.ManageDeliveryboyPage;
import com.sevenrmartsupermarket.utilities.GeneralUtility;

public class ManageDeliveryboyTest extends Base {
	ManageDeliveryboyPage manageDeliveryboyPage;
	LoginPage loginpage;
	
	@Test
	
	public void verifyManageDelivery() {
		loginpage=new LoginPage(driver);
		manageDeliveryboyPage=new ManageDeliveryboyPage(driver);
		loginpage.login();
		manageDeliveryboyPage.clickOnManageDelivery();
		String firstName="revathy" +GeneralUtility.get_RandomFirstname() ;
		manageDeliveryboyPage.createDeliveryBoy(firstName,"rv2@gmail.com","78999","abc",GeneralUtility.get_RandomFirstname(),"2345");
		 System.out.println(GeneralUtility.get_RandomFirstname());
	}
	
	
}
