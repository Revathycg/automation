package com.sevenrmartsupermarket.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpenseCatagoryPage {
	WebDriver driver;
	 @FindBy(xpath="(//p[contains(text(),'Manage Expense')])[1]")
	private WebElement clickOnManageExpense;
	 @FindBy(xpath="//p[text()='Expense Category']")
	 private WebElement clickOnExpenseCatagory;
	 @FindBy(xpath="//a[@onClick='click_button(1)']")
	 private WebElement clickOnNew;
	 @FindBy(xpath="//input[@id='name']")
	 private WebElement title;
	 @FindBy(xpath="(//button[@class='btn btn-block-sm btn-danger'])[2]")
	 private WebElement save;
	 @FindBy(xpath="//h5[text()=' Alert!']")
	 private WebElement Alert;
	 
	 public ExpenseCatagoryPage(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver,this);
	 
	 }
	 
	 public void expenseCatagory(String Title) {
		 clickOnManageExpense.click();
		 clickOnExpenseCatagory.click();
		 clickOnNew.click();
		 title.sendKeys(Title);
		 save.click();
	 }
	 public String alert() {
		 return  Alert.getText();
	 }
}


