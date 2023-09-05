Feature: Navigate to menu with parameters

  Scenario: User navigates to Developers Menu
    Given The user is on the login page
    When  The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The welcome message contains "Welcome Teacher"
    And The user navigates to "All Posts" menu
    Then The should be able to see header as "Posts"

  Scenario: User navigates to My Account Menu
    Given The user is on the login page
    When  The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The welcome message contains "Welcome Teacher"
    And The user navigates to "My Account" menu
    Then The should be able to see header as "Dashboard"