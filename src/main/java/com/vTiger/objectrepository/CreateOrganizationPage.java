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
public class CreateOrganizationPage {

	@FindBy(name="accountname")
	private WebElement accountnametbx;
	
	@FindBy(name="website")
	private WebElement websitetbx;

	@FindBy(id="tickersymbol")
	private WebElement tickersymboltbx;

	@FindBy(id="employees")
	private WebElement employeestbx;

	@FindBy(id="email2")
	private WebElement emailtbx;

	@FindBy(name="industry")
	private WebElement industrylstbx;

	@FindBy(name="accounttype")
	private WebElement accounttypelstbx;

	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkbox1;

	@FindBy(id="phone")
	private WebElement phonetbx;

	@FindBy(id="fax")
	private WebElement faxtbx;

	@FindBy(name="rating")
	private WebElement ratinglstbx;

	@FindBy(id="siccode")
	private WebElement siccodetbx;

	@FindBy(xpath="//input[@type='checkbox']//following::input[@type='checkbox']")
	private WebElement checkbox2;

	@FindBy(id="bill_city")
	private WebElement citytbx;

	@FindBy(id="bill_state")
	private WebElement statetbx;

	@FindBy(id="bill_code")
	private WebElement codetbx;

	@FindBy(id="bill_country")
	private WebElement countrytbx;

	@FindBy(xpath="//input[@onclick='return copyAddressRight(EditView)']")
	private WebElement copyAddressRightchbx;

	@FindBy(name="description")
	private WebElement descriptiontbx;

	@FindBy(name="button")
	private WebElement savebtn;

	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement campignInfotxt;
	
	@FindBy(xpath="//option[@value='Engineering']")
	private WebElement engineerinfopt;
	
	@FindBy(xpath="//option[@value='Analyst']")
	private WebElement accountTypefopt;
	
	@FindBy(name="Delete")
	private WebElement deleteAccount;

  
	public CreateOrganizationPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getAccountnametbx() {
		return accountnametbx;
	}


	public WebElement getWebsitetbx() {
		return websitetbx;
	}


	public WebElement getTickersymboltbx() {
		return tickersymboltbx;
	}


	public WebElement getEmployeestbx() {
		return employeestbx;
	}


	public WebElement getDeleteAccount() {
		return deleteAccount;
	}


	public WebElement getEmailtbx() {
		return emailtbx;
	}


	public WebElement getIndustrylstbx() {
		return industrylstbx;
	}


	public WebElement getAccounttypelstbx() {
		return accounttypelstbx;
	}


	public WebElement getCheckbox1() {
		return checkbox1;
	}


	public WebElement getPhonetbx() {
		return phonetbx;
	}


	public WebElement getFaxtbx() {
		return faxtbx;
	}


	public WebElement getRatinglstbx() {
		return ratinglstbx;
	}


	public WebElement getSiccodetbx() {
		return siccodetbx;
	}


	public WebElement getCheckbox2() {
		return checkbox2;
	}


	public WebElement getCitytbx() {
		return citytbx;
	}


	public WebElement getStatetbx() {
		return statetbx;
	}


	public WebElement getCodetbx() {
		return codetbx;
	}


	public WebElement getCountrytbx() {
		return countrytbx;
	}


	public WebElement getCopyAddressRightchbx() {
		return copyAddressRightchbx;
	}


	public WebElement getDescriptiontbx() {
		return descriptiontbx;
	}


	public WebElement getSavebtn() {
		return savebtn;
	}


	public WebElement getCampignInfotxt() {
		return campignInfotxt;
	}


	public WebElement getEngineerinfopt() {
		return engineerinfopt;
	}


	public WebElement getAccountTypefopt() {
		return accountTypefopt;
	}

    
	
}
