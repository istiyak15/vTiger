package com.vTiger.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
/**
 * 
 * @author md isaaq
 *
 */
public class ActionsClass {

	public void actionsMouseHover(WebDriver driver,WebElement element) {
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
	}

	public void actionsContextClick(WebDriver driver, WebElement element) {
		Actions a=new Actions(driver);
		a.contextClick(element).perform();
	}
	public void doubleClick(WebDriver driver, WebElement element) {
		Actions a=new Actions(driver);
		a.doubleClick(element).perform();
	}
	public void dragAndDrop(WebDriver driver, WebElement source, WebElement target) {
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}
}
