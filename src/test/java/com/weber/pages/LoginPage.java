package com.weber.pages;

import com.weber.utilities.BrowserUtils;
import com.weber.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

public class LoginPage extends BasePage {

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/span[2]/a/span")
    //          chropath     //span[@id='cmpbntsavetxt']
    //                       /html[1]/body[1]/div[1]/div[1]/div[2]/span[2]/a[1]/span[1]
    //@FindBy(id = "cmpbntyestxt")
    public WebElement cookies;

    @FindBy(xpath = "//header/div[1]/div[1]/div[1]/span[1]")
    public WebElement dashboardLogin;

    @FindBy(xpath = "//body/aside[1]/div[2]/div[3]/div[2]/div[2]/nav[1]/ul[1]/li[1]/a[1]")
    public WebElement registerButton;

    @FindBy(xpath = "//input[@id='femanager_field_firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='femanager_field_lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='femanager_field_company']")
    public WebElement company;

    @FindBy(xpath = "//input[@id='femanager_field_address']")
    public WebElement address;

    @FindBy(xpath = "//input[@id='femanager_field_zip']")
    public WebElement zip;

    @FindBy(xpath = "//input[@id='femanager_field_city']")
    public WebElement city;

    //@FindBy(xpath = "//select[@id='femanager_field_country']")
    @FindBy(id = "femanager_field_country")
    public WebElement country;

    @FindBy(xpath = "//input[@id='femanager_field_telephone']")
    public WebElement telephone;

    @FindBy(xpath = "//input[@id='femanager_field_email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='femanager_field_password']")
    public WebElement r_password;

    @FindBy(xpath = "//input[@id='femanager_field_password_repeat']")
    public WebElement repeatpassword;

    @FindBy(xpath = "//input[@id='femanager_field_terms_and_conditions']")
    public WebElement acceptdataschutz;

    @FindBy(xpath = "//input[@id='femanager_field_submit']")
    public WebElement createProfile;

//------------LOGIN-----------

    @FindBy(xpath = "//header/div[1]/div[1]/div[1]/span[1]")
    public WebElement loginbutton;

    @FindBy(xpath = "//body/aside[1]/div[2]/div[3]/div[2]/div[3]/form[1]/div[1]/input[1]")
    public WebElement userName;

    @FindBy(xpath = "//body/aside[1]/div[2]/div[3]/div[2]/div[3]/form[1]/div[2]/input[1]")
    public WebElement password;

    @FindBy(xpath = "//body/aside[1]/div[2]/div[3]/div[2]/div[3]/form[1]/div[3]/input[1]")
    public WebElement submit;

    // Login in record page

    @FindBy(xpath = "//input[@id='user']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='pass']")
    public WebElement password2;

    @FindBy(xpath = "//body/main[1]/div[2]/div[1]/form[1]/div[2]/div[1]/input[1]")
    public WebElement login2;

    @FindBy(xpath = "//h2[contains(text(),'User login')]")
    public WebElement textforscrolldown;

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    public void login(String userNameStr, String passwordStr) throws InterruptedException {
        BrowserUtils.waitFor(2);
        //cookies.click();
        loginbutton.click();
        BrowserUtils.waitFor(2);
        userName.sendKeys("mullernaturkase@gmail.com");
        password.sendKeys("müllernaturkäse123");
        submit.click();
        Thread.sleep(5000);
        // verification that we logged
    }

    public void navigateToRegisterPage() {

        //BrowserUtils.waitFor(2);
        //cookies.click();
        dashboardLogin.click();
        BrowserUtils.waitFor(2);
        registerButton.click();
    }
    public void createNewProfile () throws InterruptedException {


        firstName.sendKeys("Roland");
        lastName.sendKeys("Müller");
        company.sendKeys("Müller Natur Käse GmbH");
        address.sendKeys("Guenther-Weber-Straße 3");
        zip.sendKeys("35236");
        city.sendKeys("Breidenbach");

        Select countryDropdown = new Select(country);
        BrowserUtils.waitFor(1);
        countryDropdown.selectByVisibleText("Deutschland");
        String expectedOption ="Deutschland";
        String actualOption = countryDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedOption,actualOption);

        telephone.sendKeys("+496465918-0");
        email.sendKeys("mullernaturkase@gmail.com");
        r_password.sendKeys("müllernaturkäse123");
        repeatpassword.sendKeys("müllernaturkäse123");
        acceptdataschutz.click();
        Thread.sleep(9000);
        createProfile.click();
        // verification that we created a 'NewProfile'
    }

    public void login2(String userNameStr, String passwordStr) throws InterruptedException {

        scrollDown(textforscrolldown);
        Thread.sleep(3000);
        username.sendKeys("mullernaturkase@gmail.com");
        Thread.sleep(3000);
        password2.sendKeys("müllernaturkäse123");
        login2.click();
        Thread.sleep(4000);
        // verification that we logged
    }
}
