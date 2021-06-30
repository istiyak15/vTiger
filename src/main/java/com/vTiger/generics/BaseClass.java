package com.vTiger.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.vTiger.generics.FileLib;
import com.vTiger.objectrepository.LoginPage;
import com.vTiger.objectrepository.VtigerHomePage;
/**
 * 
 * @author md isaaq
 *
 */
public class BaseClass {
	public static WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\NewJavaProjects\\vTiger\\src\\main\\resources\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	Reporter.log("Open Browser",true);
	}

	@BeforeMethod
	public void loginVtiger() throws IOException {
		FileLib f=new FileLib();
		String url = f.propertyFile("url");
		String un = f.propertyFile("un");
		String pwd = f.propertyFile("pwd");
		driver.get(url);
		LoginPage l=new LoginPage(driver);
		l.setLogin(un, pwd);
		Reporter.log("login the Application",true);
	}

	@AfterMethod
	public void logoutVtiger() {
		ActionsClass a=new ActionsClass();
		VtigerHomePage v=new VtigerHomePage(driver);
	     a.actionsMouseHover(driver, v.getSignoutbtn());
		v.getSignoutlink().click();
		Reporter.log("logout the Application",true);
	}
	@AfterClass
	public void closeBrowser() {
		driver.manage().deleteAllCookies();
		driver.quit();
		Reporter.log("close the Browser",true);
	}


}
