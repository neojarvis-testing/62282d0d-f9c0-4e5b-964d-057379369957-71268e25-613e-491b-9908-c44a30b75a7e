package pages;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.ContactLocators;
import uistore.InstituteLocators;
import uistore.NeedHelpLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.ReportHelper;
import utils.Screenshot;
import utils.WebDriverHelper;
 
/**
 * Author: Vignesh
 * The ContactActions class contains methods for navigating through contact-related
 * sections and performing the required actions on various elements.
 */
public class ContactActions {
    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);
 
    /**
     * Author: Vignesh
     * Navigates to and clicks on the contact button after ensuring its visibility and readiness.
     * Handles hovering and clicking actions for smooth navigation to the contact section.
     */
    public void clickContact() {
        driverHelper.hover(InstituteLocators.specilaSelectcontact);
        driverHelper.waitForClickability(InstituteLocators.contact, 3);
        driverHelper.clickTheElement(InstituteLocators.contact);
    }
 
    /**
     * Author: Vignesh
     * Verifies the visibility of the contact options and performs actions to view
     * phone details and contact Cleveland Clinic's support section.
     */
    public void viewPhoneDirect() {
        driverHelper.waitForClickability(ContactLocators.viewp, 3);
        driverHelper.scrollToElement(ContactLocators.viewp);
        driverHelper.clickTheElement(ContactLocators.viewPhone);
        driverHelper.clickTheElement(ContactLocators.contactCleveland);
    }
 
    /**
     * Author: Vignesh
     * Navigates to and clicks on the Cleveland home page contact link. Handles
     * element hovering and clicking interactions.
     */
    public void clickClevelanHome() {
        driverHelper.waitForClickability(ContactLocators.contactClevelandhome, 10);
        driverHelper.hover(ContactLocators.contactClevelandhome);
        driverHelper.clickTheElement(ContactLocators.contactClevelandhome);
    }
 
    /**
     * Author: Vignesh
     * Verifies and clicks on the parking section element for additional information.
     * Logs the action performed in the test report.
     *
     * @param test The ExtentTest object for logging the status of the actions.
     */
    public void verifyParking(ExtentTest test) {
        driverHelper.hover(NeedHelpLocators.parking);
        driverHelper.scrollToElementandCLick(NeedHelpLocators.parking);
        LoggerHandler.info("click on parking");
        test.log(Status.INFO, "click on parking");
    }
 
    /**
     * Author: Vignesh
     * Performs a sequence of actions to navigate through and interact with the
     * virtual assistance section and related elements.
     */
    public void tillVirtualSecond() {
        driverHelper.clickTheElement(NeedHelpLocators.needassitance);
        driverHelper.clickTheElement(NeedHelpLocators.globalPatient);
        driverHelper.scrollToElementandCLick(NeedHelpLocators.speakwithteam);
        driverHelper.scrollToElement(NeedHelpLocators.virtualSecond);
        driverHelper.scrollToElementandCLick(NeedHelpLocators.virtualSecond);
    }
 
    /**
     * Author: Vignesh
     * Captures a screenshot of the current page when clicking the "Get Started" button
     * and attaches it to the test report.
     *
     * @param test The ExtentTest object for logging the status of the actions and
     *             attaching the screenshot.
     */
    public void getScreenshot(ExtentTest test) {
        driverHelper.clickTheElement(NeedHelpLocators.getStarted);
        Screenshot.captureScreenshot(Base.driver, "create_account");
        ReportHelper.attachScreenshotToReport("create_account", test, "");
    }
}