package runner;
 
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
 
import pages.BSOActions;
import pages.BloodManageActions;
import pages.ContactActions;
import pages.HealthLibraryActions;
import pages.HomePageActions;
import pages.InstituteActions;
import pages.PharmacyActions;
import utils.Base;
import utils.ReportHelper;
 
public class AppTest extends Base{
    ExtentTest test;
    ExtentReports reports;
    @BeforeClass
    public void report(){
        reports=ReportHelper.createExtentReporter("cleveland_Report_vig");
    }
    @BeforeMethod
    public void setBrowser(){
        openBrowser();
    }
    @Test(enabled = false)
    public void FirstTestCase()throws InterruptedException{
       
        HomePageActions homePageActions =new HomePageActions();
        homePageActions.healthLibrary();
        HealthLibraryActions healthLibraryActions=new HealthLibraryActions();
        healthLibraryActions.clickOnEyes();
        BSOActions bso =new BSOActions();
        bso.eyeDiseases();
       
    }
    @Test(enabled = false)
    public void testCaseTwo() throws InterruptedException{
       
        test=reports.createTest("test");        
        HomePageActions homePageActions =new HomePageActions();
        homePageActions.institute();
        InstituteActions institute=new InstituteActions();
        institute.bloodacction();
        BloodManageActions bloodMangement=new BloodManageActions();
        bloodMangement.bloodMethod();
        institute.pharmacyAction();
        PharmacyActions pharmacy=new PharmacyActions();
        pharmacy.takeSurvey(test);
        ContactActions contactActions=new ContactActions();
        contactActions.clickContact();
        contactActions.viewPhoneDirect();
        contactActions.clickClevelanHome();
        homePageActions.clickNeedHelp();
        contactActions.verifyParking(test);
        contactActions.tillVirtualSecond();
        contactActions.getScreenshot(test);
    }
   
    @AfterMethod
    public void driverClose(){
       driver.quit();
    }
    @AfterClass
    public void FlushReports(){
        ReportHelper.extentReportFlush();
    }    
}