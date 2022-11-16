package org.espn.tests;

import org.espn.configuration.Driver;
import org.espn.configuration.Driver;
import org.espn.pages.HomePage;
import org.espn.reporting.Reporter;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Objects;

import static java.lang.String.format;

public class BaseTest {
    final String email = "Aloha.1234@gmail.com";
    final String password = "Aloha.1234";
    private Driver driver;
    protected HomePage home;

    @Parameters({"browser", "url"})

    @BeforeTest
    public void setUp(String browser, String url){
        driver = new Driver(browser);
        Reporter.info("Deleting cookies");
        driver.getDriver().manage().deleteAllCookies();

        Reporter.info(format("Navigating to %s", url));
        driver.getDriver().get(url);
        driver.getDriver().manage().window().maximize();

        home = new HomePage(driver.getDriver());
    }

    @AfterTest
    public void endSession(){
        driver.getDriver().quit();
    }
}
