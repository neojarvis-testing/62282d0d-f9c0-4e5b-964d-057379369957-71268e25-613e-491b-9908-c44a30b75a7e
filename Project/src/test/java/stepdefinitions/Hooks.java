package stepdefinitions;

import com.aventstack.extentreports.ExtentReports;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import utils.Base;
import utils.ReportHelper;

public class Hooks extends Base {

    public static ExtentReports reports;

    @BeforeAll
    public static void reportInitialization() {
    
        reports = ReportHelper.createExtentReporter("Cleveland Clinic");

    }

    @Before
    public void browserInitialization(Scenario sc) {
        openBrowser();
        ReportHelper.ExtentTest(sc.getName());

    }

    @After
    public void browserTeardown() {
        driver.quit();

    }

    @AfterAll
    public static void closeReportResources() {
        ReportHelper.extentReportFlush();

    }

}


