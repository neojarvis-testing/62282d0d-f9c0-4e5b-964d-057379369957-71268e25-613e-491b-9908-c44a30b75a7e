package runner;
 
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
 
import pages.ForProviders;
import pages.HealthLibraryAction;
import utils.Base;
import utils.ReportHelper;
 
public class TestRunnerHL extends Base {
   
    ExtentTest test;
    ExtentReports reports;
 
    @BeforeClass
    public void configReport(){
        reports=ReportHelper.createExtentReporter("Health Library Report");
    }
 
    @BeforeMethod
    public void browserSetup(){
        openBrowser();
       
    }
 
    @Test(enabled = false)
    public void healthLibrary (){
        test=reports.createTest("Test Case 05 [HealthLibrary]");
        HealthLibraryAction libraryAction = new HealthLibraryAction();
        libraryAction.allHealthLibraryMethods(test);
    }
 
    @Test(enabled = false)
    public void forProvider(){
        test=reports.createTest("Test Case 06 [ForProviders]");
          ForProviders providers = new ForProviders();
          providers.allProvidersMethod(test);
    }
 
 
    @AfterMethod
    public void endBrowser(){
    driver.quit();
    }
 
    @AfterClass
    public void reportFlushing(){
        reports.flush();
    }
 
}