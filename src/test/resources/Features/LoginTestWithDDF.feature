Feature: Data Driven Testing In Cucumber

  @ddf
  Scenario Outline: Login with Excel File Info
    Given The user is on the login page
    When  The user access "<Sheet Name>" and enters username and password with the row number <Username and Password>
    Then  The welcome message contains in excel file <Row Number For Name>
    Then  The user verify that company name <Row Number for Company>

    Examples:
      | Sheet Name | Username and Password | Row Number For Name | Row Number for Company |
      | Login Test | 0                     | 0                   | 0                      |
      | Login Test | 1                     | 1                   | 1                      |
      #| Login Test | 2                     | 2                   | 2                      |
      #| Login Test | 3                     | 3                   | 3                      |
      #| Login Test | 4                     | 4                   | 4                      |
      #| Login Test | 5                     | 5                   | 5                      |



