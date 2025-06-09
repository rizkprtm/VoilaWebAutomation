@LoginScenario
Feature: Login To Voila Website

  Background: Verify User in the Voila HomePage
    Given User already in the Voila website

  @Positive-TC-1
  Scenario: Login With Valid Data
    And User click sign in from homepage
    When User input valid email as "mrzkyprtm69@gmail.com"
    And User input valid password as "TestVoila@Rizki123"
    Then User click sign in
    And Navigate to profile page
    Then User logout from Voila dashboard

  @Negative-TC-2
  Scenario Outline: Login With Invalid Data
    And User click sign in from homepage
    When User input "<email>" as email "<password>" as password
    Then User click sign in
    And User get "<errorMsg>" as error message

    Examples: Invalid Credentials Data
      | email                 | password       | errorMsg                                                    |
      | mrzkyprtm69@gmail.com | password_salah | Your account ID or password is incorrect. Please try again. |