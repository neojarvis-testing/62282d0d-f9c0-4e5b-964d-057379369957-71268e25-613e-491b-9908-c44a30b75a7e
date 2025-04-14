package pages;
 
import org.openqa.selenium.JavascriptExecutor;
 
import uistore.EyeLocators;
import utils.Base;
import utils.WebDriverHelper;
 
public class EyeActions {
    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);
    /**
     * Author: Vignesh
     * Navigates to the 'Eye Diseases' section. This method performs a series of actions:
     * - Scrolls to the specified element on the page using JavaScript.
     * - Hovers over the target element to bring it into view.
     * - Waits for the visibility of the 'Allergies' element.
     * - Clicks on the 'Allergies' section and switches to the new window.
     * - Closes the new window, switches back to the parent window, and navigates back to the previous page.
     */
    public void eyeDiseases() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) Base.driver;
        js.executeScript("window.scrollBy(0,1000)", "");
        driverHelper.hover(EyeLocators.scrollelemnet);
        driverHelper.waitForVisibility(EyeLocators.allergies, 10);
        String cwindow = Base.driver.getWindowHandle();
        driverHelper.scrollToElementandCLick(EyeLocators.allergies);
        driverHelper.switchWindow();
        Base.driver.close();
 
        Base.driver.switchTo().window(cwindow);
 
        Base.driver.navigate().back();
 
    }
}