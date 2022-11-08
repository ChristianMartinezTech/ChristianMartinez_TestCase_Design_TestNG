package com.globant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

/***
 * LoggingIn Class is used to interact with the Browser and Log-in
 *
 * - Open and close the browser
 * - Open and close tabs
 * - Open "https://www.espnqa.com/?_adbock=true&src=com"
 */
public class BaseBrowser {
    public String website = "https://www.espnqa.com/?_adbock=true&src=com";

    static Logger logger = LoggerFactory.getLogger(BaseBrowser.class);

    // Using DataProvider to feed this logging info to the test
    // Correct Login info
    @DataProvider (name = "correctLogin")
    public Object[][] getCorrectLogin(){
        return new Object[][] {{"correctEmail@email.com", "correctPassword"}};
    }

    // Incorrect Login info
    @DataProvider (name = "incorrectLogin")
    public Object[][] getIncorrectLogin(){
        return new Object[][] {{"incorrectEmail@email.com", "incorrectPassword"}};
    }


    // Test suite Setup
    @BeforeTest
    public void openBrowser(){
        logger.info("Browser opened");
    }

    @BeforeTest
    public void openTab(){
        logger.info("Tab opened");
    }

    @BeforeTest
    public void openWebsite(){
        logger.info("Opened" + website);
    }

    @AfterTest
    public void closeTab(){
        logger.info("Tab closed");
    }

    @AfterTest
    public void closeBrowser(){
        logger.info("Broser closed");
    }
}
