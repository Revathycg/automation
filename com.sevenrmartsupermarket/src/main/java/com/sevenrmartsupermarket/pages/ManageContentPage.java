package com.sevenrmartsupermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenrmartsupermarket.utilities.PageUtility;

public class ManageContentPage {
	WebDriver driver;
	@FindBy(xpath = "//p[contains(text(),'Manage Content')]    ")
	WebElement clickOnContent;
	@FindBy(xpath = "//p[contains(text(),'Manage Pages')]   ")
	WebElement clickOnPage;
	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	WebElement clickOnNew;
	@FindBy(xpath = "//input[@id='title'] ")
	WebElement enterTitle;
	@FindBy(xpath = "//input[@id='page']")
	WebElement enterPageName;
	@FindBy(xpath = "//input[@id='main_img']")
	WebElement fileUpload;
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	WebElement save;
	@FindBy(xpath = "//h5[text()=' Alert!']")
	WebElement alert;
	PageUtility pageutility;

	public ManageContentPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void clickOnManageContent() {
		clickOnContent.click();
	}

	public void clickOnManagePage() {
		clickOnPage.click();
	}

	public void clickOnNew() {
		clickOnNew.click();
	}

	public void enterTitle(String title) {
		enterTitle.sendKeys(title);
	}

	public void enterPage(String page) {
		enterPageName.sendKeys(page);
	}

	public void fileUploading(String filepath) {
		fileUpload.sendKeys(filepath);

	}

	public void clickOnSave() {
		pageutility = new PageUtility(driver);
		pageutility.scrollAndClick(save);
	}

	public void createManageContent(String title, String page, String filepath) {
		clickOnManageContent();
		clickOnManagePage();
		clickOnNew();
		enterTitle(title);
		enterPage(page);
		fileUploading(filepath);
		clickOnSave();
	}

	public String alertmessage() {
		return alert.getText();
	}
}
