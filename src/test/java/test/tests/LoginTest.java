package test.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.LoginPage;
import utils.BaseTest;

public class LoginTest extends BaseTest {
    private final  String username = "Saifu001";
    private final String email = "mitid82@aurl.com";
    private final String password = "12345678";
    private final String cPassword = "12345678";

    @Test
    public void testLogin(){
        LoginPage loginPage = new LoginPage();
        Assert.assertTrue(loginPage.isDisplayed(), "Login page is not displayed");
        loginPage.login(email,password);
        AccountPage accountPage = new AccountPage();
        Assert.assertTrue(accountPage.isDisplayed(), "Login is not successful");
    }
}
