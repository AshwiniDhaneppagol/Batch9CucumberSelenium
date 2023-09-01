Feature:  Eurotech Login Tests

  Scenario: Login As Teacher
    Given The user is on the login page
    When The user enters teacher credentials
    Then The user should be able to login

  Scenario: Login As Student
    Given The user is on the login page
    When The user enters student credentials
    Then The user should be able to login