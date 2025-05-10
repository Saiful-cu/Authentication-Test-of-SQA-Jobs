package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public abstract class BasePage extends DriverManager {
    private final By mainLocator;
    private final String pageName;

    public BasePage(By mainLocator, String pageName) {
        this.mainLocator = mainLocator;
        this.pageName = pageName;
    }

    public boolean waitForDisplayed() {
        try {
            WebElement mainElement = wait.until(ExpectedConditions.visibilityOfElementLocated(mainLocator));
            System.out.println("[INFO] " + pageName + " is displayed.");
            return mainElement.isDisplayed();
        } catch (TimeoutException e) {
            System.err.println("[ERROR] " + pageName + " is NOT displayed.");
            return false;
        }
    }

    protected WebElement find(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void clickOn(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    protected void type(By locator, String text) {
        WebElement element = find(locator);
        element.clear();
        element.sendKeys(text);
    }
}
