package com.facebook.tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.facebook.genericpage.MasterPage;
import com.facebook.pages.LoginPage;

public class LoginTest {

	
	@Test

	public void a() throws Exception {
	LoginPage lp=new LoginPage();
	
	lp.getFaceBookText();
	Thread.sleep(2000);
	lp.clickEmail();
	lp.clearTextEmail();
	lp.enterEmail();
	lp.clickPassWord();
	lp.clearTextPssword();
	lp.enterPassword();
	lp.clickLoginButton();
	Thread.sleep(2000);
	//lp.readExcelData("EmailOrPhone", 2, 1);
	}
	
	
   public  void takeScreenshot(ITestResult result2) throws Exception {
		
		LoginPage lp=new LoginPage();
		lp.captureScreenShot(result2);
	}
	@AfterClass
	
	public static void closeLoginPage() {
		
		MasterPage.driver.close();
		
		
	}
}
	
	
















