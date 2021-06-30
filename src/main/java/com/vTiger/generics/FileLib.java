package com.vTiger.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
/**
 * 
 * @author md isaaq
 *
 */
public class FileLib {


	public String propertyFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream("D:\\NewJavaProjects\\vTiger\\src\\test\\resources\\Data\\vTigerData.property.txt");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}

	public String excellFile(String sheetname, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("D:\\NewJavaProjects\\vTiger\\src\\test\\resources\\Data\\vTigertestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetname).getRow(row).getCell(cell).toString();
		return data;
	}
}





