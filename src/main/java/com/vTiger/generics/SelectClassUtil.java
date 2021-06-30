package com.vTiger.generics;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
/**
 * 
 * @author md isaaq
 *
 */
public class SelectClassUtil {

	public void selectElementFromList(String value,WebElement element) {
		Select s=new Select(element);
		if (value=="0") {
			s.selectByIndex(0);
		}
		List<WebElement> allOptions = s.getOptions();
		for (WebElement webElement : allOptions) {
			String webElementText = webElement.getText();
			String webElementValue = webElement.getAttribute("value");
			try {
				if (value.equals(webElementText)) {
					s.selectByVisibleText(value);
					break;
				}
				else if (value.equals(webElementValue)) {
					s.selectByValue(value);
					break;
				}
			} catch (Exception e) {
				int index = Integer.parseInt(value);
				s.selectByIndex(index);
				break;
			}
		}
	}
}
