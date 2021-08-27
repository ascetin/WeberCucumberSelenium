package com.weber.pages;

import com.weber.utilities.BrowserUtils;
import com.weber.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.sql.DriverAction;
import java.util.List;
import java.util.Set;

public class ProductFinder extends BasePage {

    @FindBy(xpath = "//header/nav[1]/div[1]/ul[1]/li[2]/a[1]")
    public WebElement productFinder;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/span[2]/a/span")
    public WebElement cookies;

    @FindBy(xpath = "//a[contains(text(),'Reset search')]")
    public WebElement resetResearch;

    @FindBy(xpath = "//body/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/p[3]/span[4]/a[1]")
    public WebElement contactUs;

    @FindBy(xpath = "//div[@id='6']")
    public WebElement cheese;

    @FindBy(xpath = "/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/div[2]/section[2]/ul[1]/li[6]/div[1]")
    public WebElement cheesetext;

    @FindBy(xpath = "//body/main[1]/div[1]/div[1]/div[1]/div[2]/section[3]/ul[1]/li[6]/div[2]/*[1]")
    public WebElement svg;

    @FindBy (xpath = "//body/main[1]/div[1]/div[1]/div[1]/div[2]/section[4]/article[1]/section[1]/div[1]/span[1]")
    public WebElement throatwidth;

    @FindBy(xpath = "//body/main[1]/div[1]/div[1]/div[1]/div[2]/section[4]/article[1]/section[1]/div[2]/span[1]")
    public WebElement throatheight;

    @FindBy(xpath = "//body/main[1]/div[1]/div[1]/div[1]/div[2]/section[4]/article[1]/section[1]/div[3]/span[1]")
    public WebElement productLength;

    @FindBy(xpath = "//body/main[1]/div[1]/div[1]/div[1]/div[2]/section[5]/ul[1]/li[2]/div[2]")
    public WebElement involuteBlade;

    @FindBy(xpath = "//body/main[1]/div[1]/div[1]/div[1]/div[2]/section[5]/ul[1]/li[3]")
    public WebElement weberHygiene;

    @FindBy(xpath = "//body/main[1]/div[1]/div[1]/div[1]/div[2]/section[5]/ul[1]/li[7]/div[2]")
    public WebElement automaticLoading;

    @FindBy(xpath = "//body/main[1]/div[1]/div[1]/div[1]/div[2]/section[6]/article[6]/h2[1]/a[1]")
    public WebElement slicer905;

    @FindBy(xpath = "//body/main[1]/div[2]/div[1]/div[1]/article[1]/div[2]/ul[1]/li[1]/div[1]/a[1]/img[1]")
    public WebElement bild1;

    @FindBy(xpath = "//body/div[6]/div[1]/div[1]/a[1]")
    public WebElement closeBild1;

    @FindBy(xpath = "//body/main[1]/div[2]/div[1]/div[1]/article[1]/div[2]/ul[1]/li[4]/div[1]/a[1]/img[1]")
    public WebElement bild2;

    @FindBy(xpath = "//body/div[6]/div[1]/div[1]/a[1]")
    public WebElement closeBild2;

    @FindBy(xpath = "//body/main[1]/div[2]/div[1]/div[1]/article[1]/div[2]/ul[1]/li[5]/div[1]/a[1]/img[1]")
    public WebElement bild3;

    @FindBy(xpath = "//body/div[6]/div[1]/div[1]/a[1]")
    public WebElement closeBild3;

    @FindBy(xpath = "//body/main[1]/div[2]/div[1]/div[1]/article[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/img[1]")
    public WebElement bild4;

    @FindBy(xpath = "//body/div[6]/div[1]/div[1]/a[1]")
    public WebElement closeBild4;

    @FindBy(xpath = "//body/main[1]/div[2]/div[1]/div[1]/article[1]/div[1]/div[4]/button[1]")
    public WebElement displayTechnicalData;

    @FindBy(xpath = "//body/div[3]/button[1]")
    public WebElement oben;

    // Contact the Company
    @FindBy(xpath = "//header/nav[1]/div[1]/ul[1]/li[6]/a[1]")
    public WebElement company;

    @FindBy(xpath = "//body[1]/main[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/a[1]")
    public WebElement internationalContact;

    @FindBy(xpath = "//select[@id='contact-country']")
    public WebElement countryContact;

    @FindBy(xpath = "//a[contains(text(),'www.niederwieser.it')]")
    public WebElement forscrolldown;

    @FindBy(xpath = "//textarea[@id='defaultContactForm-message']")
    public WebElement yourmessage;

    @FindBy(xpath = "//input[@id='defaultContactForm-name']")
    public WebElement name;

    @FindBy(xpath = "//input[@id='defaultContactForm-company']")
    public WebElement companyName;

    @FindBy(xpath = "//input[@id='defaultContactForm-email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='defaultContactForm-telephone']")
    public WebElement telephone;

    @FindBy(xpath = "//input[@id='defaultContactForm-productfinder']")
    public WebElement submit;

    @FindBy(xpath = "//body/div[3]/button[1]")
    public WebElement companyOben;



    public ProductFinder(){
        PageFactory.initElements(Driver.get(), this);
    }

    public void navigateToProductFinder() {

        //clearCookiees();
        //cookies.click();
        productFinder.click();
        BrowserUtils.waitFor(2);
    }
    public void enterProductFeature() throws InterruptedException {
        BrowserUtils.waitFor(2);
        //resetResearch.click();

        scrollDown(svg);
        scrollDown(contactUs);
        cheesetext.click();

        Thread.sleep(1000);
        scrollDown(cheesetext);
        svg.click();

        /*
        Select throatwidthDropdown = new Select(throatwidth);
        BrowserUtils.waitFor(1);
        throatwidthDropdown.selectByValue("400");
        //throatwidthDropdown.selectByVisibleText("400");
        */
        scrollDown(productLength);
        involuteBlade.click();
        weberHygiene.click();
        automaticLoading.click();

        //slicer905.click();
        //BrowserUtils.waitFor(2);
        scrollDown(automaticLoading);

    }

    public void selectingTheProduct() throws InterruptedException {

        slicer905.click();
        BrowserUtils.waitFor(2);

        bild1.click();
        Thread.sleep(2000);
        closeBild1.click();

        bild2.click();
        Thread.sleep(2000);
        closeBild2.click();

        bild3.click();
        Thread.sleep(2000);
        closeBild3.click();

        bild4.click();
        Thread.sleep(2000);
        closeBild4.click();

        scrollDown(displayTechnicalData);
        displayTechnicalData.click();
        Thread.sleep(2000);

        scrollDown(oben);
        oben.click();
        Thread.sleep(2000);
    }

    public void contactTheCompany() throws InterruptedException {

        company.click();
        Thread.sleep(2000);
        internationalContact.click();

        Select countryDropdown = new Select(countryContact);
        BrowserUtils.waitFor(1);
        countryDropdown.selectByVisibleText("Italy");
        String expectedOption ="Italy";
        String actualOption = countryDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedOption,actualOption);

        scrollDown(forscrolldown);

        String text = "Sehr geehrter Herr Gerhard Zoeschg,                             " +
                       "                               ";
        String text1 = "Wir sind einer der bekanntesten Käsehersteller Unternehmen in Italien. Als Ergebnis der Forschung haben wir entschieden, dass Slicer 905 das am besten geeignete Produkt für unser Unternehmen ist." +
                       "Wir möchten von Ihnen Informationen zu Produktpreisen, Garantiebedingungen und technischem Support erhalten. " +
                       "Wenn Sie Zeit haben, hoffen wir, dass Sie unser Unternehmen besuchen.                           Mit freundlichen Grüßen ";

        yourmessage.sendKeys(text);
        yourmessage.sendKeys(text1);
        name.sendKeys("Roland Müller");
        companyName.sendKeys("Müller Natur Käse GmbH");
        email.sendKeys("müllernaturkase@gmail.com");
        telephone.sendKeys("+496465918-0");
        Thread.sleep(9000);
        submit.click();

        Thread.sleep(2000);
    }








}
