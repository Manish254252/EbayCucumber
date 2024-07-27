Feature: Sign up in the Website and login

  Scenario: User signing up
    Given user is on the landing page
    When User clicks on SignUp Link
    Then verify user is on SignUpPage
    Then user Fills all necessary values for SignUp
    Then User login with the credentials

  Scenario: Create new Checking Account
    Given User is on the HomePage
    When User clicks on Checking
    And User selects new Checking
    Then User fills details for creating new checking account


  Scenario: Create new Savings Account
    Given User is on the HomePage
    When User clicks on Savings
    And User selects new Savings
    Then User fills details for creating new Savings account
    And Print account details

    Scenario: Transfer Amount from one account to other
      
      Given User is on the HomePage
      When  User clicks on transfer menu
      Then User Selects from account
      And User selects to account
      And user gives amount "12345"
      And verify that the amount transferred successfully
      And Print account details

