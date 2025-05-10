package test.stepsdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LandingPageSteps {
    @Given("the user is on the landing page")
    public void theUserIsOnTheLandingPage() {
        Assert.assertTrue();
    }

    @When("the user clicks on the {string} button")
    public void theUserClicksOnTheButton(String arg0) {
    }

    @Then("a pop-up should appear")
    public void aPopUpShouldAppear() {
    }

    @When("the user selects {string}")
    public void theUserSelects(String arg0) {
    }


}
