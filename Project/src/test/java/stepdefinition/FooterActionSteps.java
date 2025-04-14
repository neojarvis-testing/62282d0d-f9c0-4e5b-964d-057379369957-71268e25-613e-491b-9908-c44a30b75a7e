package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePageActions;

public class FooterActionSteps {

    HomePageActions homepageActions = new HomePageActions();

   

    @When("I click on the Appointments Access link")
    public void i_click_on_the_appointments_access_link() {
        homepageActions.clickAppointmentsAccess();
    }

    @Then("I should be redirected to the Appointments Access page")
    public void i_should_be_redirected_to_the_appointments_access_page() {
        
    }

    @When("I click on the Accepted Insurance link")
    public void i_click_on_the_accepted_insurance_link() {
        homepageActions.clickAcceptedInsurance();
    }

    @Then("I should be redirected to the Accepted Insurance page")
    public void i_should_be_redirected_to_the_accepted_insurance_page() {
        
    }

    @When("I click on the Events Calendar link")
    public void i_click_on_the_events_calendar_link() {
        homepageActions.clickEventsCalender();
    }

    @Then("I should be redirected to the Events Calendar page")
    public void i_should_be_redirected_to_the_events_calendar_page() {
        
    }

    @When("I click on the Financial Assistance link")
    public void i_click_on_the_financial_assistance_link() {
        homepageActions.clickFinancialAssistance();
    }

    @Then("I should be redirected to the Financial Assistance page")
    public void i_should_be_redirected_to_the_financial_assistance_page() {
        
    }

    @When("I click on the Give to Cleveland Clinic link")
    public void i_click_on_the_give_to_cleveland_clinic_link() {
        homepageActions.clickGiveCleveland();
    }

    @Then("I should be redirected to the Give to Cleveland Clinic page")
    public void i_should_be_redirected_to_the_give_to_cleveland_clinic_page() {
        
    }

    @When("I click on the Pay Bill link")
    public void i_click_on_the_pay_bill_link() {
        homepageActions.clickPayBill();
    }

    @Then("I should be redirected to the Pay Bill page")
    public void i_should_be_redirected_to_the_pay_bill_page() {
        
    }

    @When("I click on the Price Transparency link")
    public void i_click_on_the_price_transparency_link() {
        homepageActions.clickPriceTransparency();
    }

    @Then("I should be redirected to the Price Transparency page")
    public void i_should_be_redirected_to_the_price_transparency_page() {
        
    }

    @When("I click on the Refer Patient link")
    public void i_click_on_the_refer_patient_link() {
        homepageActions.clickReferPatient();
    }

    @Then("I should be redirected to the Refer Patient page")
    public void i_should_be_redirected_to_the_refer_patient_page() {
        
    }

    @When("I click on the Phone Directory link")
    public void i_click_on_the_phone_directory_link() {
        homepageActions.clickPhoneDirectory();
    }

    @Then("I should be redirected to the Phone Directory page")
    public void i_should_be_redirected_to_the_phone_directory_page() {
        
    }

    @When("I click on the Virtual Opinions link")
    public void i_click_on_the_virtual_opinions_link() {
        homepageActions.clickVirtualOpinions();
    }

    @Then("I should be redirected to the Virtual Opinions page")
    public void i_should_be_redirected_to_the_virtual_opinions_page() {
        
    }

    @When("I click on the Virtual Visits link")
    public void i_click_on_the_virtual_visits_link() {
        homepageActions.clickVirtualVisits();
    }

    @Then("I should be redirected to the Virtual Visits page")
    public void i_should_be_redirected_to_the_virtual_visits_page() {
        
    }
}
