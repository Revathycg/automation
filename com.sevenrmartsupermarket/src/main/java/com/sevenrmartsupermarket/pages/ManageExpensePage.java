package com.sevenrmartsupermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sevenrmartsupermarket.utilities.PageUtility;

public class ManageExpensePage {
	WebDriver driver;
	@FindBy(xpath = "(//p[contains(text(),'Manage Expense')])[1]")
	private WebElement clickOnManageExpense;
	@FindBy(xpath = "(//p[contains(text(),'Manage Expense')])[2]")
	private WebElement clickOnManageOption;
	@FindBy(xpath = "//a[@onClick='click_button(1)']")
	private WebElement clickOnNew;
	@FindBy(xpath = "//select[@id='user_id']")
	private WebElement selectUser;
	@FindBy(xpath = "//input[@class='form-control date']")
	private WebElement selectDate;
	@FindBy(xpath = "//select[@id='ex_cat']")
	private WebElement selectCatagory;
	@FindBy(xpath = "//select[@id='order_id']")
	private WebElement selectOrderId;
	@FindBy(xpath = "//select[@id='purchase_id']")
	private WebElement purchaseId;
	@FindBy(xpath = "//select[@id='ex_type']")
	private WebElement expenseId;
	@FindBy(xpath = "//input[@id='amount']")
	private WebElement amount1;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement save;
	@FindBy(xpath = "//h5[text()=' Alert!']")
	private WebElement alert;

	public ManageExpensePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void manageExpense() {
		clickOnManageExpense.click();
		clickOnManageOption.click();
		clickOnNew.click();
	}

	public void selectDetails(String Amount) {
		PageUtility pageutility = new PageUtility(driver);
		Select select1 = new Select(selectUser);
		select1.selectByIndex(15);
		Select select2 = new Select(selectCatagory);
		select2.selectByIndex(5);
		Select select3 = new Select(selectOrderId);
		select3.selectByIndex(3);
		Select select4 = new Select(purchaseId);
		select4.selectByIndex(6);
		Select select5 = new Select(expenseId);
		select5.selectByIndex(2);
		amount1.sendKeys(Amount);
		pageutility.scrollAndClick(save);
	}

	public void manageExpenseDetails(String Amount) {
		manageExpense();
		selectDetails(Amount);
	}

	public String alert() {
		return alert.getText();
	}
}