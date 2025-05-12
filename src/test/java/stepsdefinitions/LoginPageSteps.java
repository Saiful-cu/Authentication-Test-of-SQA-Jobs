package stepsdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;


public class LoginPageSteps {
    LoginPage loginPage = new LoginPage();

    @Given("the user is on the Login page")
    public void theUserIsOnTheLoginPage() {
        Assert.assertTrue(loginPage.waitForDisplayed(), "Login page is not Displayed");
    }

    @When("the user clicks the Login button")
    public void theUserClicksTheLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("show a error message  {string}")
    public void showAErrorMessage(String error) {
        Assert.assertTrue(loginPage.getErrorMessage().contains(error), "The error message is not Displayed");
    }

    @When("the user enters a passwords {string}")
    public void theUserEntersAPasswords(String pass) {
        loginPage.enterPassword(pass);
    }

    @When("the user enters a username or email {string}")
    public void theUserEntersAUsernameOrEmail(String uname) {
        loginPage.enterEmail(uname);
    }
}
