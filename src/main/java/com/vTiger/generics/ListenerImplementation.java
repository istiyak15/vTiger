package com.vTiger.generics;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
/**
 * 
 * @author md isaaq
 *
 */
public class ListenerImplementation extends BaseClass implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailure(ITestResult result) {
		String res = result.getName();
		TakesScreenshot t=(TakesScreenshot) driver;
		File source = t.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShot/"+res+".png");
		try {
			FileUtils.copyFile(source, dest);
		} catch (Exception e) {
		}
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
