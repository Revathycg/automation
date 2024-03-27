package com.sevenrmartsupermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageOrderPage {
	WebDriver driver;
	@FindBy(xpath = "//p[text()='Manage Orders']")
	private WebElement clickOnManageOrder;
	@FindBy(xpath = "//a[contains(text(),'Search')]")
	private WebElement search;
	@FindBy(xpath = "//input[@id='od']")
	private WebElement orderId;
	@FindBy(xpath = "//button[@class='btn btn-danger btn-fix']")
	private WebElement clickOnSearch;
	@FindBy(xpath = "//table//tbody//tr//td[1]")
	private WebElement result;

	public ManageOrderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnManageOrder() {
		clickOnManageOrder.click();
		search.click();
	}
	public void orderId(String id) {
		orderId.sendKeys(id);
	}
	public void clickOnSearchButton() {
		clickOnSearch.click();
	}
	public String result() {
		return result.getText();
	}
	public void manageOrder(String id) {
		clickOnManageOrder();
		orderId(id);
		clickOnSearchButton();
		result();
	}
}
