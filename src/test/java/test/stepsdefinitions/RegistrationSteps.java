package test.stepsdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps {


    @Then("the user is redirected to the {string} page")
    public void theUserIsRedirectedToThePage(String arg0) {
    }

    @When("the user enters a valid username {string}")
    public void theUserEntersAValidUsername(String arg0) {
    }

    @And("the user enters a valid email {string}")
    public void theUserEntersAValidEmail(String arg0) {
    }

    @And("the user enters a valid password {string}")
    public void theUserEntersAValidPassword(String arg0) {
    }

    @And("the user confirms the password {string}")
    public void theUserConfirmsThePassword(String arg0) {
    }

    @And("the user clicks the {string} button")
    public void theUserClicksTheButton(String arg0) {
    }

    @Then("the user is redirected to the verification page")
    public void theUserIsRedirectedToTheVerificationPage() {
    }
}
