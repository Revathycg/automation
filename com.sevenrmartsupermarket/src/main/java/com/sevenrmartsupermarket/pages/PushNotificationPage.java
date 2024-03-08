package com.sevenrmartsupermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PushNotificationPage {
WebDriver driver;
LoginPage login;
@FindBy(xpath="//p[text()='Push Notifications']")
WebElement pushNotificationbutton;
@FindBy(xpath="(//input[@class='form-control'])[1]")
WebElement title;
@FindBy(xpath="(//input[@class='form-control'])[2]")
WebElement description;
@FindBy(xpath="//button[@class='btn btn-block-sm btn-info']")
WebElement send;
@FindBy(xpath="//h5[text()=' Alert!']")
WebElement alert;


public PushNotificationPage(WebDriver driver) {

	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void clickOnPushNotification() {

	
	pushNotificationbutton.click();
}
public void enterTitle(String Title)
{
	title.sendKeys(Title);
}
public void enterDescription(String Description)
{
	description.sendKeys(Description);
}
public void clickOnSendButton()
{
	send.click();
}
public String alertMessage()
{
	return alert.getText();
}
}