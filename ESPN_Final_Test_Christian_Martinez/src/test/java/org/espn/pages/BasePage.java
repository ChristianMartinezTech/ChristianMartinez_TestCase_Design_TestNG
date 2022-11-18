package org.espn.pages;

import org.espn.configuration.WebOperations;
import org.openqa.selenium.WebDriver;

/***
 * Class: BasePage
 * Inherits from WebOperation
 */
public class BasePage extends WebOperations {

    /***
     * BasePage Constructor
     * @param driver current WebDriver
     */
    public BasePage(WebDriver driver) {
        super(driver);
    }
}
