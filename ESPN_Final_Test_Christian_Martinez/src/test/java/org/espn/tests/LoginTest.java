package org.espn.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import org.espn.reporting.Reporter;
import java.util.Objects;

public class LoginTest extends BaseTest{

    @Test
    public void LogIn(){
        // Login in
        home.hoverOverUsrIcon();
        home.clickContainerLogIn();
        home.goToLogInIframe();
        Assert.assertTrue(home.containsEspnPlusLogo());
        Assert.assertTrue(home.containsSignUp());
        Assert.assertTrue(home.containsLogIn());
        home.clickEmailLogIn();
        home.inputEmail(email);
        home.clickPasswordLogIn();
        home.inputPassword(password);
        home.logInButton();

        // Checking that the logging was successful
        home.hoverOverUsrIcon();
        home.checkAccountName("Chris");

        // Checking Carousel
        home.clickWatchButton();
        home.containsTennisCarousel();
        home.clickSecondCarouselItem();
        home.clickCloseButton();
        home.clickBackButton();
    }
}
