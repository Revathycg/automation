package com.sevenrmartsupermarket.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.pages.LoginPage;
import com.sevenrmartsupermarket.pages.MobileSliderPage;

public class MobileSliderTest extends Base{
LoginPage loginpage;
MobileSliderPage mobilesliderpage;

@Test

public void verifyMobileSliderPage() {
	loginpage=new LoginPage(driver);
	mobilesliderpage=new MobileSliderPage(driver);
	loginpage.login();
	mobilesliderpage.mobileSlider("C:\\new image.png");
	String expected="Alert!";
	String actual=	mobilesliderpage.alert();
	Assert.assertEquals(actual,expected);
}
}
