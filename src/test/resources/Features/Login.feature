@login
Feature:  Eurotech Login Tests

  # Agile story :As a user I should be able to login with valid credentials.

  @Teacher  @smoke
  Scenario: Login As Teacher
    Given The user is on the login page
    When The user enters teacher credentials
    Then The user should be able to login

  @Student   @smoke
  Scenario: Login As Student
    #Pre condition
    Given The user is on the login page

    #when is representing action time
    When The user enters student credentials

    #Then is our verification part
    Then The user should be able to login

    @Developer @smoke
    Scenario: Login as Developer
      Given The user is on the login page
      When The user enters developer credentials
      Then The user should be able to login

                #Scenario 1:
                #Login as Teacher
                #At first get the text of welcome
                #Then go to Developers menu and get the text of Developers

                #Scenario 2:
                #Login as Teacher
                #Get the text of welcome
                #Then go to All Posts menu and get the text of Posts
                #Then go to All Posts menu and get the t of Posts

                #Scenario 3:
                #Login as Teacher
                #Get the text of welcome
                #Then go to My Account menu and get the text of Dashboard

                #Create new feature file which is navigateMenu
                #Write scenarios
                #Create step definitions NavigateMenuStepDef
                #Implement step definitions by adding printLn






