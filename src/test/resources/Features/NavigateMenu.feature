
Feature: Navigate Menu



  Scenario: Navigate Developers Menu
    Given The user is on the login page
    When The user enters teacher credentials
    Then The user should be able to see welcome message
    And  The user navigates to Developer menu
    Then The user able to see developer title
@wip
    Scenario: Navigate All Posts Menu
      Given The user is on the login page
      When  The user enters teacher credentials
      Then  The user should be able to see welcome message
      And   The user navigates to All Posts menu
      Then  The user able to see All Posts title

@smoke @test
      Scenario: Navigate My Account Menu
        Given The user is on the login page
        When The user enters teacher credentials
        Then The user should be able to see welcome message
        And   The user navigates to My Account menu
        Then  The user able to see  Dashboard title


