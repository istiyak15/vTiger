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
public class LoginPage {
@FindBy(name="user_name")
private WebElement usernametbx; 

@FindBy(name="user_password")
private WebElement passwordtbx;

@FindBy(id="submitButton")
private WebElement submitbtn;

public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void setLogin(String un, String pwd){
	usernametbx.sendKeys(un);
	passwordtbx.sendKeys(pwd);
	submitbtn.click();
}
}
