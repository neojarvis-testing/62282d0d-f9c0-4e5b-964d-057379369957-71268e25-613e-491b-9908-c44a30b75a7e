package stepdefinition;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import utils.Base;
import utils.ReportHelper;

public class Hooks extends Base{

    public static ExtentTest test;
    public static ExtentReports reports;

    @BeforeAll
    public static void reportConfig(){
        reports = ReportHelper.createExtentReporter("Cleveland Clinic");
    }
 
    @Before
    public void initConfig(Scenario sc){
        test = reports.createTest(sc.getName());
        openBrowser();
    }
 
    
 
    @After
    public void endConfig(){
        if(driver!=null);
        driver.quit();
    }
 
    @AfterAll
    public static void reportEnd(){
        reports.flush();
    }

}
