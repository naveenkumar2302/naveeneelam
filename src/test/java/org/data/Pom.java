package org.data;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Pom extends Baseclass  {
	
	public Pom() {
		// TODO Auto-generated constructor stub
		
	PageFactory.initElements( driver,this);	
	}
	
	@FindBys({
		@FindBy(id="email"),
		@FindBy(xpath="//input[@type='text']")})
	private static WebElement email;
	
	@FindBy(id="pass")
	private WebElement pass;
	
	@FindBy(name="login")
	private WebElement login;

	public static WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	
	
		
		
		
		
		
		
	}
	
	
	
	
	
	


