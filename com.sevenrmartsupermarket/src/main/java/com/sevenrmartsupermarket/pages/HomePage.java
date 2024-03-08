package com.sevenrmartsupermarket.pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
		WebDriver driver;
		 @FindBy(xpath="//a[@class='d-block']")
		 WebElement profileName;
		 public HomePage(WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver,this);
		 
}
		 public String getProfileName() {
			 return(profileName.getText());
		 }
}