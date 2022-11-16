package org.espn.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import org.espn.reporting.Reporter;
import java.util.Objects;

public class LoginTest extends BaseTest{

    @Test
    public void LogIn(){
        home.hoverOverUsrIcon();
        home.clickContainerLogIn();
        home.goToLogInIframe();
        home.clickEmailLogIn();
        home.inputEmail(email);
        home.clickPasswordLogIn();
        home.inputPassword(password);
        home.logInButton();

        // Checking that the logging was successful
        home.hoverOverUsrIcon();
        home.nameEqual("Chris");
    }
}
