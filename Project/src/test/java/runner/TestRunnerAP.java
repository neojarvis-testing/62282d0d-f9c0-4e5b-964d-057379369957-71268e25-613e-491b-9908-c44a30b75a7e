package runner;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import pages.AppointmentsActions;
import pages.BSOActions;
import pages.BloodManageActions;
import pages.ContactActions;
import pages.FindADoctorActions;
import pages.ForProviders;
import pages.HealthLibraryAction;
import pages.HealthLibraryActions;
import pages.HomePageAction;
import pages.HomePageActions;
import pages.InstituteActions;
import pages.PharmacyActions;
import pages.RequestAppointmentActions;
import pages.RespiratoryAction;
import utils.Base;
import utils.ReportHelper;

public class TestRunnerAP extends Base {
    ExtentTest test ;
    ExtentReports reports;
    @BeforeClass
    public void createReport()
    {
        reports = ReportHelper.createExtentReporter("cleveland_Report");
    }
    @BeforeMethod
    public void configBrowser() {
        openBrowser();
        
    }
    //saif
    @Test(priority = 5, enabled = true)
    public void initializationtask() {
    test = reports.createTest("Sheet1");
    HomePageAction action = new HomePageAction();
    action.wrappingMethod();
    }
    //harshit
    @Test(priority = 4, enabled = true)
    public void socialsVerification() {
        test = reports.createTest("TestCase 07");
        HomePageActions homePageActions = new HomePageActions();
       homePageActions.verifySocialLinks(test);
        
    }
    //harshit
     @Test( priority = 3,enabled = true)
    public void ActionsVerification() {
        test = reports.createTest("TestCase 08");
       HomePageActions homePageActions = new HomePageActions();
       
        homePageActions.verifyActionsFooter(test);
    }
    //kiruthik
    @Test(priority = 1, enabled = true)
    public void testcase1()
    {
        HomePageActions homePageActions = new HomePageActions();
        AppointmentsActions appointmentsActions = new AppointmentsActions();
        RequestAppointmentActions requestAppointmentActions = new RequestAppointmentActions();
        test = reports.createTest("Testcase 3");
        homePageActions.clickOnSchedule(test);
        appointmentsActions.clickOnRequest(test);
        requestAppointmentActions.requestAppointmentAction(test);
    }
    //kiruthik
    @Test(priority = 2, enabled = true)
    public void testcase2()
    {
        HomePageActions homePageActions = new HomePageActions();
        FindADoctorActions findADoctorActions = new FindADoctorActions();
        test = reports.createTest("Testcase 4");
        homePageActions.clickOnFindADoctor(test);
        findADoctorActions.findADoctorAction(test);
    }
    //rewa
    @Test(priority = 6,enabled = true)
    public void healthLibrary (){
        test=reports.createTest("Test Case 05 [HealthLibrary]");
        HealthLibraryAction libraryAction = new HealthLibraryAction();
        libraryAction.allHealthLibraryMethods(test);
    }
    //rewa
    @Test(priority = 7,enabled = true)
    public void forProvider(){
        test=reports.createTest("Test Case 06 [ForProviders]");
          ForProviders providers = new ForProviders();
          providers.allProvidersMethod(test);
    }
    //vinny
    @Test(priority = 8, enabled = true)
    public void create()  {
        HomePageActions home = new HomePageActions();
        RespiratoryAction resp = new RespiratoryAction();
        home.searchAll();
        resp.respiratoryAll();
     }
     //vignesh
      @Test(priority = 9,enabled = true)
    public void FirstTestCase()throws InterruptedException{
       
        HomePageActions homePageActions =new HomePageActions();
        homePageActions.healthLibrary();
        HealthLibraryActions healthLibraryActions=new HealthLibraryActions();
        healthLibraryActions.clickOnEyes();
        BSOActions bso =new BSOActions();
        bso.eyeDiseases();
       
    }
    //vignesh
    @Test(priority = 10,enabled = true)
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
    public void closeBrowser() {
        driver.quit();
    }
    @AfterClass
    public void flushReport()
    {
        reports.flush();
    }

}
