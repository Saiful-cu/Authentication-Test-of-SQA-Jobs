Feature: Candidate Registration

  Background:
    Given the user is on the Login page

  @login @negative @empty
  Scenario:Login with empty credentials
    When the user clicks the Login button
    Then show a error message "Please write your registered email address."
    And show an error message below Password field "Please fill out with your password."

  @login @negative @unRegisteredEmail/Username
  Scenario:Login with an unRegistered email address/ username
    When the user enters a username or email "saiful3202"
    And the user enters a passwords "passwrod"
    And the user clicks the Login button
    Then show a error message  "Error: The username saiful3202 is not registered on this site."

  @login @negative @wrongPassword
  Scenario:Login with wrong password
    When the user enters a username or email "saiful0230"
    And the user enters a passwords "passwrod"
    And the user clicks the Login button
    Then show a error message  "Error: The password you entered for the username saiful0230 is incorrect."

  @login @positive
  Scenario: Login a candidate with valid credentials
    When the user enters a username or email "saiful0230"
    And the user enters a passwords "password"
    And the user clicks the Login button
    Then the user is redirected to the User Account
