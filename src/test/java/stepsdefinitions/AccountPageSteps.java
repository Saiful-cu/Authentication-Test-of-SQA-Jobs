package stepsdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.AccountPage;

public class AccountPageSteps {
    @Then("the user is redirected to the User Account")
    public void theUserIsRedirectedToTheAccountPage() {
        AccountPage accountPage = new AccountPage();
        Assert.assertTrue(accountPage.waitForDisplayed(), "Account page is not displayed");
    }
}
