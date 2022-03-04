package org.data;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojjo extends Baseclass {
	
	public Pojjo() {
		// TODO Auto-generated constructor stub
		
	PageFactory.initElements(driver,this);
		
		
	}
	
	@FindBy(name="email")
	WebElement user;
	@FindBy(xpath="//input[@class='inputtext _55r1 _6luy _9npi']")
	WebElement passs;
	@FindBy(name="login")
	WebElement logo;
	
	
	
	
	
	
	
	
	
	
	

}
