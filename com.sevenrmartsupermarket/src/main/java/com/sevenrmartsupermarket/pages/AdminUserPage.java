package com.sevenrmartsupermarket.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenrmartsupermarket.utilities.GeneralUtility;
import com.sevenrmartsupermarket.utilities.PageUtility;

public class AdminUserPage {
	WebDriver driver;
	@FindBy(xpath = "//table//tbody/tr//td[1]")
	private List<WebElement> nameList;
	@FindBy(xpath = "(//p[text()='Admin Users'])[1]")
	private WebElement adminUser;
	@FindBy(xpath = "//table//tbody/tr[5]//td[5]")
	private WebElement unlockButton;
	@FindBy(xpath = "//h5[text()=' Alert!']")
	private WebElement alert;
	GeneralUtility generalUtility = new GeneralUtility();
	
	public AdminUserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String deactivateUser(String person) {
		PageUtility utility = new PageUtility(driver);
		adminUser.click();
		List<String> names = new ArrayList<String>();
		names = (generalUtility.getTextofElements(nameList));
		int index = 0;
		for (index = 0; index < names.size(); index++) {
			if (person.equals(names.get(index))) {
				index++;
				break;
			}
		}
		WebElement unlockButton = driver.findElement(By.xpath("//table//tbody/tr[" + index + "]//td[5]//a[1]"));
		utility.scrollAndClick(unlockButton);
		WebElement element = driver.findElement(By.xpath("//table//tbody/tr[" + index + "]//td[3]"));
		return element.getText();
	}
	public String getAlert() {
		return alert.getText();
	}
}