package com.vTiger.testscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vTiger.generics.BaseClass;
import com.vTiger.generics.FileLib;
import com.vTiger.objectrepository.CreateOrganizationPage;
import com.vTiger.objectrepository.OrganizationsPage;
import com.vTiger.objectrepository.VtigerHomePage;

/***
 * 
 * @author Md Isaq
 *
 */

@Listeners(com.vTiger.generics.ListenerImplementation.class)
public class TC_01Test extends BaseClass {
	@Test
	public void testcase1() throws AWTException, InterruptedException, EncryptedDocumentException, IOException {
		FileLib f=new FileLib();
		String organizationName = f.excellFile("OrganizationData", 1, 2);
		String websiteName = f.excellFile("OrganizationData", 1, 3);
		String tickersymbolName = f.excellFile("OrganizationData", 1, 4);
		String employeesName = f.excellFile("OrganizationData", 1, 5);
		String emailName = f.excellFile("OrganizationData", 1, 6);
		String phoneName = f.excellFile("OrganizationData", 1, 7);
		String faxName = f.excellFile("OrganizationData", 1, 8);
		String siccodeName = f.excellFile("OrganizationData", 1, 9);
		String cityName = f.excellFile("OrganizationData", 1, 10);
		String stateName = f.excellFile("OrganizationData", 1, 11);
		String codeName = f.excellFile("OrganizationData", 1, 12);
		String descriptionName = f.excellFile("OrganizationData", 1, 13);
		String countryName = f.excellFile("OrganizationData", 1, 14);
		String industryvalueName = f.excellFile("OrganizationData", 1, 15);
		String accountvalueName = f.excellFile("OrganizationData", 1, 16);
		String ratingvalueName = f.excellFile("OrganizationData", 1, 17);
		String organizationpageExceptedTitle = f.excellFile("OrganizationData", 1, 18);
		String newOrganizationpageExceptedTitle = f.excellFile("OrganizationData", 1, 19);
		//navigate to organization page
		VtigerHomePage v=new VtigerHomePage(driver);
		v.getOrganizationLink().click();
		String organizationpageActualTitle = driver.getTitle();	
		Assert.assertTrue(organizationpageActualTitle.contains(organizationpageExceptedTitle));
		Reporter.log("oganizationpage is displayed",true);
		//navigate to the "Creating New organization" page
		OrganizationsPage o=new OrganizationsPage(driver);
		o.getCreateOrganizationsbtn().click();
		String newOrganizationpageActualTitle = driver.getTitle();	
		Assert.assertTrue(newOrganizationpageActualTitle.contains(newOrganizationpageExceptedTitle));
		Reporter.log("Creating New oganizationpage is displayed",true);
		//navigate to create campaign information
		CreateOrganizationPage c=new CreateOrganizationPage(driver);
		c.getAccountnametbx().sendKeys(organizationName);
		c.getWebsitetbx().sendKeys(websiteName);
		c.getTickersymboltbx().sendKeys(tickersymbolName);
		c.getEmployeestbx().sendKeys(employeesName);
		c.getEmailtbx().sendKeys(emailName);
		WebElement industry = c.getIndustrylstbx();
		Select s1=new Select(industry);
		s1.selectByValue(industryvalueName);
		WebElement accountType = c.getAccounttypelstbx();
		Select s2=new Select(accountType);
		s2.selectByValue(accountvalueName);
		c.getCheckbox1().click();
		c.getPhonetbx().sendKeys(phoneName);
		c.getFaxtbx().sendKeys(faxName);
		WebElement rating = c.getRatinglstbx();
		Select s3=new Select(rating);
		s3.selectByValue(ratingvalueName);
		c.getSiccodetbx().sendKeys(siccodeName);
		c.getCheckbox2().click();
		c.getCitytbx().sendKeys(cityName);
		c.getStatetbx().sendKeys(stateName);
		c.getCodetbx().sendKeys(codeName);
		c.getCountrytbx().sendKeys(countryName);
		c.getCopyAddressRightchbx().click();
		c.getDescriptiontbx().sendKeys(descriptionName);
		c.getSavebtn().click();
		String ActualCampaignInfo = c.getCampignInfotxt().getText();
		Assert.assertTrue(ActualCampaignInfo.contains(organizationName));
		Reporter.log("campaign is created with right msg is [ CAM** ] abc - Campaign Information   Updated today",true);		
		c.getDeleteAccount().click();
        driver.switchTo().alert().accept();
		driver.navigate().back();		
		
	}
}