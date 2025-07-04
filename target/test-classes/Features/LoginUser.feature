Feature: Login and Delete Account on AutomationExercise website

  @Runthis
  Scenario: Login with valid credentials and delete the account
    Given I navigate to url "http://automationexercise.com"
    Then I should see the home page is visible successfully
    When I click on Signup-Login button
    Then I should see New User Signup! is visible
    When I enter email as "12345testuser8@example.com" and password as "Password123"
    And I click on "login" button
    Then I should see Logged in as "123TestUser" is visible
