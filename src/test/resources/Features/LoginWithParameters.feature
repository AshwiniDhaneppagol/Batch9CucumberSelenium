Feature: Login as different user


  Scenario:Login as teacher with parameter
    Given The user is on the login page
    When  The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The user should be able to login
    Then The welcome message contains "Welcome Teacher"


    Scenario: Login as student with parameter
      Given The user is on the login page
      When The user logs in using "emrah@gmail.com" and "emrah12345"
      Then The user should be able to login
      Then The welcome message contains "Welcome Emrah"
