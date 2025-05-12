Feature: Candidate Registration

  Background:
    Given the user is on the Candidate Registration page

  @registration @negative @empty
  Scenario:Registration with empty credentials
    When the user clicks the Register button
    Then show a error message "Please fill out this field."


  Scenario:Registration with invalid email format
    When the user enters a username "saiful02"
    And the user enters a email "saiful.com"
    Then show a error message below email "Please enter your valid email address."

  @registration @negative @usedEmail
  Scenario:Registration with an already used email address
    When the user enters a username "saiful02"
    And the user enters a email "saiful@email.com"
    Then show a error message below email "Use a different Email address or reset your account password. We already have an account with this email address."

  @registration @negative @usedUsername
  Scenario:Registration with an already used username
    When the user enters a username "saiful02"
    Then show a error message below username "Please use a different username. It's not available."

  @registration @negative @invalidPassword
  Scenario: Registration with invalid password format
    When the user enters a username "saiful0230"
    And the user enters a email "saiful21@email.com"
    And the user enters a password "passwod"
    Then show an error message below Password field "Please increase the password length to at least 8 characters"

  @registration @negative @differntPassword
  Scenario: Registration with invalid password format
    When the user enters a username "saiful0230"
    And the user enters a email "saiful21@email.com"
    And the user enters a password "password"
    And the user confirms the password "password"
    Then show an error message below Password field "Password don't match"

  @registration @positive
  Scenario: Registering a candidate with valid credentials
    When the user enters a username "saiful0230"
    And the user enters a email "saiful21@email.com"
    And the user enters a password "password"
    And the user confirms the password "password"
    When the user clicks the Register button
    Then the user is redirected to the verification page
