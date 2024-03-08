package com.sevenrmartsupermarket.tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.pages.LoginPage;
import com.sevenrmartsupermarket.pages.ManageContentPage;

public class ManageContentTest extends Base{
ManageContentPage managecontentpage;
LoginPage loginpage;
	
	
	@Test(groups= {"group1","group2"})
	public void verifyManageContent() {
		loginpage=new LoginPage(driver);
		loginpage.login();
		managecontentpage=new ManageContentPage(driver);
		managecontentpage.createManageContent("product", "700", "C:\\new image.png");
		String expectedmessage="Alert!";
		String actualmessage=managecontentpage.alertmessage();
		Assert.assertEquals(actualmessage,expectedmessage);
	}
	
}
