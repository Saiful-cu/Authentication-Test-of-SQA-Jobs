package stepsdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LandingPage;

public class LandingPageSteps {
    LandingPage landingPage = new LandingPage();

    @Given("the user is on the landing page")
    public void theUserIsOnTheLandingPage() {
        Assert.assertTrue(landingPage.waitForDisplayed(), "The user is not on the Landing page");
    }

    @When("the user clicks on the Sign Up button")
    public void theUserClicksOnTheButton() {
        landingPage.clickOnSignup();
    }

    @Then("a pop-up should appear")
    public void aPopUpShouldAppear() {
        Assert.assertTrue(landingPage.isPopUpDisplayed(), " The popup is not displayed");
    }

    @When("the user selects Candidate")
    public void theUserSelectsCandidate() {
        landingPage.selectCandidate();
    }


}
