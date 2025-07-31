package com.facebook.genericpage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;

public class CommonMethods extends MasterPage {

	public CommonMethods() throws Exception {
		super();
		
	}

	
	// get Text of webElement
	
	public String getWebElementText(String xpathKey) {
		
		String textOfWebElement= driver.findElement(By.xpath(or.getProperty(xpathKey))).getText();
		System.out.println(textOfWebElement);
		return textOfWebElement;
	}
	
	// click method
	
   public void click(String xpathKey) {
		
		driver.findElement(By.xpath(or.getProperty(xpathKey))).click();
	}
	
	// enter data
	public void enterData(String xpathKey, String testData) {
		
		driver.findElement(By.xpath(or.getProperty(xpathKey))).sendKeys(td.getProperty(testData));
	}
	
	// clear data
		public void clear(String xpathKey) {
			
		driver.findElement(By.xpath(or.getProperty(xpathKey))).clear();
		}
		
		// Reading Excel data
		
	public void readExcelData(String xpathKey, int  rowNo, int colNo) throws Exception {
	 
	 File fi= new File("C:\\Users\\Amith Gautam\\Desktop\\ExcelTestData.xlsx");
	 FileInputStream fs=new FileInputStream(fi);
	 XSSFWorkbook wb= new XSSFWorkbook(fs);
	 XSSFSheet ws = wb.getSheet("Sheet1");
	 System.out.println(ws.getSheetName());
	 String abc= ws.getRow(rowNo).getCell(colNo).getStringCellValue();
	 driver.findElement(By.xpath(xpathKey)).sendKeys(abc);
	 
	 
	 
 }
 
 
	
}
