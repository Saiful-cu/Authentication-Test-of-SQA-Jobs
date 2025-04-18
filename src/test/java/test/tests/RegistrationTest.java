package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegistrationPage;

public class RegistrationTest extends utils.BaseTest {
    private final  String username = "Saifu001";
    private final String email = "mitid82@aurl.com";
    private final String password = "12345678";
    private final String cPassword = "12345678";

    @Test
    public void testRegistration(){
        RegistrationPage registrationPage = new RegistrationPage();
        Assert.assertTrue(registrationPage.isDisplayed(),"The registration page is not displayed");
        registrationPage.registrations(username,email,password,cPassword);
        Assert.assertTrue(registrationPage.isRegistrationSuccessful(),"The registration is not successful");
        registrationPage.clickLoginPage();
    }
}
