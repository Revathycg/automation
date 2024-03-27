package com.sevenrmartsupermarket.tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.pages.LoginPage;
import com.sevenrmartsupermarket.pages.ManageLocationPage;


public class ManageLocationTest extends Base
{
LoginPage loginPage;
ManageLocationPage manageLocationPage;

@Test

public void verifyManageLocation() {
	loginPage=new LoginPage(driver);
	loginPage.login();
	manageLocationPage=new ManageLocationPage(driver);
	manageLocationPage.manageLocationData("abc","100");
	Assert.assertEquals("Alert!",manageLocationPage.alert());
	
}
}
