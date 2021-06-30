package com.vTiger.generics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/**
 * 
 * @author md isaaq
 *
 */
public class JavascriptExecutorLib {
	WebDriver driver;
	JavascriptExecutor j=(JavascriptExecutor) driver;

	public void click(WebElement element) {
		j.executeScript("arguments[0].click();", element);
	}

	public void sendValue(String data,WebElement element) {
		j.executeScript("arguments[0].value='data';", element);
	}

	public void scrollIntoView(boolean b,WebElement element) {
		j.executeScript("arguments[0].scrollIntoView(b)", element);
	}

	public void scrollTo(int x,int y,WebElement element) {
		j.executeScript("arguments[0].scrollTo(x,y)", element);
	}

	public Object returnValue(WebElement element) {
		Object value = j.executeScript("return arguments[0].value", element);
		return value;
	}
}
