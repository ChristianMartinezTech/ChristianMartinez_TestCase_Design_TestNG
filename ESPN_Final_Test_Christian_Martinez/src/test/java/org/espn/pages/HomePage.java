package org.espn.pages;

import org.espn.reporting.Reporter;
import org.openqa.selenium.By;
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

    @FindBy (linkText = "ESPN Profile")
    private WebElement espnProfile;

    @FindBy (id = "AccountDeleteLink")
    private WebElement deleteAccountButton;

    @FindBy (id = "BtnSubmit")
    private WebElement deleteAccountSubmit;

    @FindBy (id = "logo")
    private WebElement espnLoginLogo;

    @FindBy (id = "BtnCreateAccount")
    private WebElement signUp;

    @FindBy (linkText = "Watch")
    private WebElement watchButton;

    @FindBy (id = "bucket-40653")
    private WebElement tennisCarousel;

    @FindBy (css = "#fittPageContainer > section > div:nth-child(1) > section > div.Carousel__Wrapper.relative.Carousel__Wrapper--canScrollRight > div > div > ul > li:nth-child(2) > a")
    private WebElement secondCarouselItem;

    @FindBy (className = "lightbox__closebtn absolute overflow-hidden lightbox__closebtn--dark")
    private WebElement closeButton;

    @FindBy (className = "AnchorLink AnchorLink--dark WatchListingsVideo__BackBtn")
    private WebElement backButton;

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
        super.clickElement(LogOutButton);
    }

    public void clickEspnProfile(){
        super.waitForVisibility(espnProfile);
        super.clickElement(espnProfile);
    }

    public void goToAccountIframe() {
        super.getDriver().switchTo().frame(this.loginIframe);
    }

    public void clickDeleteAccount(){
        super.clickElement(deleteAccountButton);
    }

    public void clickDeleteAccountSubmit(){
        super.waitForVisibility(deleteAccountSubmit);
        super.clickElement(deleteAccountSubmit);
    }

    public void clickWatchButton(){
        super.waitForVisibility(watchButton);
        super.clickElement(watchButton);
    }

    public void clickSecondCarouselItem(){
        super.waitForVisibility(secondCarouselItem);
        super.clickElement(secondCarouselItem);
    }

    public void clickCloseButton(){
        super.waitForVisibility(closeButton);
        super.clickElement(closeButton);
    }

    public void clickBackButton(){
        super.waitForVisibility(backButton);
        super.clickElement(backButton);
    }

    // Collection of methods to avoid clutter
    public void loginMethods(String email, String password){
        hoverOverUsrIcon();
        clickContainerLogIn();
        goToLogInIframe();
        clickEmailLogIn();
        inputEmail(email);
        clickPasswordLogIn();
        inputPassword(password);
        logInButton();
    }

    // Log in checking methods
    public void nameEqual(String websiteObject, String name) {
        if (Objects.equals(websiteObject, name)) {
            Reporter.info("Name matches!");
            System.out.println("Name matches!");
        } else {
            Reporter.error("Name does NOT match!");
            System.out.println("Name does NOT match!");
        }
    }

    public void checkAccountName(String name) {
        nameEqual(accountName.getText(), name);
    }

    public boolean containsEspnPlusLogo(){
        super.waitForVisibility(espnLoginLogo);
        return espnLoginLogo.isDisplayed();
    }

    public boolean containsSignUp(){
        super.waitForVisibility(signUp);
        return signUp.isDisplayed();
    }

    public boolean containsLogIn(){
        super.waitForVisibility(LogInButton);
        return LogInButton.isDisplayed();
    }

    public boolean containsTennisCarousel(){
        super.waitForVisibility(tennisCarousel);
        return tennisCarousel.isDisplayed();
    }
}
