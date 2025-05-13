package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BasePage;

public class LandingPage extends BasePage {
    private final By candidate = By.xpath("//a[@href='https://labsqajobs.qaharbor.com/candidate-registration/']/span");
    private final By singUp = By.xpath("//a[contains(@class,'menu-item-link-top')]/span[contains(text(),'Sign Up')]");

    public LandingPage() {
        super(By.xpath("//div[@data-id='b0b9d62']"), "Landing page");
    }

    @Step("I click on the signup button")
    public void clickOnSignup() {
        clickOn(singUp);
    }

    @Step("I select the candidate")
    public void selectCandidate() {
        clickOn(candidate);
    }

    @Step("A pop up displayed after clicking signup")
    public boolean isPopUpDisplayed() {
        WebElement popUp = find(candidate);
        return popUp.isDisplayed();
    }
}
