package com.sevenrmartsupermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpenseCatagoryPage {
	WebDriver driver;
	@FindBy(xpath = "(//p[contains(text(),'Manage Expense')])[1]")
	private WebElement clickOnManageExpense;
	@FindBy(xpath = "//p[text()='Expense Category']")
	private WebElement clickOnExpenseCatagory;
	@FindBy(xpath = "//a[@onClick='click_button(1)']")
	private WebElement clickOnNew;
	@FindBy(xpath = "//input[@id='name']")
	private WebElement titleField;
	@FindBy(xpath = "(//button[@class='btn btn-block-sm btn-danger'])[2]")
	private WebElement save;
	@FindBy(xpath = "//h5[text()=' Alert!']")
	private WebElement Alert;

	public ExpenseCatagoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnManageExpense() {
		clickOnManageExpense.click();
	}

	public void clickOnCatagory() {
		clickOnExpenseCatagory.click();
	}

	public void clickOnNewButton() {
		clickOnNew.click();
	}

	public void enterTitle(String title) {

		titleField.sendKeys(title);
	}

	public void clickOnSave() {

		save.click();
	}

	public void expenseCatagory(String title) {
		clickOnManageExpense();
		clickOnCatagory();
		clickOnNewButton();
		enterTitle(title);
		clickOnSave();
	}

	public String alert() {
		return Alert.getText();
	}
}
