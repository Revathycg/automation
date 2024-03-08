package com.sevenrmartsupermarket.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenrmartsupermarket.utilities.PageUtility;

public class ManageDeliveryboyPage {
	PageUtility pageutility;
	WebDriver driver;
	@FindBy(xpath = "//p[contains(text(),'Manage Delivery Boy')]")
	WebElement clickOnDeliveryOption;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newOption;
	@FindBy(xpath = "//input[@id='name']")
	WebElement namefield;
	@FindBy(xpath = "(//input[@class='form-control'])[2]")
	WebElement enterMail;
	@FindBy(xpath = "(//input[@class='form-control'])[3]")
	WebElement enterPhone;
	@FindBy(xpath = "//textarea[@id='address']")
	WebElement addressField;
	@FindBy(xpath = "(//input[@class='form-control'])[4]")
	WebElement userNameField;
	@FindBy(xpath = "(//input[@class='form-control'])[5]")
	WebElement passwordField;
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement saveButton;

	public ManageDeliveryboyPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void clickOnManageDelivery() {
		clickOnDeliveryOption.click();
	}

	public void clickOnNew() {
		newOption.click();
	}

	public void enterName1(String name) {

		namefield.sendKeys(name);
	}

	public void enterMail(String email) {

		enterMail.sendKeys(email);
	}

	public void enterPhone(String phonenum) {

		enterPhone.sendKeys(phonenum);
	}

	public void enterAddress(String address) {

		addressField.sendKeys(address);
	}

	public void enterUserName(String userName) {

		userNameField.sendKeys(userName);
	}

	public void enterPassword(String password) {

		passwordField.sendKeys(password);
	}

	public void clickOnSave() {
		pageutility = new PageUtility(driver);
		pageutility.scrollAndClick(saveButton);

	}

	public void createDeliveryBoy(String name, String mailid, String number, String address, String userName,
			String password) {
		clickOnNew();
		enterName1(name);
		enterMail(mailid);
		enterPhone(number);
		enterAddress(address);
		enterUserName(userName);
		enterPassword(password);

		clickOnSave();
	}

}