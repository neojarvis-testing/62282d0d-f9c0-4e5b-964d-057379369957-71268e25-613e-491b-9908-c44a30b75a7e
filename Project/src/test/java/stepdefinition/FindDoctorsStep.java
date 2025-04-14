package stepdefinition;
<<<<<<< HEAD

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.HomePageActionsK;
import pages.FindADoctorActions;
import utils.WebDriverHelper;
import utils.Base;

public class FindDoctorsStep 
=======
 
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.HomePageActions;
import pages.FindADoctorActions;
import pages.HomePageActions;
import utils.WebDriverHelper;
import utils.Base;
 
public class FindDoctorsStep
>>>>>>> 941cef31d563fddeec24c18082170405827c723d
{
    WebDriverHelper helper = new WebDriverHelper(Base.driver);
    @When("the user clicks on the Find a Doctor under Our Doctors Section")
    public void the_user_clicks_on_the_find_a_doctor_under_our_doctors_section() {
<<<<<<< HEAD
       HomePageActionsK action = new HomePageActionsK();
=======
       HomePageActions action = new HomePageActions();
>>>>>>> 941cef31d563fddeec24c18082170405827c723d
       action.clickOnFindADoctor();
    }
    @When("the user searches for {string}")
    public void the_user_searches_for(String string) {
        FindADoctorActions actions = new FindADoctorActions();
        actions.searchBar();
    }
    @When("the user applies location, department, and language filters {string}")
    public void the_user_applies_location_department_and_language_filters(String string) {
        FindADoctorActions actions = new FindADoctorActions();
        actions.filterSection();
    }
    @Then("the filtered search results should be displayed")
    public void the_filtered_search_results_should_be_displayed() {
        FindADoctorActions actions = new FindADoctorActions();
        actions.clickFindADoctorLocators();
    }
<<<<<<< HEAD

}
=======
 
}
>>>>>>> 941cef31d563fddeec24c18082170405827c723d
