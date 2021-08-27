package com.weber.step_definitions;

import com.weber.pages.BasePage;
import com.weber.utilities.Driver;
import com.weber.utilities.ConfigurationReader;
//import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends BasePage {

    @Before
    public void setUp(){
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        Driver.get().manage().window().maximize();
        clearCookiees();
        System.out.println("// This is coming from BEFORE");

    }

    @After
    public void tearDown() throws InterruptedException {
  /*
        //if test failed - do this
        if (scenario.isFailed()) {
            System.out.println("Test failed! Check your ScreenShot");
            byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } else {
            System.out.println("Cleanup!");
            System.out.println("Test completed! Thumbs Up");
        }
        System.out.println("###########-THE END-###################");
        //after every test, we gonna close browser
    */

        Thread.sleep(10000);
        Driver.closeDriver();
        System.out.println("// This is coming from AFTER");
    }

}
