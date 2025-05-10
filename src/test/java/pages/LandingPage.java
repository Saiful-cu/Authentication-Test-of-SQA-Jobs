package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BasePage;

public class LandingPage extends BasePage {
    private final By candidate = By.xpath("//a[@href='https://labsqajobs.qaharbor.com/candidate-registration/']/span");
    private final By singUp = By.xpath("//a[contains(@class,'menu-item-link-top')]/span[contains(text(),'Sign Up')]");

    public LandingPage() {
        super(By.xpath("//div[@data-id='b0b9d62']"), "Landing page");
    }

    public void clickOnSignup() {
        clickOn(singUp);
    }

    public void selectCandidate() {
        clickOn(candidate);
    }

    public boolean isPopUpDisplayed() {
        WebElement popUp = find(candidate);
        return popUp.isDisplayed();
    }

}
