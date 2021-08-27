package com.weber.step_definitions;

import com.weber.pages.BasePage;
import com.weber.pages.ProductFinder;
import com.weber.utilities.ConfigurationReader;
import com.weber.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ProductFinderSteps {

    @Given("the user is on the Product Finder page")
    public void the_user_is_on_the_product_finder_page() {

       // String url = ConfigurationReader.get("url");
       // Driver.get().get(url);

        ProductFinder productFinder = new ProductFinder();
        productFinder.navigateToProductFinder();

        System.out.println("Given calisti");
    }
    @When("user enters information to find the product")
    public void user_enters_information_to_find_the_product() throws InterruptedException {

        ProductFinder productFinder = new ProductFinder();

        productFinder.enterProductFeature();

        System.out.println("When calisti");
    }
    @Then("The user selects the desired product according to the features entered.")
    public void the_user_selects_the_desired_product_according_to_the_features_entered() throws InterruptedException {

        ProductFinder productFinder = new ProductFinder();

        productFinder.selectingTheProduct();

        System.out.println("Then calisti");
    }

    @Then("The user contacts Weber to get detailed information about the product which has chosen.")
    public void the_user_contacts_weber_to_get_detailed_information_about_the_product_which_has_chosen() throws InterruptedException  {

        ProductFinder productFinder = new ProductFinder();
        productFinder.contactTheCompany();

        System.out.println("Then calisti_2");
    }

}
