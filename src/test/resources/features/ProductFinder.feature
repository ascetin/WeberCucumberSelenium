Feature: Users should find the right product

  @findprodukt
  Scenario: find the right product
    Given the user is on the Product Finder page
    When user enters information to find the product
    Then The user selects the desired product according to the features entered.
    Then The user contacts Weber to get detailed information about the product which has chosen.