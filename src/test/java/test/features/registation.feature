Feature: Registration
  Background:
    Given User must be on Landing page
    When User click on signup
    Then A pop up appear
    When User click on candidate
    Then User redirected to the "candidate registration" page

    Scenario: User must be registered using valid credentials
      When user enter the "username"
      And  user enter the "email address"
      And user enter the "password"
      And user enter the "confirm password"
      And user click on Register Button
      Then user redirected to the varification page