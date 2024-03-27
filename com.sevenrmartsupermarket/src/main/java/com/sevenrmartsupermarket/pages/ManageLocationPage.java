package com.sevenrmartsupermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenrmartsupermarket.utilities.Data_Provider;
import com.sevenrmartsupermarket.utilities.PageUtility;

public class ManageLocationPage {
WebDriver driver;
@FindBy(xpath = "//p[text()='Manage Location']")
private WebElement clickOnLocation;
@FindBy(xpath = "//a[@onclick='click_button(1)']")
private WebElement clickOnNew;
@FindBy(xpath = "//button[@class='btn btn-danger']")
private WebElement Save;
@FindBy(xpath = "//select[@id='country_id']")
private WebElement country;
@FindBy(xpath = "//select[@id='st_id']")
private WebElement state;
@FindBy(xpath = "//input[@id='location']")
private WebElement enterLocation;
@FindBy(xpath = "//input[@id='delivery']")
private WebElement enterDeliverycharge;
@FindBy(xpath = "//h5[text()=' Alert!']")
private WebElement alert;

public ManageLocationPage(WebDriver driver) {
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
public void deliverycharge(String deliveryCharge) {
	enterDeliverycharge.sendKeys(deliveryCharge);
}
public void clickOnSSave() {
	Save.click();
}

public void createManageLocation() {
	PageUtility utility=new PageUtility(driver);
	clickOnManageLocation();
	clickNew();
	utility.select_ByIndex(country, 1);
	utility.select_ByIndex(state, 4);
}
public void manageLocationData(String location,String charge) {
	createManageLocation();
	 enterLocation( location);
	 deliverycharge(charge) ;
	 clickOnSSave();
}
public String alert() {
	return alert.getText();
}
}
