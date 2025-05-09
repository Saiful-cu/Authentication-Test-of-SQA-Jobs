package test.stepsdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.LandingPage;
import pages.SignUpPopup;
import pages.CandidateRegistrationPage;
import pages.VerificationPage;
import utils.DriverManager;

public class RegistrationSteps {


    WebDriver driver = DriverManager.getDriver();
    LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
    SignUpPopup signUpPopup = PageFactory.initElements(driver, SignUpPopup.class);
    CandidateRegistrationPage registrationPage = PageFactory.initElements(driver, CandidateRegistrationPage.class);
    VerificationPage verificationPage = PageFactory.initElements(driver, VerificationPage.class);

    @Given("the user is on the landing page")
    public void the_user_is_on_the_landing_page() {
        driver.get("https://your-app-url.com");
    }

    @When("the user clicks on the {string} button")
    public void the_user_clicks_on_the_button(String buttonName) {
        if (buttonName.equalsIgnoreCase("Sign Up")) {
            landingPage.clickSignUp();
        } else if (buttonName.equalsIgnoreCase("Register")) {
            registrationPage.clickRegisterButton();
        }
    }

    @Then("a pop-up should appear")
    public void a_pop_up_should_appear() {
        signUpPopup.waitForPopup();
    }

    @When("the user selects {string}")
    public void the_user_selects(String option) {
        if (option.equalsIgnoreCase("Candidate")) {
            signUpPopup.selectCandidateOption();
        }
    }

    @Then("the user is redirected to the {string} page")
    public void the_user_is_redirected_to_the_page(String pageName) {
        switch (pageName.toLowerCase()) {
            case "candidate registration":
                registrationPage.verifyOnRegistrationPage();
                break;
            case "verification":
                verificationPage.verifyOnVerificationPage();
                break;
        }
    }

    @When("the user enters a valid {string}")
    public void the_user_enters_a_valid(String field) {
        switch (field.toLowerCase()) {
            case "username":
                registrationPage.enterUsername("testuser");
                break;
            case "email address":
                registrationPage.enterEmail("testuser@example.com");
                break;
            case "password":
                registrationPage.enterPassword("Password123!");
                break;
        }
    }

    @When("the user confirms the password")
    public void the_user_confirms_the_password() {
        registrationPage.enterConfirmPassword("Password123!");
    }
}
