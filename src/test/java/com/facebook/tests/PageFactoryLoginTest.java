package com.facebook.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.facebook.genericpage.CommonMethods;
import com.facebook.pages.PageFactoryLoginPage;

public class PageFactoryLoginTest extends CommonMethods {

	public PageFactoryLoginTest() throws Exception {
		super();
		
	}
	
	@Test
	public void loginTest() {
		
		PageFactoryLoginPage pc= PageFactory.initElements(driver, PageFactoryLoginPage.class);
		pc.enterEmail();
		pc.enterPass();
		pc.loginButton();
	}

	
		
	}
	

