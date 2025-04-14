package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.RespiratoryLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class RespiratoryAction {
    WebDriverHelper help = new WebDriverHelper(Base.driver);
public void respOperation() 
{
   help.hoverAndClick(RespiratoryLocators.Introduction);
   //test.log(Status.PASS, "Clicked on Introduction");
   
   String intro = Base.driver.getTitle();
   help.verifyTitle(intro);
   help.hoverAndClick(RespiratoryLocators.cough);
  // test.log(Status.PASS, "Clicked on Cough");
   String cough = Base.driver.getTitle();
    help.verifyTitle(cough);


}
public void doctorFilters() 
{   Base.driver.navigate().back();
    Base.driver.navigate().back();
    Base.driver.navigate().back();
   
    help.hoverAndClick(RespiratoryLocators.byDoctors);
    
    help.hoverAndClick(RespiratoryLocators.specialist);
  
    help.hoverAndClick(RespiratoryLocators.male);
  
    help.hoverAndClick(RespiratoryLocators.female);
    String title = Base.driver.getTitle();
    help.verifyTitle(title);
   help.waitForClickability(RespiratoryLocators.mahamod, 2);
}
public void doctorSelect()
{
    help.hoverAndClick(RespiratoryLocators.mahamod);
   // test.log(Status.PASS, "Doctors Mamoun Abdoh, MD is selected");
   
    help.switchWindow();
    String url = Base.driver.getCurrentUrl();
    help.verifyUrl(url);
    help.retrieveText(RespiratoryLocators.doctorInfo);
    Screenshot.screenShotAndHighlight(Base.driver,RespiratoryLocators.doctorInfo,"Doctor's profile");
    //test.log(Status.PASS, "Doctor profile screenshot is captured");
    
}
public void respiratoryAll() 
{
    respOperation();
    doctorFilters();
    doctorSelect();
}
}
