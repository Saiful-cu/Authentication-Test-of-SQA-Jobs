package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegistrationPage;

public class RegistrationTest {
    private final String username = System.getProperty("username");
    private final String email = System.getProperty("email");
    private final String password = System.getProperty("password");
    private final String cPassword = password;

    @Test
    public void testRegistration() {
        RegistrationPage registrationPage = new RegistrationPage();
        Assert.assertTrue(registrationPage.isDisplayed(), "The registration page is not displayed");
        registrationPage.registrations(username, email, password, cPassword);
        Assert.assertTrue(registrationPage.isRegistrationSuccessful(), "The registration is not successful");
    }
}
