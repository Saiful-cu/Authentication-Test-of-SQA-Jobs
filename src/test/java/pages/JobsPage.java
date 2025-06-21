package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utils.BasePage;

import java.util.Objects;

public class JobsPage extends BasePage {
    private final By searchField = By.xpath("//input[@class='jet-search-filter__input']");
    private final By countryField = By.xpath("//select[@name='vacancy-country']");
    private final By submitField = By.xpath("//button[@class='apply-filters__button'  and text()='Search']");
    private final By categoryField = By.xpath("//select[@name='vacancy-category']");
    private final By hybridVacancy = By.xpath("//span[@class='jet-checkboxes-list__label' and text()='Hybrid']");
    private final By onsiteVacancy = By.xpath("//span[@class='jet-checkboxes-list__label' and text()='On Site']");
    private final By remoteVacancy = By.xpath("//span[@class='jet-checkboxes-list__label' and text()='Remote']");
    private final By fullTimeVacancy = By.xpath("//span[@class='jet-checkboxes-list__label' and text()='Full Time']");
    private final By internVacancy = By.xpath("//span[@class='jet-checkboxes-list__label' and text()='Intern']");
    private final By partTimeVacancy = By.xpath("//span[@class='jet-checkboxes-list__label' and text()='Part Time' and placeholder]");
    private final By deadLineFrom = By.xpath("//input[contains(@class='jet-date-range__from')]");

    private final By filteredRemoteVacancy = By.xpath("//span[@class='jet-listing-dynamic-terms__link' and text()='Remote']");

    public JobsPage() {
        super(By.xpath("//input[@class='jet-search-filter__input']"), "Job Page");
    }

    public void searchJobs(String jobName) {
        type(searchField, jobName);
    }

    public void selectLocation(String countryName) {
        Select country = new Select(driver.findElement(countryField));
        country.selectByValue(countryName);
    }

    public void selectJobCategory(String jobCategory) {
        Select category = new Select(driver.findElement(categoryField));
        category.selectByValue(jobCategory);
    }

    public void selectVacancyType(String vacancyType) {
        if (Objects.equals(vacancyType, "Hybrid")) {
            clickOn(hybridVacancy);
        } else if (Objects.equals(vacancyType, "On Site")) {
            clickOn(onsiteVacancy);
        } else {
            clickOn(remoteVacancy);
        }
    }

    public void selectVacancyStatus(String vacancyStatus) {
        if (Objects.equals(vacancyStatus, "Full Time")) {
            clickOn(fullTimeVacancy);
        } else if (Objects.equals(vacancyStatus, "Intern")) {
            clickOn(internVacancy);
        } else {
            clickOn(partTimeVacancy);
        }
    }

    public boolean filterDisplayedJobType(String result) {
        if (Objects.equals(result, "Remote")) {
            return driver.findElement(filteredRemoteVacancy).getText().equals("Remote");
        }
        return false;
    }

    public void submitFilter() {
        clickOn(submitField);
    }
}
