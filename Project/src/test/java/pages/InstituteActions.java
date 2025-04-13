package pages;
 
import uistore.InstituteLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;
 
/**
 * Author: Vignesh
 * The InstituteActions class provides methods for navigating and interacting with institute-related sections.
 */
public class InstituteActions {
    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);
 
    /**
     * Author: Vignesh
     * Hovers over the selection element and clicks on 'Blood Management.'
     */
    public void bloodacction() {
        driverHelper.hover(InstituteLocators.specilaSelect);
        driverHelper.clickTheElement(InstituteLocators.bloodManagement);
    }
 
    /**
     * Author: Vignesh
     * Ensures clickability, scrolls, hovers, and clicks on 'Pharmacy,' with form verification logged.
     */
    public void pharmacyAction() {
        driverHelper.waitForClickability(InstituteLocators.specilaSelect, 3);
        driverHelper.scrollToElement(InstituteLocators.specilaSelect);
        driverHelper.waitForClickability(InstituteLocators.specilaSelect, 3);
        driverHelper.hover(InstituteLocators.specilaSelect);
        driverHelper.clickTheElement(InstituteLocators.pharmacy);
        LoggerHandler.info("verify forms");
    }
}
 