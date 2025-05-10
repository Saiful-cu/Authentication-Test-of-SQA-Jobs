package stepsdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.RegistrationPage;

public class RegistrationSteps {

    RegistrationPage registrationPage = new RegistrationPage();

    @Then("the user is redirected to the Candidate Registration page")
    public void theUserIsRedirectedToThePage() {
        Assert.assertTrue(registrationPage.waitForDisplayed(), "Registration page is not displayed yet");
    }

    @When("the user enters a valid username {string}")
    public void theUserEntersAValidUsername(String username) {
        registrationPage.enterUsername(username);
    }

    @And("the user enters a valid email {string}")
    public void theUserEntersAValidEmail(String emails) {
        registrationPage.enterEmail(emails);
    }

    @And("the user enters a valid password {string}")
    public void theUserEntersAValidPassword(String password) {
        registrationPage.enterPassword(password);
    }

    @And("the user confirms the password {string}")
    public void theUserConfirmsThePassword(String cPassword) {
        registrationPage.enterConfirmPassword(cPassword);
    }

    @And("the user clicks the Register button")
    public void theUserClicksTheButton() {
        registrationPage.clickSubmitButton();
    }

    @Then("the user is redirected to the verification page")
    public void theUserIsRedirectedToTheVerificationPage() {
        Assert.assertTrue(registrationPage.isRegistrationSuccessful(), "Registration process is not complete properly");
    }
}
