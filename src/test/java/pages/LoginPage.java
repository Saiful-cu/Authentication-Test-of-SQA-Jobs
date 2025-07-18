package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import utils.BasePage;

public class LoginPage extends BasePage {
    private final By email = By.xpath("//input[@id='email']");
    private final By password = By.xpath("//input[@id='password']");
    private final By loginButton = By.xpath("//button[contains(text(),'Login')]");
    private final By errorMessage = By.xpath("//div[contains(@class ,'jet-form-builder-message--error')]");

    public LoginPage() {
        super(By.xpath("//div[@data-id ='b334dc7']"), "Login Page");
    }

    @Step("I enter the email address")
    public void enterEmail(String str) {
        type(email, str);
    }

    @Step("I enter the password")
    public void enterPassword(String pass) {
        type(password, pass);
    }

    @Step("I click on the login button")
    public void clickLoginButton() {
        clickOn(loginButton);
    }

    @Step("Show an error message unsuccessful login")
    public String getErrorMessage() {
        return find(errorMessage).getText();
    }
}
