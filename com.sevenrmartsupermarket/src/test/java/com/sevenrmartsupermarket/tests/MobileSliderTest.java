package com.sevenrmartsupermarket.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.constants.Constants;
import com.sevenrmartsupermarket.pages.LoginPage;
import com.sevenrmartsupermarket.pages.MobileSliderPage;

public class MobileSliderTest extends Base {
	LoginPage loginPage;
	MobileSliderPage mobileSliderPage;

	@Test
	public void verifyMobileSliderPage() {
		loginPage = new LoginPage(driver);
		mobileSliderPage = new MobileSliderPage(driver);
		loginPage.login();
		mobileSliderPage.mobileSlider(Constants.IMAGE_PATH);
		String expected = "Alert!";
		String actual = mobileSliderPage.alert();
		Assert.assertEquals(actual, expected);
	}
}
