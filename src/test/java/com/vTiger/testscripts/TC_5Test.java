package com.vTiger.testscripts;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
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

/**
 * 
 * @author md isaaq
 *
 */
@Listeners(com.vTiger.generics.ListenerImplementation.class)
public class TC_5Test extends BaseClass {

	@Test(priority=4)
	public void testcase5() throws AWTException, EncryptedDocumentException, IOException {
		FileLib f=new FileLib();
		String organizationName = f.excellFile("OrganizationData", 1, 2);
		String accountTypeName = f.excellFile("OrganizationData", 1, 16);
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
		//navigate to create a new  organization with category from "accountType" 
		CreateOrganizationPage c=new CreateOrganizationPage(driver);
		c.getAccountnametbx().sendKeys(organizationName);
		WebElement accountType = c.getAccounttypelstbx();
		Select s1=new Select(accountType);
		s1.selectByValue(accountTypeName);
		c.getSavebtn().click();
		String ActualCampaignInfo = c.getCampignInfotxt().getText();
		Assert.assertTrue(ActualCampaignInfo.contains(organizationName));
		Reporter.log("campaign is created with right msg is [ CAM** ] abc - Campaign Information   Updated today",true);
		c.getDeleteAccount().click();
        driver.switchTo().alert().accept();
		driver.navigate().back();
	}
}
