package pages;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import stepdefinition.Hooks;
import uistore.RespiratoryLocators;
import utils.Base;
 
import utils.Screenshot;
import utils.WebDriverHelper;
 
public class RespiratoryAction {
   public WebDriverHelper help = new WebDriverHelper(Base.driver);
    public static ExtentTest test;
    public static ExtentReports report;
 
    public  void respOperation(ExtentTest test) {
        help.hoverAndClick(RespiratoryLocators.Introduction);
        Hooks.test.log(Status.PASS, "Clicked on Introduction");
 
        String intro = Base.driver.getTitle();
        help.verifyTitle(intro);
        help.hoverAndClick(RespiratoryLocators.cough);
        Hooks.test.log(Status.PASS, "Clicked on Cough");
        String cough = Base.driver.getTitle();
        help.verifyTitle(cough);
 
    }
 
    public void doctorFilters(ExtentTest test) {
        Base.driver.navigate().back();
        Base.driver.navigate().back();
        Base.driver.navigate().back();
 
        help.hoverAndClick(RespiratoryLocators.byDoctors);
          Hooks.test.log(Status.PASS, "Clicked on Doctors");
        help.waitForClickability(RespiratoryLocators.specialist, 2);
        help.hoverAndClick(RespiratoryLocators.specialist);
        help.waitForClickability(RespiratoryLocators.male, 2);
        help.hoverAndClick(RespiratoryLocators.male);
        help.waitForClickability(RespiratoryLocators.female, 2);
        help.hoverAndClick(RespiratoryLocators.female);
        String title = Base.driver.getTitle();
        help.verifyTitle(title);
        help.waitForClickability(RespiratoryLocators.mahamod, 2);
    }
 
    public void doctorSelect(ExtentTest test) {
        help.hoverAndClick(RespiratoryLocators.mahamod);
        Hooks.test.log(Status.PASS, "Doctors Mamoun Abdoh, MD is selected");
 
        help.switchWindow();
        String url = Base.driver.getCurrentUrl();
        help.verifyUrl(url);
        help.retrieveText(RespiratoryLocators.doctorInfo);
        Screenshot.screenShotAndHighlight(Base.driver, RespiratoryLocators.doctorInfo, "Doctor's profile");
        Hooks.test.log(Status.PASS, "Doctor profile screenshot is captured");
 
    }
}