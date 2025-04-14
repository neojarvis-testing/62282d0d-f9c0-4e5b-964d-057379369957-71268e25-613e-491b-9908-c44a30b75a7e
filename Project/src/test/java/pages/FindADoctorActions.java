package pages;
import com.aventstack.extentreports.ExtentTest; 
import uistore.FindADoctorLocators;
import utils.Base;
import utils.ExcelReader;
import utils.ReportHelper;
import utils.Screenshot;
import utils.WebDriverHelper;
 
public class FindADoctorActions
{
 
    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);
   
    /**
     * Author: Kiruthik Vijey Raj P
     * This method types the specified text into the search bar located by the given locator.
     * It is useful for entering search queries into the search bar.
     */
 
    public  void searchBar()
    {
        driverHelper.typeText(FindADoctorLocators.FindADoctorLocators_searchBar,"Heart");
    }
 
    /**
     * Author: Kiruthik Vijey Raj P
     * This method interacts with various filter sections on the "Find a Doctor" page.
     * It waits for elements to be clickable or visible, clicks on them, and enters text where necessary.
     * It is useful for setting filters such as location, department, and language.
     */
 
    public void filterSection()
    {
        driverHelper.waitForClickability(FindADoctorLocators.FindADoctorLocators_location, 10);
        driverHelper.clickTheElement(FindADoctorLocators.FindADoctorLocators_location);
        driverHelper.clickTheElement(FindADoctorLocators.FindADoctorLocators_locationOption);
        Screenshot.captureScreenshot(Base.driver,"location");
        driverHelper.waitForClickability(FindADoctorLocators.FindADoctorLocators_Department,10);
        driverHelper.clickTheElement(FindADoctorLocators.FindADoctorLocators_Department);
        driverHelper.waitForClickability(FindADoctorLocators.FindADoctorLocators_DepartmentOption, 10);
        driverHelper.clickTheElement(FindADoctorLocators.FindADoctorLocators_DepartmentOption);
        driverHelper.waitForClickability(FindADoctorLocators.FindADoctorLocators_Language,10);
        driverHelper.clickTheElement(FindADoctorLocators.FindADoctorLocators_Language);
        driverHelper.typeText(FindADoctorLocators.FindADoctorLocators_Language, ExcelReader.readCellValue("Sheet1", "13", "value"));
        driverHelper.pressEnter(FindADoctorLocators.FindADoctorLocators_Language);
    }
   
    /**
     * Author: Kiruthik Vijey Raj P
     * This method clicks on the "Find a Doctor" button and handles the resulting actions.
     * It waits for the element to be clickable, clicks it, switches to a new window, takes a screenshot, and attaches it to the report.
     *
     * @param test The ExtentTest object used for logging test information.
     */
 
    public void clickFindADoctorLocators(ExtentTest test)
    {
        driverHelper.waitForClickability(FindADoctorLocators.FindADoctorLocators_Request,5);
        driverHelper.clickTheElement(FindADoctorLocators.FindADoctorLocators_Request);
        driverHelper.switchWindow();
        Screenshot.screenShotAndHighlight(Base.driver, FindADoctorLocators.FindADoctorLocators_Label, "Find Doctor");
        ReportHelper.attachScreenshotToReport("Find Doctor", test,"Screenshot");
    }
    public void findADoctorAction(ExtentTest test)
    {
        searchBar();
        filterSection();
        clickFindADoctorLocators(test);
    }
}