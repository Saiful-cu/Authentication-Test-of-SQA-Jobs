Feature: Candidate Registration

  Background:
    Given the user is on the Candidate Registration page

  Scenario:Registering a candidate with empty credentials
    When the user clicks the Register button
    Then show a error message "Please fill out this field"

  Scenario: Registering a candidate with valid credentials
    When the user enters a valid username "saiful02"
    And the user enters a valid email "saiful@email.com"
    And the user enters a valid password "password"
    And the user confirms the password "password"
    And the user clicks the Register button
    Then the user is redirected to the verification page
