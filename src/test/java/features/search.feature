Feature: Job Search Functionality

  Background:
    Given I am on the job search page

  Scenario: Search jobs by keyword
    When I enter "QA Engineer" into the job search field
    And I click the search button
    Then I should see job results containing "QA Engineer"

  Scenario: Search jobs by keyword and location
    When I enter "Frontend Developer" into the job search field
    And I enter "Bangladesh" into the location field
    And I click the search button
    Then I should see job results related to "Frontend Developer" in "Bangladesh"

  Scenario: Search with no results
    When I enter "Astronaut Programmer" into the job search field
    And I click the search button
    Then I should see a message saying "No jobs found"

  Scenario: Search and filter by job type
    When I enter "Project Manager" into the job search field
    And I select "Remote" from the job type filter
    And I click the search button
    Then I should see only remote jobs for "Project Manager"
