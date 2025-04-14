package pages;




import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import stepdefinition.Hooks;
import uistore.HomePageLocators;

import utils.Base;

import utils.WebDriverHelper;


public class HomePageActions {
   public WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);
    ExtentReports report;
    ExtentTest test;
  /**
     * Author: Vinny Claret.A
     * This method performs a search operation on the home page.
     * It clicks on the search icon, enters the search term "Respiratory", and
     * presses Enter.
     * It then verifies the page title, waits for an element to be clickable, clicks
     * it, and retrieves text from another element.
     *
     * @throws Exception If an error occurs during the search operation.
     */
    public void searchOperation(ExtentTest test, String string) {
        driverHelper.clickTheElement(HomePageLocators.search);
         Hooks.test.log(Status.PASS, "Clicked on Searchbar as expected");
        driverHelper.clickTheElement(HomePageLocators.searchbar);
        driverHelper.typeText(HomePageLocators.searchbar, string);
        Hooks.test.log(Status.PASS, "Entered on Respiratory as expected");

        driverHelper.pressEnter(HomePageLocators.searchbar);
        String title = Base.driver.getTitle();
        driverHelper.verifyTitle(title);

        driverHelper.waitForClickability(HomePageLocators.firstResp, 2);
        Hooks.test.log(Status.PASS, "Clicked on first Respiratory as expected");
        driverHelper.clickTheElement(HomePageLocators.firstResp);
        driverHelper.retrieveText(HomePageLocators.verifyResp);
    }

}
