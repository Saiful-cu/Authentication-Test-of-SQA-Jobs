package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.DriverManager;

public class LoginPage extends DriverManager {
    private final By email = By.xpath("//input[@id='email']");
    private final By password = By.xpath("//input[@id='password']");
    private final By loginButton = By.xpath("//button[contains(text(),'Login')]");

    public void enterEmail(String str){
        WebElement emailField = driver.findElement(email);
        emailField.clear();
        emailField.sendKeys(str);
    }
    public void enterPassword(String pass){
        WebElement passwordField = driver.findElement(password);
        passwordField.clear();
        passwordField.sendKeys(pass);
    }
    public void clickSubmit(){
        WebElement element = driver.findElement(loginButton);
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
        element.click();
    }
    public void login(String emails , String passwords){
        enterEmail(emails);
        enterPassword(passwords);
        clickSubmit();
    }
    public boolean isDisplayed(){
       wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(loginButton));
        return  driver.findElement(loginButton).isDisplayed();
    }

}
