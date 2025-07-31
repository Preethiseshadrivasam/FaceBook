package com.facebook.pages;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

import com.facebook.genericpage.CommonMethods;

public class LoginPage extends CommonMethods {

	public LoginPage() throws Exception {
		super();
		
	}

   //clear text of email
    
    public void clearTextEmail() {
    	
    	clear("EmailOrPhone");
    }
    
 //clear text of password
    
    public void clearTextPssword() {
    	
    	clear("Password");
    }
    
	
	public void clickEmail() {
		
		enterData("EmailOrPhone", "TestData1");
		
	}
	
	//Get Text
	
	public void getFaceBookText() {
		
		getWebElementText("FaceBookText");
	}
	
	// Enter Email
	public void enterEmail() {
		enterData("EmailOrPhone","TestData1");
	}
	
	// click password
	
	public void clickPassWord() {
		
		click("Password");
	}
	
	// enter password
	public void enterPassword() {
		
		enterData("Password","TestData2");
	}
	
	
	// click Login button
    public void  clickLoginButton() {
		
		click("LoginButton");
	}
    
    // take screenshot of the Webpage if it is faillure
	 public void captureScreenShot(ITestResult result) throws Exception {
		  
		  if(ITestResult.FAILURE==result.getStatus()) {
			  
			  TakesScreenshot ts= (TakesScreenshot)driver;
			  
			  File sourceFile= ts.getScreenshotAs(OutputType.FILE);
			  File desFile = new File("./screenshot/" +result.getName()+".png");
			  FileUtils.copyFile(sourceFile, desFile);
			  System.out.println(result.getName()+"method() screenshot captured");
			  
			  
			  
		  }
		  
	  }
	  
}
