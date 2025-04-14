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

    public static ExtentReports reports; 
    public static ExtentTest test;

     @BeforeAll
    public static void beforeA(){ 
        reports=ReportHelper.createExtentReporter("Cleveland_Clinic");

    }

    @Before
    public void before() { 
        openBrowser();
        test=reports.createTest("Test Case 02-HomePage Map ");
    
    }

    @After
    public void after(){ 
        driver.quit();
    }

    @AfterAll
    public static void afterAll(){ 
        reports.flush();
    }
    
}
    
