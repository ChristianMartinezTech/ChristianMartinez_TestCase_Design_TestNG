package org.espn.tests;

import org.testng.annotations.*;

public class LogOutTest extends BaseTest{

    @Test
    public void LogOut(){
        home.hoverOverUsrIcon();
        home.clickContainerLogIn();
        home.goToLogInIframe();
        home.clickEmailLogIn();
        home.inputEmail(email);
        home.clickPasswordLogIn();
        home.inputPassword(password);
        home.logInButton();

        // Checking that the logging was successful
        home.refreshPage();
        home.hoverOverUsrIcon();
        home.clickLogOutButton();
    }
}
