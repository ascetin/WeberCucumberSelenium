Feature: Users should create a new user-profile

  @createNewUser
  Scenario: create a new user profile
    Given the user is on the register page
    When the user enters the information of new user profile
    Then the user create a new user profile