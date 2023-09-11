Feature: Login as different user

@rerun
  Scenario:Login as teacher with parameter
    Given The user is on the login page
    When  The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The user should be able to login
    Then The welcome message contains "Welcome Teacher"

@rerun
    Scenario: Login as student with parameter
      Given The user is on the login page
      When The user logs in using "emrah@gmail.com" and "emrah12345"
      Then The user should be able to login
      Then The welcome message contains "Welcome Emrah"
@rerun
  Scenario: Login as student
    Given The user is on the login page
    When The user logs in using "umut@gmail.com" and "Test12345!"
    Then The user should be able to login
    Then The welcome message contains "Welcome umut"
@rerun
  Scenario: Login as student 1
    Given The user is on the login page
    When The user logs in using "berlin@gmail.com" and "berlin"
    Then The user should be able to login
    Then The welcome message contains "Welcome Babamyra"