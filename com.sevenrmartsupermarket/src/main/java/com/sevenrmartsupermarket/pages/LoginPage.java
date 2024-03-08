package com.sevenrmartsupermarket.pages;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenrmartsupermarket.constants.Constants;

public class LoginPage {
	WebDriver driver;
	Properties properties=new Properties();
	 @FindBy(xpath="//input[@name='username']")
	 WebElement userNameField;
	 @FindBy(xpath="(//input[@class='form-control'])[2]")
	 WebElement passwordField;
	 @FindBy(xpath="//button[@class='btn btn-dark btn-block']")
	 WebElement loginButton;
	 @FindBy(xpath=" //h5[text()=' Alert!']")
	 WebElement invalidAlertMessage;
	 @FindBy(xpath="//input[@id='remember']//following-sibling::label")
	 WebElement rememberme;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	try {
		
		FileInputStream fi = new FileInputStream(Constants.CONFIG_FILE_PATH);
		properties.load(fi);
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
		public void enterUserName(String userName) {
			userNameField.sendKeys(userName);
		}

		public void enterPassword(String password) {
			passwordField.sendKeys(password);
		}
		
		public void clickOnLoginButton() {
			loginButton.click();
		}
		
		
		public void login(String userName,String password) {
			enterUserName(userName);
			enterPassword(password);
			clickOnLoginButton();
	}

		public void login() {
String userName=properties.getProperty("userName");
String password=properties.getProperty("password");
login(userName,password);

}
		public String invalidlogin(String userName1,String password1) {
			
			
			enterUserName(userName1);
			enterPassword(password1);
			clickOnLoginButton();
			return invalidAlertMessage.getText();
			}
		public boolean remembermeCheckbox() {
			return rememberme.isDisplayed();
		}
}