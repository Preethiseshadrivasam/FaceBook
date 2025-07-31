package com.facebook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFactoryLoginPage {

	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement pass;
	
	@FindBy(xpath="//button[@name='login']")
	WebElement login;
	
	public void enterEmail() {
	
	email.sendKeys("preethis");
}
	
	public void enterPass() {
		
		pass.sendKeys("preethis1");
	
	}
	
	public void loginButton() {
		login.click();
	}
}
		

