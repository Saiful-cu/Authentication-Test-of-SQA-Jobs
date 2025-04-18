package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.DriverManager;

public class LandingPage extends DriverManager {
    private final By candidate = By.xpath("//a[@href='https://labsqajobs.qaharbor.com/candidate-registration/']/span");
    private final By singUp = By.xpath("//a[contains(@class,'menu-item-link-top')]/span[contains(text(),'Sign Up')]");
    public void clickCandidateLink(){
        driver.findElement(singUp).click();
        WebElement element = driver.findElement(candidate);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

}
