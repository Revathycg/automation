package com.sevenrmartsupermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocationPage {
	WebDriver driver;
	@FindBy(xpath = "//p[text()='Manage Location']")
	private WebElement clickOnLocation;
	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	private WebElement clickOnNew;
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	private WebElement Save;
	@FindBy(xpath = "//input[@id='location']")
	private WebElement enterLocation;
	@FindBy(xpath = "//input[@id='delivery']")
	private WebElement enterDeliverycharge;
	@FindBy(xpath = "//h5[text()=' Alert!']")
	private WebElement alert;
	public LocationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	public void clickOnManageLocation() {
		clickOnLocation.click();
		;
	}
	public void clickNew() {
		clickOnNew.click();
	}
	public void enterLocation(String location) {
		enterLocation.sendKeys(location);
	}
	public void deliverycharge(String Charge) {
		enterDeliverycharge.sendKeys(Charge);
	}
	public void clickOnSSave() {
		Save.click();
	}
	public void createLocation(String location,String charge) {
		clickOnManageLocation();
		clickNew() ;
		enterLocation(location);
		deliverycharge(charge);
		clickOnSSave();
	}
	public String alert() {
		return alert.getText();
	}
}
