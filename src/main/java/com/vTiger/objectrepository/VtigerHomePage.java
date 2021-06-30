package com.vTiger.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vTiger.generics.FileLib;
/**
 * 
 * @author md isaaq
 *
 */
public class VtigerHomePage {
	
	@FindBy(linkText="Organizations")
	private WebElement OrganizationLink;
	
	

	public WebElement getOrganizationLink() {
		return OrganizationLink;
	}

	@FindBy(xpath="//img[@style='padding: 0px;padding-left:5px']")
	private WebElement signoutbtn;

	@FindBy(linkText="Sign Out")
	private WebElement signoutlink;
	
	public VtigerHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSignoutbtn() {
		return signoutbtn;
	}

	public WebElement getSignoutlink() {
		return signoutlink;
	}
}
