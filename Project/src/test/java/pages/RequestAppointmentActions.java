package pages;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.RequestAppointmentLocators;
import utils.Base;
import utils.ExcelReader;
import utils.ReportHelper;
import utils.Screenshot;
import utils.WebDriverHelper;
 
public class RequestAppointmentActions
{
    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);
    public void clickOnGetStarted(ExtentTest test)
    {
        driverHelper.hoverAndClick(RequestAppointmentLocators.RequestAppointment_Get_Started);
        test.log(Status.INFO, "Clicked on Get Started");
       
    }
    public void clickOnNextButton(ExtentTest test)
    {
        driverHelper.waitForClickability(RequestAppointmentLocators.RequestAppointment_NextButton, 10);
        driverHelper.hoverAndClick(RequestAppointmentLocators.RequestAppointment_NextButton);
        test.log(Status.INFO, "Clicked on Next Button");
    }
    public void clickOnMe(ExtentTest test)
    {
        driverHelper.waitForClickability(RequestAppointmentLocators.RequestAppointment_Me, 10);
        driverHelper.hoverAndClick(RequestAppointmentLocators.RequestAppointment_Me);
        test.log(Status.INFO, "Clicked on Me Option ");
    }
    public void clickOnNot_Sure(ExtentTest test)
    {
        driverHelper.clickTheElement(RequestAppointmentLocators.RequestAppointment_Not_Sure);
        test.log(Status.INFO, "Clicked on Not sure Option");
    }
    public void fillTheDetails(ExtentTest test)
    {
        driverHelper.typeText(RequestAppointmentLocators.RequestAppointment_Firstname, ExcelReader.readCellValue("Sheet1", "1", "value"));
        test.log(Status.INFO, "Entered FirstName in the Input Field");
        driverHelper.typeText(RequestAppointmentLocators.RequestAppointment_Lastname, ExcelReader.readCellValue("Sheet1", "2", "value"));
        test.log(Status.INFO, "Entered LastName in the Input Field");
        driverHelper.selectByValue(RequestAppointmentLocators.RequestAppointment_Gender, ExcelReader.readCellValue("Sheet1", "3", "value"));
        test.log(Status.INFO, "Selected Male in DropDown");
        driverHelper.selectByValue(RequestAppointmentLocators.RequestAppointment_MaritalStatus, ExcelReader.readCellValue("Sheet1", "4", "value"));
        test.log(Status.INFO, "Selected Single in DropDown");
        driverHelper.typeText(RequestAppointmentLocators.RequestAppointment_DOB, ExcelReader.readCellValue("Sheet1", "5", "value"));
        test.log(Status.INFO, "Entered DOB in the Input Field");
        driverHelper.hoverAndClick(RequestAppointmentLocators.RequestAppointment_NextButton);
        test.log(Status.INFO, "Clicked on Next Button");
    }
    public void fillcontacts(ExtentTest test)
    {
        driverHelper.typeText(RequestAppointmentLocators.RequestAppointment_Address, ExcelReader.readCellValue("Sheet1", "6", "value"));
        test.log(Status.INFO, "Entered Address in the Input Field");
        driverHelper.typeText(RequestAppointmentLocators.RequestAppointment_City, ExcelReader.readCellValue("Sheet1", "7", "value"));
        test.log(Status.INFO, "Entered City in the Input Field");
        driverHelper.waitForClickability(RequestAppointmentLocators.RequestAppointment_StateCategory, 10);
        driverHelper.selectByVisibleText(RequestAppointmentLocators.RequestAppointment_StateCategory, ExcelReader.readCellValue("Sheet1", "8", "value"));
        test.log(Status.INFO, "Selected State in DropDown");
        driverHelper.typeText(RequestAppointmentLocators.RequestAppointment_Email, ExcelReader.readCellValue("Sheet1", "9", "value"));
        test.log(Status.INFO, "Entered Email in the Input Field");
        driverHelper.typeText(RequestAppointmentLocators.RequestAppointment_Zipcode, ExcelReader.readCellValue("Sheet1", "10", "value"));
        test.log(Status.INFO, "Entered Zipcode in the Input Field");
        driverHelper.typeText(RequestAppointmentLocators.RequestAppointment_Phone_number, ExcelReader.readCellValue("Sheet1", "11", "value"));
        test.log(Status.INFO, "Entered Phone Number in the Input Field");
        driverHelper.hoverAndClick(RequestAppointmentLocators.RequestAppointment_NextButton);
        test.log(Status.INFO, "Clicked on Next Button");
    }
    public void appointmentneed(ExtentTest test)
    {
        driverHelper.typeText(RequestAppointmentLocators.RequestAppointment_Reason, ExcelReader.readCellValue("Sheet1", "12", "value"));
        test.log(Status.INFO, "Entered Reason For Appoinment in the Input Field");
        driverHelper.hoverAndClick(RequestAppointmentLocators.RequestAppointment_NextButton);
        test.log(Status.INFO, "Clicked on Next Button");
        driverHelper.waitForVisibility(RequestAppointmentLocators.RequestAppointment_Verification_Label, 10);
        Screenshot.screenShotAndHighlight(Base.driver, RequestAppointmentLocators.RequestAppointment_Verification_Label, "Tell us about your appointment needs (cont)");
        ReportHelper.attachScreenshotToReport("Tell us about your appointment needs (cont)", test, "Tell us about your appointment needs (cont)");
    }
 
    public void requestAppointmentAction(ExtentTest test)
    {
        clickOnGetStarted(test);
        clickOnNextButton(test);
        clickOnMe(test);
        clickOnNot_Sure(test);
        fillTheDetails(test);
        fillcontacts(test);
        appointmentneed(test);
    }
 
}
 