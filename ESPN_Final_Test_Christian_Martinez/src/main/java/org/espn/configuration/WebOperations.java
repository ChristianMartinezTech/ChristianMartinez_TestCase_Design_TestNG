package org.espn.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.openqa.selenium.support.PageFactory.initElements;

/***
 * Class WebOperations
 * This class stores all the methods that will interact with the website.
 */

public class WebOperations {
    private final WebDriver driver;
    protected final WebDriverWait wait;

    /***
     * WebOperations constructor.
     * It takes the Web Driver initialized as Parameter.
     * @param driver
     */
    public WebOperations(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10L);
        initElements(driver, this);
    }

    /***
     * GetDriver getter
     * @return the initialized driver.
     */
    public WebDriver getDriver() {
        return driver;
    }

    /***
     * Waits for element to be clickable and clicks it.
     * @param element web element to click on.
     */
    public void clickElement(WebElement element){
        waitForClickable(element);
        element.click();
    }

    /***
     * Waits for element to be visible and types text on it.
     * @param element web element to type on.
     * @param text text in type
     */
    public void typeOnInput(WebElement element, String text){
        this.waitForVisibility(element);
        element.sendKeys(text);
    }

    /***
     * Waits for element to be visible
     * @param element web element to wait for.
     */
    public void waitForVisibility(WebElement element){
        this.wait.until(ExpectedConditions.visibilityOf(element));
    }

    /***
     * Waits for element to be clickable.
     * @param element element web element to wait for.
     */
    public void waitForClickable(WebElement element){
        this.wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    /***
     * Hovers over an element
     * @param element element to hover over
     */
    public void hoverOver(WebElement element) {
        this.waitForVisibility(element);
        new Actions(getDriver()).moveToElement(element).perform();
    }

    /***
     * Refresh the current website
     */
    public void refreshPage(){
        this.driver.navigate().refresh();
    }
}
