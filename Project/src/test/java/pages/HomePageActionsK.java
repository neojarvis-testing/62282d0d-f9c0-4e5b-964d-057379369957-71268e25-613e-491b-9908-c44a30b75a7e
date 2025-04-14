package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import utils.Base;
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
         driverHelper.clickTheElement(HomePageLocators.Appointments_ScheduleNow);
        //  test.log(Status.PASS, "Clicked on schedule now as Excepted");
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
        //  test.log(Status.PASS, "Clicked on Find a Doctor as Excepted");
         }catch(Exception e)
         {
            //  test.log(Status.FAIL, e.getMessage());
            //  ReportHelper.attachScreenshotToReport("Appointments_Request", test, "Appointments_Request failed");
        }
    }

}
