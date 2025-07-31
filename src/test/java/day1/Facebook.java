package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Facebook {

	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		System.setProperty("WebDriver.chrome.driver", "D:\\Software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	
	@Test(priority=1)
		public void testLogo() {
			
			boolean status= driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
			Assert.assertEquals(status, true);
		}
	
	@Test(priority=2)
	public void testURL() {
		
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/");
	}
	
	@Test(priority=3,dependsOnMethods= {"testURL"})
	
	public void tesTitle() {
		
	Assert.assertEquals(driver.getTitle(),"Facebook-log in or sign up");
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.close();
	}
	}

