package com.sevenrmartsupermarket.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.pages.LoginPage;
import com.sevenrmartsupermarket.pages.PushNotificationPage;
import com.sevenrmartsupermarket.utilities.Excel;

public class PushNotificationTest extends Base {
PushNotificationPage PushNotificationPage;
LoginPage login;
Excel excel=new Excel();

@Test
public void verifyPushNotificationPopup() {
login=new LoginPage(driver);
	login.login();
	PushNotificationPage=new PushNotificationPage(driver);
	PushNotificationPage.clickOnPushNotification();
	excel.setExcelFile("Notifications","notification");
	String title=excel.getCellData(0, 0);
	String description=excel.getCellData(0, 1);
	System.out.println(title);
	System.out.println(description);
	PushNotificationPage.enterTitle(title);
	PushNotificationPage.enterDescription(description);
	PushNotificationPage.clickOnSendButton();
	String actualalert=PushNotificationPage.alertMessage();
	String expectedalert="Alert!";
	Assert.assertEquals(actualalert,expectedalert);
}
}