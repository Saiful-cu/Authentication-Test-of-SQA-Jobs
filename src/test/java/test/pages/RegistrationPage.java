package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.DriverManager;

public class RegistrationPage extends DriverManager {
    private final By username = By.xpath("//input[@id='username']");
    private final By password = By.xpath("//input[@id='password']");
    private final By email = By.xpath("//input[@id='email']");
    private final By confirmPassword =By.xpath("//input[@id='conf-pass']");
    private final By submitButton = By.xpath("//button[contains(text(),'REGISTER NOW')]");
    private final By registrationPage= By.xpath("//h1[contains(text(),'Candidate Registration')]");
    private final By successMessage = By.xpath("//div[contains(text(),'A verification mail has been sent to your email address.')]");
    private final By loginPage = By.xpath("//div[contains(@class,'jet-auth-links__login')]");

    public void enterUsername (String u_name){
        WebElement usernameField = driver.findElement(username);
        usernameField.clear();
        usernameField.sendKeys(u_name);
    }
    public void enterPassword(String pass){
        WebElement passwordField = driver.findElement(password);
        passwordField.clear();
        passwordField.sendKeys(pass);
    }
    public void enterConfirmPassword(String pass){
        WebElement cPasswordField = driver.findElement(confirmPassword);
        cPasswordField.clear();
        cPasswordField.sendKeys(pass);
    }
    public void enterEmail(String str){
        WebElement emailField = driver.findElement(email);
        emailField.clear();
        emailField.sendKeys(str);
    }
    public void clickSubmit(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(submitButton));
        driver.findElement(submitButton).click();
    }
    public void registrations(String usernames, String emails ,String passwords , String cPasswords){
        enterUsername(usernames);
        enterEmail(emails);
        enterPassword(passwords);
        enterConfirmPassword(cPasswords);
        clickSubmit();
    }
    public boolean isDisplayed(){
       wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(registrationPage)));
       return driver.findElement(registrationPage).isDisplayed();
    }
    public boolean isRegistrationSuccessful() {
        wait.until(ExpectedConditions.elementToBeClickable(successMessage));
        return driver.findElement(successMessage).isDisplayed();
    }
    public void  clickLoginPage(){
        driver.findElement(loginPage).click();
    }
}
