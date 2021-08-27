package com.weber.step_definitions;

import com.weber.pages.LoginPage;
import com.weber.utilities.ConfigurationReader;
import com.weber.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("When calisti");
    }
    @When("the user enters the user information")
    public void the_user_enters_the_user_information() throws InterruptedException {
        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);

    }
    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() throws InterruptedException {
        Thread.sleep(10000);
        System.out.println("then calisti");

    }

}
