package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.google.common.base.Function;
import io.github.bonigarcia.wdm.WebDriverManager;
public class ExcelDataProvider {

	public static String getexclesheetdata(int rowNum,int column) throws EncryptedDocumentException, IOException
	{
		String data;
		String path=".\\src\\test\\resources\\a.xlsx";
		FileInputStream file=new FileInputStream(path);
	Workbook book=WorkbookFactory.create(file);
		 try {
			 data=book.getSheet("Sheet1").getRow(rowNum).getCell(column).getStringCellValue();
		//	 data=cells.getStringCellValue();
		 }
		catch(IllegalStateException e) {
			 double value=book.getSheet("Sheet1").getRow(rowNum).getCell(column).getNumericCellValue();
			 //double value=cells.getNumericCellValue();
			 data=String.valueOf(value);
		}
		return data;
	}

//public static void main(String[]args) throws Exception, IOException
//{
//System.out.println(ExcelDataProvider.getexclesheetdata(0, 1));
//WebDriverManager.chromedriver().setup();
//WebDriver driver=new ChromeDriver();
//driver.get("https://parabank.parasoft.com/parabank/index.htm");
//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//
//WebElement Uname =driver.findElement(By.xpath("//input[@name='username']"));
//Uname.sendKeys(ExcelDataProvider.getexclesheetdata(1, 0));
//WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
//password.sendKeys(ExcelDataProvider.getexclesheetdata(1, 1));
//}	

}