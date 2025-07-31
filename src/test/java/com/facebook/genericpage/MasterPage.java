package com.facebook.genericpage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MasterPage {

	public  static WebDriver driver;
	public Properties prop;
	public Properties or;
	public Properties td;
	
	
	public MasterPage () throws Exception {
		
     	FileInputStream fi=new FileInputStream(".\\src\\test\\java\\com\\facebook\\repository\\config.properties");
		prop=new Properties();
		prop.load(fi);
		
		FileInputStream fs=new FileInputStream(".\\src\\test\\java\\com\\facebook\\repository\\locators.properties");
		or=new Properties();
		or.load(fs);
		
		FileInputStream ts=new FileInputStream(".\\src\\test\\java\\com\\facebook\\repository\\testdata.properties");
		td=new Properties();
		td.load(ts);
		
		
		 if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				
			 System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\com.facebook.drivers\\chromedriver.exe");
				driver=new ChromeDriver();
				
			}
		 else if(prop.getProperty("browser").equalsIgnoreCase("edge")) {
			 
				
			 System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\com.facebook.drivers\\msedgedriver.exe");
				driver = new EdgeDriver();
			}
			else {
				System.out.println("browser details failed");
			
			}
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		 driver.get(prop.getProperty("url"));
	}
	
}

  

	
			
			
		
	
	
	
	

		 
		 
		
	
	
	

	

