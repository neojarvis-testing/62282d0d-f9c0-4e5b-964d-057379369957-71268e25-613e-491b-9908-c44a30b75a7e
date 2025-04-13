package runner;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.HomePageActions;

import utils.Base;
import utils.LoggerHandler;
import utils.ReportHelper;


public class TestRunnerSL extends Base {
    ExtentTest test;
    ExtentReports reports;

    @BeforeClass
    public void reportSetup() {
       reports = ReportHelper.createExtentReporter("Cleveland Clinic ht");
    }

    @BeforeMethod
    public void baseMethod() {
        openBrowser();
        LoggerHandler.info("driver initialise");

    }
     @Test( enabled = false)
    public void socialsVerification() {
        test = reports.createTest("TestCase 07");
        HomePageActions homePageActions = new HomePageActions();
       homePageActions.verifySocialLinks(test);
        
    }
     @Test( enabled = false)
    public void ActionsVerification() {
        test = reports.createTest("TestCase 08");
       HomePageActions homePageActions = new HomePageActions();
        homePageActions.verifyActionsFooter(test);
    }

     @AfterMethod
    public void tearDown() {
       
      
        if (driver != null) {
            driver.quit();
        }
    }

    @AfterClass
    public void reportTearDown() {
        ReportHelper.extentReportFlush();
    }
}
