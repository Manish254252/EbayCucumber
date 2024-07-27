Feature: Verify order process
  Scenario: Order price Checking
    Given User is on Home Page
    When User Search for "Laptop"
    And Clicks on Search Button
    Then List of searched product should be displayed
    When User adds some product to cart
    Then User clicks on addToCart Logo
    Then Verify items price plus tax is equals to totalPrice