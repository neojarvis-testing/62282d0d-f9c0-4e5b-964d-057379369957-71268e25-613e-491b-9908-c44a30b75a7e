package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePageActions;

public class SocialLinkSteps {

    HomePageActions homepageActions = new HomePageActions();

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        
    }

    @When("I click on the Facebook link")
    public void i_click_on_the_facebook_link() {
        homepageActions.clickFaceBook();
    }

    @Then("I should be redirected to the Facebook page")
    public void i_should_be_redirected_to_the_facebook_page() {
    
    }

    @When("I click on the Twitter link")
    public void i_click_on_the_twitter_link() {
        homepageActions.clickTwitter();
    }

    @Then("I should be redirected to the Twitter page")
    public void i_should_be_redirected_to_the_twitter_page() {
    
    }

    @When("I click on the YouTube link")
    public void i_click_on_the_youtube_link() {
        homepageActions.clickYoutube();
    }

    @Then("I should be redirected to the YouTube page")
    public void i_should_be_redirected_to_the_youtube_page() {
        
    }

    @When("I click on the Instagram link")
    public void i_click_on_the_instagram_link() {
        homepageActions.clickInstagram();
    }

    @Then("I should be redirected to the Instagram page")
    public void i_should_be_redirected_to_the_instagram_page() {
       
    }

    @When("I click on the LinkedIn link")
    public void i_click_on_the_linkedin_link() {
        homepageActions.clickLinkedIn();
    }

    @Then("I should be redirected to the LinkedIn page")
    public void i_should_be_redirected_to_the_linkedin_page() {
       
    }

    @When("I click on the Pinterest link")
    public void i_click_on_the_pinterest_link() {
        homepageActions.clickPinterest();
    }

    @Then("I should be redirected to the Pinterest page")
    public void i_should_be_redirected_to_the_pinterest_page() {
       
    }

    @When("I click on the Snapchat link")
    public void i_click_on_the_snapchat_link() {
        homepageActions.clickSnapchat();
    }

    @Then("I should be redirected to the Snapchat page")
    public void i_should_be_redirected_to_the_snapchat_page() {
       
    }
}
