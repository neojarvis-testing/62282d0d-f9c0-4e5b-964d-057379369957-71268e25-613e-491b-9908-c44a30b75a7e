package stepdefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import utils.Base;
import utils.ReportHelper;

public class Hooks extends Base
{
    public static ExtentTest test;
    public static ExtentReports reports;
    @BeforeAll
    public static void createReport()
    {
        reports = ReportHelper.createExtentReporter("cleveland_Report");
    }
    @Before
    public void configBrowser(Scenario sc)
    {
        openBrowser();
        test= reports.createTest(sc.getName());
    }
    @After
    public void closeBrowser()
    {
        driver.quit();
    }
    @AfterAll
    public static void flushReport()
    {
        reports.flush();
    }
}
