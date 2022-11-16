package org.espn.tests;

import org.espn.pages.HomePage;
import org.testng.annotations.*;

public class LogOutTest extends BaseTest{

    @Test
    public void LogOut(){
        // Logging In
        home.loginMethods(email, password);

        // Logging out
        home.refreshPage();
        home.hoverOverUsrIcon();
        home.clickLogOutButton();
    }
}
