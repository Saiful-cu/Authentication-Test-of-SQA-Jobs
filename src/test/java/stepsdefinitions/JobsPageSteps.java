package stepsdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.JobsPage;

public class JobsPageSteps {
    JobsPage jobsPage = new JobsPage();

    @Given("I am on the job search page")
    public void iAmOnTheJobSearchPage() {
        Assert.assertTrue(jobsPage.waitForDisplayed(), "Job page is not displayed");
    }

    @When("I enter {string} into the job search field")
    public void iEnterIntoTheJobSearchField(String jobName) {
        jobsPage.searchJobs(jobName);
    }

    @And("I click the search button")
    public void iClickTheSearchButton() {
        jobsPage.submitFilter();
    }

    @Then("I should see job results containing {string}")
    public void iShouldSeeJobResultsContaining(String JobsName) {
    }

    @And("I enter {string} into the location field")
    public void iEnterIntoTheLocationField(String location) {
        jobsPage.selectLocation(location);
    }

    @Then("I should see job results related to {string} in {string}")
    public void iShouldSeeJobResultsRelatedToIn(String jobName, String location) {
    }

    @Then("I should see a message saying {string}")
    public void iShouldSeeAMessageSaying(String arg0) {
    }

    @And("I select {string} from the job type filter")
    public void iSelectFromTheJobTypeFilter(String jobType) throws InterruptedException {
        jobsPage.selectVacancyType(jobType);
        Thread.sleep(10000);
    }

    @Then("I should see only {string} jobs")
    public void iShouldSeeOnlyRemoteJobsFor(String jobType) {
        Assert.assertTrue(jobsPage.filterDisplayedJobType(jobType));
    }
}
