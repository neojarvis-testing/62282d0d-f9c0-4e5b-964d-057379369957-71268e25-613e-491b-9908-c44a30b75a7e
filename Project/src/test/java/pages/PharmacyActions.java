package pages;
 
import org.openqa.selenium.JavascriptExecutor;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.PharmacyLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;
 
/**
 * Author: Vignesh
 * The PharmacyActions class contains methods for interacting with the pharmacy-related sections of the application.
 */
public class PharmacyActions {
    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);
 
    /**
     * Author: Vignesh
     * Clicks 'takeSurvey,' switches windows, verifies forms, and navigates back.
     */
    public void takeSurvey(ExtentTest test) throws InterruptedException {
        driverHelper.waitForVisibility(PharmacyLocators.takeSurvey, 3);
        JavascriptExecutor js = (JavascriptExecutor) Base.driver;
        js.executeScript("window.scrollBy(0,1000)", "");
        driverHelper.hover(PharmacyLocators.takeSurveySpecila);;
        String cwindow = Base.driver.getWindowHandle();
        driverHelper.clickTheElement(PharmacyLocators.takeSurvey);
        driverHelper.switchWindow();
        test.log(Status.PASS, "click on parking");
        LoggerHandler.info("verify forms");
        test.log(Status.INFO, "verify forms");
        Base.driver.close();
        Base.driver.switchTo().window(cwindow);
        Base.driver.navigate().back();
    }
}