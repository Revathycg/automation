package com.sevenrmartsupermarket.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenrmartsupermarket.utilities.GeneralUtility;

public class AdminUserPage {
WebDriver driver;
@FindBy(xpath="//table//tbody/tr//td[1]")
List<WebElement> namelist;
@FindBy(xpath="(//p[text()='Admin Users'])[1]")
WebElement adminuser;
@FindBy(xpath="//table//tbody/tr[5]//td[5]")
WebElement unlockbutton;
GeneralUtility generalutility=new GeneralUtility();
	public  AdminUserPage(WebDriver driver) {
		this.driver=driver;
		 PageFactory.initElements(driver,this);
	}
	
	public String deactivateUser(String person) {
		adminuser.click();
		List<String>names=new ArrayList<String>();
		names=(generalutility.getTextofElements(namelist));
		int index=0;
		 for(index=0;index<names.size();index++) {
			 if(person.equals(names.get(index))) {
			 index++;
			 break;}}
		 WebElement unlockbutton=driver.findElement(By.xpath("//table//tbody/tr["+index+"]//td[5]//a[1]"));
		 unlockbutton.click();
		 WebElement element=driver.findElement(By.xpath("//table//tbody/tr["+index+"]//td[3]"));
		 return element.getText();
		 
}}