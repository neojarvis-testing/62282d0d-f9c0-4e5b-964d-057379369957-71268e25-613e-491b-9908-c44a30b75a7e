package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.BloodManageLocators;
import utils.Base;
import utils.ReportHelper;
import utils.Screenshot;
import utils.WebDriverHelper;

public class BloodManageActions {
    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);

    /**
     * Author: Vignesh
     * Hovers over and clicks the 'Contact' button, captures a highlighted
     * screenshot, and navigates back.
     * @param test The ExtentTest object for logging the status of the actions
     */
    public void bloodMethod(ExtentTest test) {
        try {
            driverHelper.waitForClickability(BloodManageLocators.contact, 4);
            driverHelper.hover(BloodManageLocators.contact);
            driverHelper.clickTheElement(BloodManageLocators.contact);
            Screenshot.screenShotAndHighlight(Base.driver, BloodManageLocators.contact, "Conatct");
            Base.driver.navigate().back();
            test.log(Status.INFO, "Clicked on Contact");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            ReportHelper.attachScreenshotToReport("Contact", test, "Contact Not Clicked");
        }
    }
     /**
      * Author: Vignesh
      *Gathers all the methods for TestCase 10
      * @param test The ExtentTest object for logging the status of the actions
      */
    public void bloodActions(ExtentTest test) {
        try {
            HomePageActions homePageActions = new HomePageActions();
            homePageActions.institute(test);
            InstituteActions institute = new InstituteActions();
            institute.bloodacction(test);
            BloodManageActions bloodMangement = new BloodManageActions();
            bloodMangement.bloodMethod(test);
            institute.pharmacyAction(test);
            PharmacyActions pharmacy = new PharmacyActions();
            pharmacy.takeSurvey(test);
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
        }
    }
}
