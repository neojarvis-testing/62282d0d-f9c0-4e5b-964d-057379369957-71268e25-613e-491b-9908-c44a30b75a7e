package pages;
import java.time.Duration;
import uistore.HomePageLocators;
import uistore.LocationPageLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomePageAction {
    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);

    public void homePage() {
        try {

            driverHelper.hover(HomePageLocators.getDirection);
            driverHelper.clickTheElement(HomePageLocators.getDirection);
            // LoggerHandler.info("Clicked");
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public void secondpageAction() {
        try {
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            driverHelper.clickTheElement(LocationPageLocators.searchbar);
           // LoggerHandler.createLogTextInfo(LocationPageLocators.searchbar,"Clicked");
            String data = ExcelReader.readCellValue("Sheet4", "1", "value");
            driverHelper.typeText(LocationPageLocators.searchbar, data);
            //LoggerHandler.createLogTextInfo(LocationPageLocators.searchbar, "Sent Text");
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void locationTypesInput() {
        try {

            driverHelper.clickTheElement(LocationPageLocators.locationTypes);
           // LoggerHandler.createLogTextInfo(LocationPageLocators.locationTypes, "Clicked");
            driverHelper.waitForVisibility(LocationPageLocators.locationTypes, 10);
            //LoggerHandler.createLogTextInfo(LocationPageLocators.locationTypes, "Element visible");
            driverHelper.clickTheElement(LocationPageLocators.healthCentre);
           // LoggerHandler.createLogTextInfo(LocationPageLocators.healthCentre, "Clicked");
           // Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            Thread.sleep(3000);
            // driverHelper.clickTheElement(LocationPageLocators.locationtypes1);
            driverHelper.selectByValue(LocationPageLocators.locationtypes1, "Imaging & Radiology");
           // LoggerHandler.createLogInfo("Element Selected");
            // driverHelper.waitForVisibility(LocationPageLocators.locationtypes1, 10);
           // LoggerHandler.createLogTextInfo(LocationPageLocators.locationtypes1, "Element Visible");
            // driverHelper.clickTheElement(LocationPageLocators.imagingradiology);
           // LoggerHandler.createLogTextInfo(LocationPageLocators.locationtypes1, "Click");
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void specialityInput() {
        try {

            driverHelper.clickTheElement(LocationPageLocators.speciality);
           // LoggerHandler.createLogTextInfo(LocationPageLocators.speciality, "Clicked");
            driverHelper.waitForVisibility(LocationPageLocators.speciality, 10);
           // LoggerHandler.createLogTextInfo(LocationPageLocators.speciality, "Element Visible");
            driverHelper.clickTheElement(LocationPageLocators.astama);
           // LoggerHandler.createLogTextInfo(LocationPageLocators.speciality1, "Clicked");
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driverHelper.waitForVisibility(LocationPageLocators.speciality1, 10);
           // LoggerHandler.createLogTextInfo(LocationPageLocators.speciality1, "Element Visible");
            driverHelper.clickTheElement(LocationPageLocators.speciality1);
          //  LoggerHandler.createLogTextInfo(LocationPageLocators.speciality1, "Clicked");
            driverHelper.clickTheElement(LocationPageLocators.brainhealth);
           // LoggerHandler.createLogTextInfo(LocationPageLocators.brainhealth, "Clicked");
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void serviceTypesInput() {
        try {

            driverHelper.clickTheElement(LocationPageLocators.serviceTypes);
          //  LoggerHandler.createLogTextInfo(LocationPageLocators.serviceTypes, "Clicked");
            driverHelper.waitForVisibility(LocationPageLocators.serviceTypes, 10);
           // LoggerHandler.createLogTextInfo(LocationPageLocators.serviceTypes, "Element Visible");
            
            driverHelper.clickTheElement(LocationPageLocators.emergency);
          //  LoggerHandler.createLogTextInfo(LocationPageLocators.emergency, "Clicked");
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            
            driverHelper.waitForVisibility(LocationPageLocators.serviceTypes1, 10);
          //  LoggerHandler.createLogTextInfo(LocationPageLocators.serviceTypes1, "Element Visible");
            driverHelper.clickTheElement(LocationPageLocators.serviceTypes1);
           // LoggerHandler.createLogTextInfo(LocationPageLocators.serviceTypes1, "Clicked");
            driverHelper.clickTheElement(LocationPageLocators.expresscare);
           // LoggerHandler.createLogTextError(LocationPageLocators.expresscare,"Clicked");
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void buttondirection() {
        try {
            driverHelper.clickTheElement(LocationPageLocators.DirectionButton);
           // LoggerHandler.createLogTextError(LocationPageLocators.DirectionButton,"Clicked");
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void secondwindow() {
        try {
            
            driverHelper.switchWindow();
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            driverHelper.waitForVisibility(LocationPageLocators.signinsecond, 5);
        //    LoggerHandler.createLogTextInfo(LocationPageLocators.signinsecond,"Element Visible");
            Screenshot.screenShotAndHighlight(Base.driver, LocationPageLocators.signinsecond, "Google Maps page");
          //  LoggerHandler.createLogTextInfo(LocationPageLocators.signinsecond,"Screenshot Captured");
          //  LoggerHandler.createLogInfo("verify forms");    
            driverHelper.verifyUrl(ExcelReader.readCellValue("Sheet1", "2", "value"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void wrappingMethod() {
        try {
            homePage();
            secondpageAction();
            locationTypesInput();
            specialityInput();
            serviceTypesInput();
            buttondirection();
            secondwindow();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
