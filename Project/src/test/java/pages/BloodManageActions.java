package pages;
 
import uistore.BloodManageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;
 
public class BloodManageActions {
    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);
 
    /**
     * Author: Vignesh
     * Hovers over and clicks the 'Contact' button, captures a highlighted
     * screenshot, and navigates back.
     */
    public void bloodMethod() throws InterruptedException {
        driverHelper.waitForClickability(BloodManageLocators.contact, 4);
        driverHelper.hover(BloodManageLocators.contact);
        driverHelper.clickTheElement(BloodManageLocators.contact);
        Screenshot.screenShotAndHighlight(Base.driver, BloodManageLocators.contact, "name");
        Base.driver.navigate().back();
 
    }
}
 