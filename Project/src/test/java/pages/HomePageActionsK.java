package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import stepdefinition.Hooks;
import uistore.HomePageLocators;
import utils.Base;
import utils.ReportHelper;
import utils.WebDriverHelper;

public class HomePageActionsK {
     WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);
 
     /**
     * Author: Kiruthik Vijey Raj P
     * This method clicks on the "Schedule Now" button on the home page.
     * It logs the action using the provided ExtentTest object.
     *
     * @param test The ExtentTest object used for logging test PASSrmation.
     */
 
    public  void clickOnSchedule()
    {
        try{    
            driverHelper.clickTheElement(HomePageLocators.Appointments_ScheduleNow);
            Hooks.test.log(Status.PASS, "Clicked on schedule now as Excepted");
        }catch(Exception e)
        {
        Hooks.test.log(Status.FAIL, e.getMessage());
        ReportHelper.attachScreenshotToReport("Schedule Now Button", Hooks.test, "Schedule Now Button click failed");
    }
    }
     
  
    
     /**
      * Author: Kiruthik Vijey Raj P
      * This method clicks on the "Find a Doctor" button on the home page.
      * It logs the action using the provided ExtentTest object.
      *
      * @param test The ExtentTest object used for logging test PASSrmation.
      */
  
     public  void clickOnFindADoctor()
     {
        try{
            driverHelper.clickTheElement(HomePageLocators.Appointments_Find_a_Doctor);
            Hooks.test.log(Status.PASS, "Clicked on Find a Doctor as Excepted");
         }catch(Exception e)
         {
            Hooks.test.log(Status.FAIL, e.getMessage());
            ReportHelper.attachScreenshotToReport("Appointments_Request", Hooks.test, "Appointments_Request failed");
        }
    }

}
