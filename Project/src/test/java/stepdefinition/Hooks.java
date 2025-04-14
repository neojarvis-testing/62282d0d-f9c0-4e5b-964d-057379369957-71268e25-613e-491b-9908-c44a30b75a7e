package stepdefinition;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import utils.Base;
import utils.ReportHelper;

public class Hooks extends Base {
    public static ExtentTest test;
    public static ExtentReports report;

    @BeforeAll
    public static void createReport() {
        report = ReportHelper.createExtentReporter("cleveland_Report");
    }

    @Before
    public void configBrowser() {
        openBrowser();
        test = report.createTest("TestCase1");
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

    @AfterAll
    public static void flushReport() {
        ReportHelper.extentReportFlush();
    }
}
