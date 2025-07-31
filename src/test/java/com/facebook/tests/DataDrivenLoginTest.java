package com.facebook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.facebook.genericpage.CommonMethods;
import com.facebook.genericpage.MasterPage;
import com.facebook.pages.PageFactoryLoginPage;

public class DataDrivenLoginTest extends MasterPage {

	public DataDrivenLoginTest() throws Exception {
		super();
		
	}
	
   @DataProvider(name="loginData",indices= {0,1})
	
	 Object[][] loginFaceBook() {
	   
		
		Object data[][]= {
				
			              {"abc@gmail.com", "abcd"},
	                     
		
				           	};
		
		
		return data;
		}
		
		
     @Test(dataProvider="loginData")
	
	 void login(String email,String psw) throws Exception {
		
	
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("psw");
	    driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);
		
     }


   @AfterClass
   
   public  void tearDown() {
	   
	   driver.close();
   }
}
	
	
	
	

