package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.HomePageAction;
import utils.Base;
import utils.ReportHelper;

public class TestRun extends Base {
  ExtentReports reports;
  ExtentTest test;

  @BeforeClass
  public void createReport() {
    reports = ReportHelper.createExtentReporter("cleveland_Report");
  }

  @BeforeMethod
  public void setupBrowser() {
    openBrowser();
  }

  @Test(enabled = false)
  public void initializationtask() {
    test = reports.createTest("Sheet1");
    HomePageAction action = new HomePageAction();
    action.wrappingMethod();
  }
  

  @AfterMethod
  public void quitBrowser() {
     driver.quit();
  }

  @AfterClass
  public void reportflush() {
    reports.flush();
  }
}
