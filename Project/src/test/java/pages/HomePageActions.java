package pages;
import java.time.Duration;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.HomePageLocators;
import uistore.NeedHelpLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.ReportHelper;
import utils.Screenshot;
import utils.WebDriverHelper;
 
public class HomePageActions {
    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);
 
    /**
     * Author: Kiruthik Vijey Raj P
     * This method clicks on the "Schedule Now" button on the home page.
     * It logs the action using the provided ExtentTest object.
     *
     * @param test The ExtentTest object used for logging test information.
     */
 
    public  void clickOnSchedule(ExtentTest test)
    {
        driverHelper.clickTheElement(HomePageLocators.Appointments_ScheduleNow);
        test.log(Status.INFO, "Clicked on schedule now");
    }
 
   
    /**
     * Author: Kiruthik Vijey Raj P
     * This method clicks on the "Find a Doctor" button on the home page.
     * It logs the action using the provided ExtentTest object.
     *
     * @param test The ExtentTest object used for logging test information.
     */
 
    public  void clickOnFindADoctor(ExtentTest test)
    {
        driverHelper.clickTheElement(HomePageLocators.Appointments_Find_a_Doctor);
        test.log(Status.INFO, "Clicked on Request an Appointment");
    }
   
    /**
     * Author: Vignesh
     * Clicks on the 'Health Library' section to navigate to the health library page.
     */
    public void healthLibrary() {
        driverHelper.clickTheElement(HomePageLocators.healthLibrary);
    }
    
    /**
     * Author: Vignesh
     * Clicks on the 'Institute and Departments' section to navigate to the relevant page.
     */
    public void institute() {
        driverHelper.clickTheElement(HomePageLocators.institueAndDepat);
    }
    
    /**
     * Author: Vignesh
     Clicks on the 'need help' section to navigate to the relevant page.
    */
    public void clickNeedHelp() {
        driverHelper.waitForClickability(NeedHelpLocators.needHelp, 3);
        driverHelper.hover(NeedHelpLocators.needHelp);
        driverHelper.clickTheElement(NeedHelpLocators.needHelp);
    }
   
   
    /**
     * Author: Vinny Claret.A
     * This method performs a search operation on the home page.
     * It clicks on the search icon, enters the search term "Respiratory", and presses Enter.
     * It then verifies the page title, waits for an element to be clickable, clicks it, and retrieves text from another element.
     *
     * @throws Exception If an error occurs during the search operation.
     */
    public void searchOperation()
    {
        driverHelper.clickTheElement(HomePageLocators.search);
        driverHelper.clickTheElement(HomePageLocators.searchbar);
        driverHelper.typeText(HomePageLocators.searchbar, "Respiratory");
   
        driverHelper.pressEnter(HomePageLocators.searchbar);
        String title = Base.driver.getTitle();
        driverHelper.verifyTitle(title);
       
        driverHelper.waitForClickability(HomePageLocators.firstResp, 2);
        driverHelper.clickTheElement(HomePageLocators.firstResp);
        driverHelper.retrieveText(HomePageLocators.verifyResp);
    }
   
    /**
     * Author: Vinny Claret. A
     * This method performs a search operation by calling the searchOperation method.
     *
     * @throws Exception If an error occurs during the search operation.
     */
 
    public void searchAll()
    {
        searchOperation();
    }
   
    /**
     * Author: Harshit Tomar
     * This method clicks on the Facebook social link on the home page.
     * It takes a screenshot, switches to the new window, and then closes it.
     */
 
    public void clickFaceBook(){
        String mainWindowHandle = Base.driver.getWindowHandle();
	        driverHelper.clickTheElement(HomePageLocators.facebookSocialLink);
	        driverHelper.switchWindow();   
	        driverHelper.assertUrl(ExcelReader.readCellValue("data1", "facebook", "value"));
	        Base.driver.close();
	        Base.driver.switchTo().window(mainWindowHandle);         
    }
   
    /**
     * Author: Harshit Tomar
     * This method clicks on the Twitter social link on the home page.
     * It switches to the new window and then closes it.
     */
 
    public void clickTwitter(){
        String mainWindowHandle = Base.driver.getWindowHandle();
	        driverHelper.clickTheElement(HomePageLocators.twitterSocialLink);
	        driverHelper.switchWindow();      
	        driverHelper.assertUrl(ExcelReader.readCellValue("data1", "twitter", "value"));
	        Base.driver.close();
	        Base.driver.switchTo().window(mainWindowHandle);
    }
   
    /**
     * Author: Harshit Tomar
     * This method clicks on the YouTube social link on the home page.
     * It switches to the new window and then closes it.
     */
 
    public void clickYoutube(){
        String mainWindowHandle = Base.driver.getWindowHandle();
        driverHelper.clickTheElement(HomePageLocators.youtubeSocialLink);
        driverHelper.assertHref(HomePageLocators.youtubeSocialLink,ExcelReader.readCellValue("data1", "youtube", "value"));
        driverHelper.switchWindow();      
        Base.driver.close();
        Base.driver.switchTo().window(mainWindowHandle);
    }
   
    /**
     * Author: Harshit Tomar
     * This method clicks on the Instagram social link on the home page.
     * It switches to the new window and then closes it.
     */
 
    public void clickInstagram(){
        String mainWindowHandle = Base.driver.getWindowHandle();
        driverHelper.clickTheElement(HomePageLocators.instagramSocialLink);
        driverHelper.switchWindow();      
        driverHelper.assertUrl(ExcelReader.readCellValue("data1", "instagram", "value"));
        Base.driver.close();
        Base.driver.switchTo().window(mainWindowHandle);
    }
       
    /**
     * Author: Harshit Tomar
     * This method clicks on the LinkedIn social link on the home page.
     * It switches to the new window and then closes it.
     */
 
    public void clickLinkedIn(){
        String mainWindowHandle = Base.driver.getWindowHandle();
        driverHelper.clickTheElement(HomePageLocators.linkedinSocialLink);
        driverHelper.switchWindow();        
        driverHelper.assertUrl(ExcelReader.readCellValue("data1", "linkedIn", "value"));
        Base.driver.close();
        Base.driver.switchTo().window(mainWindowHandle);
    }
   
    /**
     * Author: Harshit Tomar
     * This method clicks on the Pinterest social link on the home page.
     * It switches to the new window and then closes it.
     */
 
    public void clickPinterest(){
        String mainWindowHandle = Base.driver.getWindowHandle();
        driverHelper.clickTheElement(HomePageLocators.pinterestSocialLink);
        driverHelper.switchWindow();      
        driverHelper.assertUrl(ExcelReader.readCellValue("data1", "pinterest", "value"));
        Base.driver.close();
        Base.driver.switchTo().window(mainWindowHandle);
    }
   
    /**
     * Author: Harshit Tomar
     * This method clicks on the Snapchat social link on the home page.
     * It switches to the new window and then closes it.
     */
 
    public void clickSnapchat(){
        String mainWindowHandle = Base.driver.getWindowHandle();
        driverHelper.clickTheElement(HomePageLocators.snapchatSocialLink);
        driverHelper.switchWindow();    
        driverHelper.assertUrl(ExcelReader.readCellValue("data1", "snapchat", "value"));
        Base.driver.close();
        Base.driver.switchTo().window(mainWindowHandle);
    }
   
    /**
     * Author: Harshit Tomar
     * This method clicks on the "Appointments Access" link on the home page.
     * It scrolls to the element, clicks it, and then navigates back.
     */
 
    public void clickAppointmentsAccess(){
        driverHelper.scrollToElement(HomePageLocators.appointmentsActions);
        driverHelper.clickTheElement(HomePageLocators.appointmentsActions);
        driverHelper.assertUrl(ExcelReader.readCellValue("data1", "appointments", "value"));
        Base.driver.navigate().back();
    }
   
    /**
     * Author: Harshit Tomar
     * This method clicks on the "Accepted Insurance" link on the home page.
     * It scrolls to the element, clicks it, and then navigates back.
     */
 
    public void clickAcceptedInsurance(){
        driverHelper.scrollToElement(HomePageLocators.acceptedInsuranceActions);
        driverHelper.clickTheElement(HomePageLocators.acceptedInsuranceActions);
        driverHelper.assertUrl(ExcelReader.readCellValue("data1", "insurance", "value"));
        Base.driver.navigate().back();
    }
   
    /**
     * Author: Harshit Tomar
     * This method clicks on the "Events Calender" link on the home page.
     * It scrolls to the element, clicks it, and then navigates back.
     */
 
    public void clickEventsCalender(){
        String mainWindowHandle = Base.driver.getWindowHandle();
        driverHelper.scrollToElement(HomePageLocators.eventsCalenderActions);
        driverHelper.clickTheElement(HomePageLocators.eventsCalenderActions);
        driverHelper.switchWindow();    
        driverHelper.assertUrl(ExcelReader.readCellValue("data1", "calender", "value"));
        Base.driver.close();
        Base.driver.switchTo().window(mainWindowHandle);
    }
   
    /**
     * Author: Harshit Tomar
     * This method clicks on the "Financial Assistance" link on the home page.
     * It scrolls to the element, clicks it, and then navigates back.
     */
 
    public void clickFinancialAssistance(){
        driverHelper.scrollToElement(HomePageLocators.financialAssistanceActions);
        driverHelper.clickTheElement(HomePageLocators.financialAssistanceActions);
        driverHelper.assertUrl(ExcelReader.readCellValue("data1", "financial", "value"));
        Base.driver.navigate().back();
    }
   
    /**
     * Author: Harshit Tomar
     * This method clicks on the "Give to Cleveland Clinic" link on the home page.
     * It scrolls to the element, clicks it, and then navigates back.
     */
 
    public void clickGiveCleveland(){
        driverHelper.scrollToElement(HomePageLocators.giveClevelandActions);
        driverHelper.clickTheElement(HomePageLocators.giveClevelandActions);
        driverHelper.assertUrl(ExcelReader.readCellValue("data1", "giveCleveland", "value"));
        Base.driver.navigate().back();
    }
   
    /**
     * Author: Harshit Tomar
     * This method clicks on the "Pay Bill" link on the home page.
     * It scrolls to the element, clicks it, and then navigates back.
     */
 
    public void clickPayBill(){
        driverHelper.scrollToElement(HomePageLocators.payBillActions);
        driverHelper.clickTheElement(HomePageLocators.payBillActions);
        driverHelper.assertUrl(ExcelReader.readCellValue("data1", "payBill", "value"));
        Base.driver.navigate().back();
    }
   
    /**
     * Author: Harshit Tomar
     * This method clicks on the "Price Transparency" link on the home page.
     * It scrolls to the element, clicks it, and then navigates back.
     */
 
    public void clickPriceTransparency(){
        driverHelper.scrollToElement(HomePageLocators.priceTransparencyActions);
        driverHelper.clickTheElement(HomePageLocators.priceTransparencyActions);
        driverHelper.assertUrl(ExcelReader.readCellValue("data1", "transparency", "value"));
        Base.driver.navigate().back();
    }

    /**
     * Author: Harshit Tomar
     * This method clicks on the "Refer Patient" link on the home page.
     * It scrolls to the element, clicks it, and then navigates back.
     */
    public void clickReferPatient(){
        driverHelper.scrollToElement(HomePageLocators.referPatientActions);
        driverHelper.clickTheElement(HomePageLocators.referPatientActions);
        driverHelper.assertUrl(ExcelReader.readCellValue("data1", "patient", "value"));
        Base.driver.navigate().back();
    }

    /**
     * Author: Harshit Tomar
     * This method clicks on the "Phone Directory" link on the home page.
     * It scrolls to the element, clicks it, and then navigates back.
     */
    public void clickPhoneDirectory(){
        driverHelper.scrollToElement(HomePageLocators.phoneDirectoryActions);
        driverHelper.clickTheElement(HomePageLocators.phoneDirectoryActions);
        driverHelper.assertUrl(ExcelReader.readCellValue("data1", "directory", "value"));
        Base.driver.navigate().back();
    }

    /**
     * Author: Harshit Tomar
     * This method clicks on the "Virtual Opinions" link on the home page.
     * It scrolls to the element, clicks it, and then navigates back.
     */
    public void clickVirtualOpinions(){
        driverHelper.scrollToElement(HomePageLocators.virtualOpinionsActions);
        driverHelper.clickTheElement(HomePageLocators.virtualOpinionsActions);
        driverHelper.assertUrl(ExcelReader.readCellValue("data1", "vitualOpinions", "value"));
        Base.driver.navigate().back();
    }

    /**
     * Author: Harshit Tomar
     * This method clicks on the "Virtual Visits" link on the home page.
     * It scrolls to the element, clicks it, and then navigates back.
     */
    public void clickVirtualVisits(){
        driverHelper.scrollToElement(HomePageLocators.virtualVisitsActions);
        driverHelper.clickTheElement(HomePageLocators.virtualVisitsActions);
        driverHelper.assertUrl(ExcelReader.readCellValue("data1", "virtualVisits", "value"));
        Base.driver.navigate().back();
        driverHelper.clickTheElement(HomePageLocators.clevelandClinicHeader);
    }

 
    public void verifySocialLinks(ExtentTest test){
        clickFaceBook();

        clickInstagram();
    
        clickLinkedIn();

        clickPinterest();
     
        clickTwitter();
      
        clickYoutube();

        clickSnapchat();

    }
    public void verifyActionsFooter(ExtentTest test){
        clickAppointmentsAccess();

        clickAcceptedInsurance();
       
        clickEventsCalender();
       
        clickFinancialAssistance();
        
        clickGiveCleveland();
       
        clickPayBill();
       
        clickPriceTransparency();
        
        clickReferPatient();
      
        clickPhoneDirectory();
      
        clickVirtualOpinions();
        
        clickVirtualVisits();
      
    }
    
   
}