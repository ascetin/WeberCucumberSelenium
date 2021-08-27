package com.weber.step_definitions;

import com.weber.pages.LoginPage;
import com.weber.utilities.ConfigurationReader;
import com.weber.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CreateNewUserProfileDefs {

    @Given("the user is on the register page")
    public void the_user_is_on_the_register_page() {

        LoginPage loginpage = new LoginPage();
        loginpage.navigateToRegisterPage();

    }

    @When("the user enters the information of new user profile")
    public void the_user_enters_the_information_of_new_user_profile() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        LoginPage loginpage = new LoginPage();

        loginpage.createNewProfile();
        }

    @Then("the user create a new user profile")
    public void the_user_create_a_new_user_profile() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions

        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");

        LoginPage loginPage = new LoginPage();
        loginPage.login2(username,password);

        System.out.println("New Profile created as Roland Müller");
    }

}
