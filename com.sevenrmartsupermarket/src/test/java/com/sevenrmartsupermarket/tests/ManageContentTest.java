package com.sevenrmartsupermarket.tests;

import static org.testng.Assert.assertEquals;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.constants.Constants;
import com.sevenrmartsupermarket.pages.LoginPage;
import com.sevenrmartsupermarket.pages.ManageContentPage;
import com.sevenrmartsupermarket.utilities.GeneralUtility;
import com.sevenrmartsupermarket.utilities.PageUtility;

public class ManageContentTest extends Base {
	ManageContentPage manageContentPage;
	LoginPage loginPage;
	@Test(groups = { "smoke", "sanity" })
	public void verifyManageContent() {
		loginPage = new LoginPage(driver);
		GeneralUtility utility=new GeneralUtility();
		loginPage.login();
		manageContentPage = new ManageContentPage(driver);
		manageContentPage.createManageContent("product","255", Constants.IMAGE_PATH);
		String expectedmessage = "Alert!";
		String actualmessage = manageContentPage.alertmessage();
		Assert.assertEquals(actualmessage, expectedmessage);
	}

}
