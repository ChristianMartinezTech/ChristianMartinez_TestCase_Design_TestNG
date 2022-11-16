package org.espn.configuration;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.openqa.selenium.support.PageFactory.initElements;

/***
 * Class to store all the methods that will interact with the website:
 * - clickElement
 * - typeOnInput
 * - waitForVisibility
 * - waitForClickable
 */
public class WebOperations {
    private final WebDriver driver;
    private final WebDriverWait wait;

    public WebOperations(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10L);
        initElements(driver, this);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void clickElement(WebElement element){
        waitForClickable(element);
        element.click();
    }

    public void typeOnInput(WebElement element, String text){
        this.waitForVisibility(element);
        element.sendKeys(text);
    }

    public void waitForVisibility(WebElement element){
        this.wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForVisibility(List<WebElement> elements){
        this.wait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }

    public void waitForClickable(WebElement element){
        this.wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void hoverOver(WebElement element) {
        this.waitForVisibility(element);
        new Actions(getDriver()).moveToElement(element).perform();
    }

    public void refreshPage(){
        this.driver.navigate().refresh();
    }
}
