package com.vTiger.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author md isaaq
 *
 */
public class OrganizationsPage {

	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createOrganizationsbtn;
	
	public OrganizationsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateOrganizationsbtn() {
		return createOrganizationsbtn;
	}
	
}
