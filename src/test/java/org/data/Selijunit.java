package org.data;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Selijunit    {
	
	@BeforeClass
	public static  void beformeth() {
		// TODO Auto-generated method stub
		
		System.out.println("before class");

	}
	
	@AfterClass
	public static void aftermeth() {
		// TODO Auto-generated method stub

		System.out.println("after class");
		
		
	}
	@Test
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("test 1");

	}
	@Before
	public void befor() {
		// TODO Auto-generated method stub
		System.out.println("before");

	}
	@After
	public  void after() {
		// TODO Auto-generated method stub
		System.out.println("after");
		

	}
	@Ignore
	@Test
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("test 2");

	}
	@Test
	public  void test3() {
		// TODO Auto-generated method stub
		System.out.println("test 3");

	}
	
	
	
	
	
	
		
		

	

}
