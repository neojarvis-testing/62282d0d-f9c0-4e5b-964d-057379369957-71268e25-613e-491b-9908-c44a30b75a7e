package pages;
import uistore.HealthLibraryLocators;
import utils.Base;
import utils.WebDriverHelper;
public class HealthLibraryActions{
    WebDriverHelper driverHelper=new WebDriverHelper(Base.driver);
    /**
     * Author: Vignesh
     * Clicks on the 'Body Systems and Organs' section to navigate further.
     */
    public void clickOnEyes(){
        driverHelper.scrollToElementandCLick(HealthLibraryLocators.bodySysAndOrgans);
        driverHelper.waitForVisibility(HealthLibraryLocators.searchBar,10);
        driverHelper.typeText(HealthLibraryLocators.searchBar,"Eyes");
        driverHelper.pressEnter(HealthLibraryLocators.searchBar);
        driverHelper.clickTheElement(HealthLibraryLocators.eyes);
    }
}
 