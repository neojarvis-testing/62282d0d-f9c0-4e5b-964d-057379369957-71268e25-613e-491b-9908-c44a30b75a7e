package pages;
import uistore.BSOLocatorss;
import utils.Base;
import utils.WebDriverHelper;
public class BSOActions {
    WebDriverHelper driverHelper=new WebDriverHelper(Base.driver);
     /**
     * Author: Vignesh
     * element, selects the 'Red Eye' option, switches to a new window, and
     * handles further actions as necessary.
     */
    public void eyeDiseases(){
       driverHelper.waitForClickability(BSOLocatorss.redEye,10);
       driverHelper.hover(BSOLocatorss.eyeAppearance);
       driverHelper.clickTheElement(BSOLocatorss.redEye);
       driverHelper.switchWindow();
   }
}
 
 