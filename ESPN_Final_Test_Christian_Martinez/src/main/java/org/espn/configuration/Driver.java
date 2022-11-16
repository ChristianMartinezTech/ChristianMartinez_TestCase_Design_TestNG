package org.espn.configuration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.espn.reporting.Reporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.lang.String.format;

/***
 * Driver class will have the public method to
 */
public class Driver {
    private WebDriver driver;

    public Driver(String browser){
        if (browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else {
            Reporter.error(format("Not available driver for browser %s", browser));
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}
