package org.espn.pages;

import org.espn.reporting.Reporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Objects;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Web Elements
    @FindBy(css = "title")
    private WebElement websiteTitle;

    @FindBy (id = "global-user-trigger")
    private WebElement globalUserTrigger;

    @FindBy (className = "global-user")
    private WebElement userContainer;

    @FindBy (css = "#global-header > div.container > ul > li.user > div > div > ul.account-management > li:nth-child(7) > a")
    private WebElement globalUserContainerLogin;

    @FindBy (id = "oneid-iframe")
    private WebElement loginIframe;

    @FindBy (id = "InputLoginValue")
    private WebElement LogInEmail;

    @FindBy (id = "InputPassword")
    private WebElement LogInPassword;

    @FindBy (id = "BtnSubmit")
    private WebElement LogInButton;

    @FindBy (css = "div.global-user:last-child ul.account-management > li:last-child > a")
    private WebElement LogOutButton;

    @FindBy (css = "#global-header > div.container > ul > li.user > div > div > ul.account-management > li.display-user > span")
    private WebElement accountName;


    // Methods
    public void hoverOverUsrIcon() {
        super.hoverOver(globalUserTrigger);
        waitForVisibility(userContainer);
    }

    public void clickContainerLogIn() {
        super.clickElement(this.globalUserContainerLogin);
    }

    public void clickEmailLogIn() {
        super.clickElement(this.LogInEmail);
    }

    public void clickPasswordLogIn() {
        super.clickElement(this.LogInPassword);
    }

    public void inputEmail(String email) {
        super.waitForVisibility(this.LogInEmail);
        super.typeOnInput(this.LogInEmail, email);
    }

    public void inputPassword(String password) {
        super.waitForVisibility(this.LogInPassword);
        super.typeOnInput(this.LogInPassword, password);
    }

    public void goToLogInIframe() {
        super.getDriver().switchTo().frame(this.loginIframe);
    }

    public void logInButton() {
        super.waitForVisibility(this.LogInButton);
        super.clickElement(LogInButton);
    }

    public void clickLogOutButton() {
        //super.waitForVisibility(this.LogOutButton);
        super.clickElement(LogOutButton);
    }

    public String checkAccountName() {
        super.waitForVisibility(this.accountName);
       return accountName.getText();
    }

    public void nameEqual(String name) {
        if (Objects.equals(checkAccountName(), name)) {
            Reporter.info("Name matches!");
        } else {
            Reporter.error("Name does NOT match!");
        }
    }
}
