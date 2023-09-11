Feature: Navigate to menu with parameters

  Background:
    Given The user is on the login page
    When  The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The welcome message contains "Welcome Teacher"


  Scenario: User navigates to Developers Menu
    And The user navigates to "All Posts" menu
    Then The should be able to see header as "Posts"

  Scenario: User navigates to My Account Menu
    And The user navigates to "My Account" menu
    Then The should be able to see header as "Dashboard"


#    create a Scenario Outline covering the above 2 scenarios
@smoke
  Scenario Outline: User navigate to each Menus
    And The user navigates to "<menuName>" menu
    Then The should be able to see header as "<header>"
    Examples:
      | menuName   | header    |
      | All Posts  | Posts     |
      | My Account | Dashboard |

#    Homework:
#  Create a new feature file named "NegativeLoginTestScenarioOutline"
#  Use scenario outline to enter invalid username and/or password and validate the different error messages