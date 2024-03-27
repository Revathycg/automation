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
	private WebElement clickOnDeliveryOption;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	private WebElement newOption;
	@FindBy(xpath = "//input[@id='name']")
	private WebElement nameField;
	@FindBy(xpath = "(//input[@class='form-control'])[2]")
	private WebElement enterMail;
	@FindBy(xpath = "(//input[@class='form-control'])[3]")
	private WebElement enterPhone;
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement addressField;
	@FindBy(xpath = "(//input[@class='form-control'])[4]")
	private WebElement userNameField;
	@FindBy(xpath = "(//input[@class='form-control'])[5]")
	private WebElement passwordField;
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	private WebElement saveButton;
	@FindBy(xpath = "//h5[text()=' Alert!']")
	private WebElement alert;

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

		nameField.sendKeys(name);
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
	public String getAlert() {
		return alert.getText();
	}

}