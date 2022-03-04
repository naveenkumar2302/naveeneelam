package org.data;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Junit extends Baseclass {
	
	public Junit() {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver,this);
		
		
	}
	
	  @FindBy(name="username")
	  private WebElement user;
	  
	  @FindBy(name="password")
	 private  WebElement pass;
	  @FindBy(name="login")
	  private WebElement login;
	public WebElement getUser() {
		return user;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLogin() {
		return login;
	}
	  
	  
	  
	
	
}