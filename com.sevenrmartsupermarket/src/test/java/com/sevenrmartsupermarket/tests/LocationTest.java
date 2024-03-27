package com.sevenrmartsupermarket.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.pages.LocationPage;
import com.sevenrmartsupermarket.pages.LoginPage;
import com.sevenrmartsupermarket.utilities.Data_Provider;



public class LocationTest extends Base {
LoginPage loginpage;
LocationPage locationPage;	
	
	@Test(dataProvider="managelocation",dataProviderClass= Data_Provider.class)
	public void verifyLocation(String location,String charge) {
		loginpage=new LoginPage(driver);
		locationPage=new LocationPage(driver);
		loginpage.login();
		locationPage.createLocation(location, charge);
		Assert.assertEquals("Alert!",locationPage.alert());
	}
	
	
}
