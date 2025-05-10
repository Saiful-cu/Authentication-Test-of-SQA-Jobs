package test.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.pages.AccountPage;
import test.pages.LoginPage;
import test.pages.RegistrationPage;
import test.utils.BaseTest;

public class LoginTest extends BaseTest {
    private final String email = System.getProperty("email");
    private final String password = System.getProperty("password");

    @Test
    public void testLogin(){
        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.clickLoginPage();
        LoginPage loginPage = new LoginPage();
        Assert.assertTrue(loginPage.isDisplayed(), "Login page is not displayed");
        loginPage.login(email,password);
        AccountPage accountPage = new AccountPage();
        Assert.assertTrue(accountPage.isDisplayed(), "Login is not successful");
    }
}
