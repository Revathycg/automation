package com.sevenrmartsupermarket.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenrmartsupermarket.utilities.GeneralUtility;

public class HomePage {

	WebDriver driver;
	@FindBy(xpath = "//a[@class='d-block']")
	private WebElement profileName;
	@FindBy(xpath = "//section//div//p")
	private List<WebElement> listOfContent;
	GeneralUtility generalutility = new GeneralUtility();

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getProfileName() {
		return (profileName.getText());
	}

	public List<String> content() {
		List<String> contentList = new ArrayList();
		contentList = generalutility.getTextofElements(listOfContent);
		return contentList;
	}
}