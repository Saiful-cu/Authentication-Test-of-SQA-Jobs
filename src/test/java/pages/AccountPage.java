package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.DriverManager;


public class AccountPage extends DriverManager {
    private final By accountPage = By.xpath("//a[@href='https://labsqajobs.qaharbor.com/account/' and contains(text(),'My Profile')]");

    public boolean isDisplayed() {
        wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(accountPage)));
        return driver.findElement(accountPage).isDisplayed();
    }
}
