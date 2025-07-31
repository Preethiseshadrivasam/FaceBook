package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.facebook.genericpage.CommonMethods;
import com.facebook.genericpage.MasterPage;
import com.facebook.tests.LoginTest;

/*public class ExtentReporterManager implements ITestListener {

	public String repName;
	public ExtentSparkReporter sparkReporter; // UI of the report
	public ExtentReports extent; // populate common info of the report
	public ExtentTest test; // create test case entires in the report and update status of the test methods
	
 public  void onStart(ITestContext textContext) {
	 
	 
	 String timeStamp=new SimpleDateFormat("YYYY.MM.dd.HH.mm.ss").format(new Date());
	 
	 repName="Test-Report"+timeStamp+".html";
		
	sparkReporter = new ExtentSparkReporter(".\\reports\\"+repName);
	
	sparkReporter.config().setDocumentTitle("FaceBook Automation report");
	sparkReporter.config().setReportName("FaceBook Functional Testing");
	sparkReporter.config().setTheme(Theme.DARK);
	
	extent=new ExtentReports();
	extent.attachReporter(sparkReporter);
	
	extent.setSystemInfo("Application", "FaceBook");
	extent.setSystemInfo("Environment ", "QA");
	extent.setSystemInfo("Module Name", "Admin");
	extent.setSystemInfo("SubModule Name", "customers");
	extent.setSystemInfo("User nName ", System.getProperty("user.name"));
	extent.setSystemInfo("Environment ", "QA");
	
	String os= textContext.getCurrentXmlTest().getParameter("os");
	extent.setSystemInfo("Operating System", os);
	
	String browser= textContext.getCurrentXmlTest().getParameter("browser");
	extent.setSystemInfo("Browser", browser);
	
	List<String> includedGroups= textContext.getCurrentXmlTest().getIncludedGroups();
	if(includedGroups.isEmpty()) {
		
		extent.setSystemInfo("Groups", includedGroups.toString());
	}

}

 public void onTestSuccess(ITestResult result) {
	 
	test=extent.createTest(result.getClass().getName());
	test.assignCategory(result.getMethod().getGroups());
	test.log(Status.PASS, "Test case is passed:"+result.getName());
	  }

  public  void onTestFailure(ITestResult result) {
	 
	test=extent.createTest(result.getClass().getName());
	test.assignCategory(result.getMethod().getGroups());
	test.log(Status.FAIL, "Test case is failed" +result.getName());
	test.log(Status.FAIL, "Test case is failed" +result.getThrowable());
	
	try {
		
		String imgPath= new MasterPage().captureScreen(result.getName());
	test.addScreenCaptureFromPath(imgPath);
	}
	catch(Exception e) {
		
		e.printStackTrace();
	}
	  }

  public  void onTestSkipped(ITestResult result) {
	  test=extent.createTest(result.getClass().getName());
	  test.assignCategory(result.getMethod().getGroups());
		test.log(Status.SKIP, "Test case is Skipped" +result.getName());	 
		
		  }
  
  public  void onFinish(ITestContext context) {
	   
		extent.flush();
		  }
	
	  
}
*/