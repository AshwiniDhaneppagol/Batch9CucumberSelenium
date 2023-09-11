package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class NavigateMenuStepDef {
    DashboardPage dashboardPage = new DashboardPage();

    @Then("The user should be able to see welcome message")
    public void the_user_should_be_able_to_see_welcome_message() {
        System.out.println("User sees welcome text");



    }
    @Then("The user navigates to Developer menu")
    public void the_user_navigates_to_developer_menu() {

        System.out.println("Navigate to developer menu");
    }
    @Then("The user able to see developer title")
    public void the_user_able_to_see_developer_title() {
        System.out.println("The user can see the title");
    }

    @And("The user navigates to All Posts menu")
    public void theUserNavigatesToAllPostsMenu() {
        System.out.println("Navigate to All Posts menu");
    }

    @Then("The user able to see All Posts title")
    public void theUserAbleToSeeAllPostsTitle() {
        System.out.println("The user can see the all posts title");
    }
    @Then("The user navigates to My Account menu")
    public void the_user_navigates_to_my_account_menu() {

        System.out.println("Navigate to My Account menu");
    }
    @Then("The user able to see  Dashboard title")
    public void the_user_able_to_see_dashboard_title() {
        System.out.println("The user can see the dashboard title");
    }

    @And("The user navigates to {string} menu")
    public void theUserNavigatesToMenu(String menuName) {

        dashboardPage.navigateMenu(menuName);


    }

    @Then("The should be able to see header as {string}")
    public void theShouldBeAbleToSeeHeaderAs(String expectedHeader) {
        String actualHeader= dashboardPage.getHeader(expectedHeader);
        Assert.assertEquals(expectedHeader,actualHeader);
    }
}
