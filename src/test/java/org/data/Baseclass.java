package org.data;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass  {
	public static WebDriver driver;
	public static String value;
	public static void browserlaunch (String browser) {
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
			else if(browser.equals("firefox")) {
				
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
				else {
					WebDriverManager.iedriver().setup();
					driver=new InternetExplorerDriver();
				}
		
	
		
		
		}
	
	public static void loadurl(String url) {
		
		driver.get(url);
		driver.manage().window().maximize();
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	}
	
	public static void getvalues(WebElement ref) {
		
		System.out.println(ref.getText());
		System.out.println(ref.getAttribute("value"));
		
		
	}
	public static void sende(WebElement ref,String hh) {
		
		ref.sendKeys(hh);
		
		
	}
	public static void clickok(WebElement ref) {
		
		ref.click();
		
	}
	
	
	public static void acto(WebElement d,WebElement g) throws AWTException {
		
		Actions a=new Actions(driver);
		a.dragAndDrop(d, g).perform();
	}
		public static String Getdatas(int i,int j) throws IOException {
			
			
			File f=new File("C:\\Users\\Hp\\eclipse-workspace\\Seleniumjava1\\excel files\\superexcel.xlsx");
			
			//FileInputStream f1=new FileInputStream(f);
			FileInputStream f1=new FileInputStream(f);
			Workbook w=new XSSFWorkbook(f1);
			Sheet ss=w.getSheet("Sheet1");
			Row aa=ss.getRow(i);
			Cell cc=aa.getCell(j);
			 value = cc.getStringCellValue();
				
		
		
		
		return value;
		
		
		
		
		
		
		
		
		
		
	}
		public static void main(String[] args) throws IOException {
			Baseclass name = new Baseclass();
			String getdatas = name.Getdatas(1,1);
			System.out.println(getdatas);
			
		}
	
	
	
	
	
	
	
	
	

}
