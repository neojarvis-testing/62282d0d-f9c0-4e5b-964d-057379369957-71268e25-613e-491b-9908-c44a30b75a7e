package pages;
 
 
import uistore.RequestAppointmentLocators;
import utils.Base;
import utils.ReportHelper;
import utils.Screenshot;
import utils.WebDriverHelper;
 
public class RequestAppointmentActions
{
    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);
    
    /**
     * Author: Kiruthik Vijey Raj P
     * This method hovers over and clicks on the "Get Started" button on the request appointment page.
     */

    public void clickOnGetStarted()
    {
        driverHelper.hover(RequestAppointmentLocators.RequestAppointment_Get_Started);
        driverHelper.clickTheElement(RequestAppointmentLocators.RequestAppointment_Get_Started);       
    }
    
    /**
     * Author: Kiruthik Vijey Raj P
     * This method waits for the "Next" button to be clickable, then hovers over and clicks it.
     */

    public void clickOnNextButton()
    {
        driverHelper.waitForClickability(RequestAppointmentLocators.RequestAppointment_NextButton, 10);
        driverHelper.hoverAndClick(RequestAppointmentLocators.RequestAppointment_NextButton);
    }
    
    /**
     * Author: Kiruthik Vijey Raj P
     * This method waits for the "Me" option to be clickable, then hovers over and clicks it.
     */

    public void clickOnMe()
    {
        driverHelper.waitForClickability(RequestAppointmentLocators.RequestAppointment_Me, 10);
        driverHelper.hoverAndClick(RequestAppointmentLocators.RequestAppointment_Me);
    }
    
    /**
     * Author: Kiruthik Vijey Raj P
     * This method clicks on the "Not Sure" option on the request appointment page.
     */

    public void clickOnNot_Sure()
    {
        driverHelper.clickTheElement(RequestAppointmentLocators.RequestAppointment_Not_Sure);
    }
    
    /**
     * Author: Kiruthik Vijey Raj P
     * This method fills in the personal details required for the appointment request.
     *
     * @param firstName The first name of the person.
     * @param lastName The last name of the person.
     * @param gender The gender of the person.
     * @param status The marital status of the person.
     * @param DOB The date of birth of the person.
     */

    public void fillTheDetails(String firstName,String lastName,String gender,String status,String DOB)
    {
        driverHelper.typeText(RequestAppointmentLocators.RequestAppointment_Firstname, firstName);
        driverHelper.typeText(RequestAppointmentLocators.RequestAppointment_Lastname, lastName);
        driverHelper.selectByValue(RequestAppointmentLocators.RequestAppointment_Gender, gender);
        driverHelper.selectByValue(RequestAppointmentLocators.RequestAppointment_MaritalStatus, status);
        driverHelper.typeText(RequestAppointmentLocators.RequestAppointment_DOB, DOB);
    }
    
    /**
     * Author: Kiruthik Vijey Raj P
     * This method fills in the contact details required for the appointment request.
     *
     * @param address The address of the person.
     * @param city The city of the person.
     * @param state The state of the person.
     * @param zipcode The zip code of the person.
     * @param email The email address of the person.
     * @param phone The phone number of the person.
     */

    public void fillcontacts(String address,String city,String state,String zipcode,String email,String phone)
    {
        driverHelper.clickUsingJS(RequestAppointmentLocators.RequestAppointment_Address);
        driverHelper.typeText(RequestAppointmentLocators.RequestAppointment_Address, address);
        driverHelper.typeText(RequestAppointmentLocators.RequestAppointment_City, city);
        driverHelper.waitForClickability(RequestAppointmentLocators.RequestAppointment_StateCategory, 10);
        driverHelper.selectByVisibleText(RequestAppointmentLocators.RequestAppointment_StateCategory, state);
        driverHelper.typeText(RequestAppointmentLocators.RequestAppointment_Email, email);
        driverHelper.typeText(RequestAppointmentLocators.RequestAppointment_Zipcode, zipcode);
        driverHelper.typeText(RequestAppointmentLocators.RequestAppointment_Phone_number, phone);
        driverHelper.hoverAndClick(RequestAppointmentLocators.RequestAppointment_NextButton);
    }
    
    /**
     * Author: Kiruthik Vijey Raj P
     * This method fills in the reason for the appointment and proceeds to the next step.
     *
     * @param reason The reason for the appointment.
     */

    public void appointmentneed(String reason)
    {
        driverHelper.typeText(RequestAppointmentLocators.RequestAppointment_Reason, reason);
        driverHelper.hoverAndClick(RequestAppointmentLocators.RequestAppointment_NextButton);
        driverHelper.waitForVisibility(RequestAppointmentLocators.RequestAppointment_Verification_Label, 10);
        Screenshot.screenShotAndHighlight(Base.driver,RequestAppointmentLocators.RequestAppointment_Verification_Label,"Find a doctor");
    }
}
 