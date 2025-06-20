package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utils.BasePage;

public class JobsPage extends BasePage {
    private final By searchField = By.xpath("//input[@class='jet-search-filter__input']");
    private final By countryField = By.xpath("//select[@name='vacancy-country']");
    private final By submitField = By.xpath("//button[@class='apply-filters__button'  and text()='Search']");
    private final By categoryField = By.xpath("//select[@name='vacancy-category']");

    public JobsPage() {
        super(By.linkText("https://labsqajobs.qaharbor.com/find-jobs/"), "Job Page");
    }

    public void searchJobs(String jobName) {
        type(searchField, jobName);
    }

    public void selectLocation(String countryName) {
        Select country = new Select(driver.findElement(countryField));
        country.selectByValue(countryName);
    }

    public void selectJobCategory(String jobCategory) {
        Select category = new Select(driver.findElement(countryField));
        category.selectByValue(jobCategory);
    }
    public void selectVacancyType()

    public void submitFilter() {
        clickOn(submitField);
    }
}
