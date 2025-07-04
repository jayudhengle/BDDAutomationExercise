Feature: Register User on AutomationExercise website


  Scenario: Register a new user successfully
    Given I navigate to url "http://automationexercise.com"
    Then I should see the home page is visible successfully
    When I click on Signup-Login button
    Then I should see New User Signup! is visible
    When I enter name as "12325TestUser9" and email as "12345testuser9@example.com"
    And I click on Signup button
    When I fill account details	
      | title | name        | password    | date of birth |
      | Mr    | 123TestUser  | Password123 | 10 May 1990   |
    And I fill personal details with first name "Test", last name "User", company "TestCorp", address "123 Test Street", address2 "Suite 456", country "India", state "Maharashtra", city "Pune", zipcode "411001", and mobile number "9876543210"
    And I click on Create Account button
    Then I should see ACCOUNT CREATED! is visible
    When I click on Continue button
    Then I should see Logged in as "123TestUser" is visible
 
