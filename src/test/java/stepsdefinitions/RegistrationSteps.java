package stepsdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.RegistrationPage;
import utils.DriverManager;

public class RegistrationSteps {

    RegistrationPage registrationPage = new RegistrationPage(DriverManager.getDriver());

    @Given("the user is on the Candidate Registration page")
    public void theUserIsRedirectedToThePage() {
        Assert.assertTrue(registrationPage.waitForDisplayed(), "Candidate Registration page is not displayed yet");
    }

    @When("the user enters a username {string}")
    public void theUserEntersAValidUsername(String username) {
        registrationPage.enterUsername(username);
    }

    @When("the user enters a email {string}")
    public void theUserEntersAValidEmail(String emails) {
        registrationPage.enterEmail(emails);
    }

    @When("the user enters a password {string}")
    public void theUserEntersAValidPassword(String password) {
        registrationPage.enterPassword(password);
    }

    @When("the user confirms the password {string}")
    public void theUserConfirmsThePassword(String cPassword) {
        registrationPage.enterConfirmPassword(cPassword);
    }

    @When("the user clicks the Register button")
    public void theUserClicksTheButton() {
        registrationPage.clickSubmitButton();
    }

    @Then("the user is redirected to the verification page")
    public void theUserIsRedirectedToTheVerificationPage() {
        Assert.assertTrue(registrationPage.isRegistrationSuccessful(), "Registration process is not complete properly");
    }

    @Then("show a error message {string}")
    public void showAErrorMessage(String message) {
        Assert.assertEquals(registrationPage.getErrorMessage(message), message, "The error-message is not displayed");

    }

    @Then("show a error message below email {string}")
    public void showAErrorMessageBelowEmail(String message) {
        Assert.assertEquals(registrationPage.emailErrors(), message, "The correct error-message is not displayed");
    }

    @Then("show a error message below username {string}")
    public void showAErrorMessageBelowUsername(String message) {
        Assert.assertEquals(registrationPage.usernameErrors(), message, "The correct error-message is not displayed");
    }

    @Then("show an error message below Password field {string}")
    public void showAnErrorMessageBelowPasswordField(String error) {
        Assert.assertTrue(registrationPage.passErrors().contains(error), "The error message is not properly displayed");
    }
}
