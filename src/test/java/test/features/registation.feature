Feature: Registration

  Background:
    Given the user is on the landing page
    When the user clicks on the "Sign Up" button
    Then a pop-up should appear
    When the user selects "Candidate"
    Then the user is redirected to the "Candidate Registration" page

  Scenario: Registering a candidate with valid credentials
    When the user enters a valid username "saiful02"
    And the user enters a valid email "saiful@email.com"
    And the user enters a valid password "password"
    And the user confirms the password "password"
    And the user clicks the "Register" button
    Then the user is redirected to the verification page
