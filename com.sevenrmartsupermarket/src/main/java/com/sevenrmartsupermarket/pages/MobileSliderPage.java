package com.sevenrmartsupermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MobileSliderPage {
	WebDriver driver;
	@FindBy(xpath = "//p[text()='Mobile Slider']")
	private WebElement clickOnMobileSlider;
	@FindBy(xpath = "//a[@onClick='click_button(1)']")
	private WebElement clickOnNew;
	@FindBy(xpath = "//select[@id='cat_id']")
	private WebElement clickOnSelect;
	@FindBy(xpath = "//input[@id='main_img']")
	private WebElement fileUpload;
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveButton;
	@FindBy(xpath = "//h5[contains(text(),' Alert!')]        ")
	private WebElement alert;
	public MobileSliderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnMobileSlider() {
		clickOnMobileSlider.click();
	}

	public void clickOnNew() {
		clickOnNew.click();
	}

	public void selectCatagory() {
		Select select = new Select(clickOnSelect);
		select.selectByIndex(10);
	}

	public void uploadFile(String filepath) {
		fileUpload.sendKeys(filepath);
	}

	public void clickOnSave() {
		saveButton.click();
	}

	public String alert() {
		return alert.getText();
	}

	public void mobileSlider(String filepath) {
		clickOnMobileSlider();
		clickOnNew();
		selectCatagory();
		uploadFile(filepath);
		clickOnSave();
	}
}
