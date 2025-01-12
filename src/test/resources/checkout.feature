Feature: Checkout

  @positive-test
  Scenario: checkout single item
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    And user click login button
    And user is on homepage
    And user click on product with the name "Sauce Labs Backpack"
    And user is on detail product page
    And user click add to cart button
    And user go to cart page
    And cart should contain product "Sauce Labs Backpack"
    When user click checkout
    And user fill shipping information
    And user click continue button
    And user on checkout overview page
    And total price is correct
    And click finish button
    Then checkout complete