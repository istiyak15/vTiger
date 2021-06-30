package com.vTiger.testscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
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

import com.vTiger.generics.ActionsClass;
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
public class TC_2Test extends BaseClass {

	@Test(priority=1)
	public void testcase2() throws AWTException, EncryptedDocumentException, IOException {
		FileLib f=new FileLib();
		String industryvalueName = f.excellFile("OrganizationData", 1, 15);
		String organizationpageExceptedTitle = f.excellFile("OrganizationData", 1, 18);
		String newOrganizationpageExceptedTitle = f.excellFile("OrganizationData", 1, 19);
		String industryvalue = f.excellFile("OrganizationData", 1, 20);
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
		//Check While Creating New Organization "Industry" Drop Down Option Is Working Or Not
		CreateOrganizationPage c=new CreateOrganizationPage(driver);
		WebElement industry = c.getIndustrylstbx();
		ActionsClass a=new ActionsClass();
		a.actionsMouseHover(driver, industry);
		c.getEngineerinfopt().click();
		String actualTypevalue = c.getEngineerinfopt().getText();
		Assert.assertEquals(actualTypevalue, industryvalue);
		Reporter.log("Drop down table is appeared",true);
	}
}
