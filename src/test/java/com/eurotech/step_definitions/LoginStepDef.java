package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.LoginPage;
import com.eurotech.utilities.BrowserUtils;
import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import com.eurotech.utilities.ExcelUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class LoginStepDef {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    ExcelUtil excelUtil = new ExcelUtil("src/test/resources/EurotechTest.xlsx",ConfigurationReader.get("sheetName"));
    List<Map<String, String>> dataList = excelUtil.getDataList();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {

        Driver.get().get(ConfigurationReader.get("url"));

    }
    @When("The user enters teacher credentials")
    public void the_user_enters_teacher_credentials() {

        loginPage.loginWithTeacher();

    }
    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {

        Assert.assertTrue(dashboardPage.welcomeMessage.getText().contains("Welcome"));
    }

    @When("The user enters student credentials")
    public void theUserEntersStudentCredentials() {

        loginPage.loginWithStudent();

    }
    @When("The user enters developer credentials")
    public void the_user_enters_developer_credentials() {
        System.out.println("I enter developer username and password and click login button");
        loginPage.loginWithDeveloper();
    }

    @When("The user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String username, String password) {

        System.out.println("username = " + username);
        System.out.println("password = " + password);
        loginPage.login(username, password);


    }

    @Then("The welcome message contains {string}")
    public void theWelcomeMessageContains(String welcomeMessage) {
       // Assert.assertTrue(dashboardPage.welcomeMessage.getText().contains(welcomeMessage));
        Assert.assertEquals(welcomeMessage,dashboardPage.welcomeMessage.getText());
    }

    @When("The user logs in using following credentials")
    public void the_user_logs_in_using_following_credentials(Map<String, String> userCredentials) {
        System.out.println("User Credentials: " + userCredentials);

        String username = userCredentials.get("username");
        String password = userCredentials.get("password");

        loginPage.login(username, password);
    }

    @Then("The warning message contains {string}")
    public void theWarningMessageContains(String expectedErrorMessage) {

        String actualWarningMessage = loginPage.getWarningMessage(expectedErrorMessage);
        System.out.println("actualWarningMessage = " + actualWarningMessage);
        Assert.assertEquals(expectedErrorMessage,actualWarningMessage);
    }


    @When("The user access {string} and enters username and password with the row number {int}")
    public void the_user_access_and_enters_username_and_password_with_the_row_number(String sheetName, Integer rowNumber) {


        System.out.println("dataList = " + dataList);
        //get Gulcan's username
        System.out.println("dataList.get(2).get(\"Username\") = " + dataList.get(2).get("Username"));
        //get Seyit's title
        System.out.println("dataList.get(4).get(\"Title\") = " + dataList.get(4).get("Title"));
        //get Nihan's company
        System.out.println("dataList.get(4).get(\"Company\") = " + dataList.get(3).get("Company"));

        loginPage.login(dataList.get(rowNumber).get("Username"),dataList.get(rowNumber).get("Password"));
        BrowserUtils.waitFor(2);

    }
    @Then("The welcome message contains in excel file {int}")
    public void the_welcome_message_contains_in_excel_file(Integer rowNumberForName) {

        String actualMessage= dashboardPage.welcomeMessage.getText();

        //get Gulcan's name
        System.out.println("dataList.get(2).get(\"Name\") = " + dataList.get(2).get("Name"));
        Assert.assertTrue(actualMessage.contains(dataList.get(rowNumberForName).get("Name")));

    }
    @Then("The user verify that company name {int}")
    public void the_user_verify_that_company_name(Integer rowNumberForCompany) {

        String actualCompanyName = dashboardPage.getCompanyName(dataList.get(rowNumberForCompany).get("Company"));
        Assert.assertEquals(dataList.get(rowNumberForCompany).get("Company"),actualCompanyName);




    }
}
