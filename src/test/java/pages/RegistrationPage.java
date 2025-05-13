package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BasePage;

import java.util.List;
import java.util.Objects;

public class RegistrationPage extends BasePage {
    private final By username = By.xpath("//input[@id='username']");
    private final By password = By.xpath("//input[@id='password']");
    private final By email = By.xpath("//input[@id='email']");
    private final By confirmPassword = By.xpath("//input[@id='conf-pass']");
    private final By usernameError = By.xpath("//div[@id='username__error']");
    private final By errorMessage = By.xpath("//div[@class='error-message']");
    private final By emailError = By.xpath("//div[@id='email__error']");
    private final By passwordError = By.xpath("//div[@id='password__error']");
    private final By conPasswordError = By.xpath("//div[@id='conf-pass__error']");
    private final By submitButton = By.xpath("//button[contains(text(),'REGISTER NOW')]");
    private final By registrationPage = By.xpath("//h1[contains(text(),'Candidate Registration')]");
    private final By successMessage = By.xpath("//div[contains(text(),'A verification mail has been sent to your email address.')]");
    private final By loginPage = By.xpath("//div[contains(@class,'jet-auth-links__login')]");
    private final WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        super(By.xpath("//div[@data-id='b3b9130']"), "Registration Page");
        this.driver = driver;

    }

    @Step("I enter the username ")
    public void enterUsername(String u_name) {
        type(username, u_name);
    }

    @Step("I enter password")
    public void enterPassword(String pass) {
        type(password, pass);
    }

    public void enterConfirmPassword(String pass) {
        type(confirmPassword, pass);
    }

    public void enterEmail(String emails) {
        type(email, emails);
    }

    public void clickSubmitButton() {
        clickOn(submitButton);
    }

    public boolean isRegistrationSuccessful() {
        WebElement element = find(successMessage);
        return element.isDisplayed();
    }

    public String getErrorMessage(String error) {
        List<String> errorList = getTextList(errorMessage);
        int found = 0;
        for (String errorMessage : errorList) {
            if (Objects.equals(errorMessage, error)) {
                found = 1;
                break;
            }
        }
        if (found == 1) {
            return error;
        } else {
            return "No Error";
        }
    }

    public String usernameErrors() {
        return find(usernameError).getText();
    }

    public String emailErrors() {
        return find(emailError).getText();
    }

    public String passErrors() {
        return find(passwordError).getText();
    }

    public String confPassErrors() {
        return find(conPasswordError).getText();
    }

    public void clickLoginPage() {
        driver.findElement(loginPage).click();
    }
}
