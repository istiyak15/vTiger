package com.vTiger.generics;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/**
 * 
 * @author md isaaq
 *
 */
public class WebDriveUtil {

	public void switchToSpecificWindow(WebDriver driver,WebElement element) {
		String parentwh = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		allwh.remove(parentwh);
		for (String string : allwh) {
			driver.switchTo().window(string);
			if (element.isDisplayed()) {
				break;
			}
		}
	}

	public void  switchToSpecificWindowTitle(WebDriver driver, String title) {
		String parentwh = driver.getWindowHandle();		
		Set<String> allwh = driver.getWindowHandles();
		allwh.remove(parentwh);
		for (String string : allwh) {
			driver.switchTo().window(string);
			if (driver.getTitle().equals(title)) {
				break;
			}
		}
	}
}
