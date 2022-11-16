package org.espn.tests;

import org.testng.annotations.Test;

public class DeactivateAccountTest extends BaseTest{

    @Test
    public void DeactivateAccount() throws InterruptedException {
        // Logging In
        home.loginMethods(email, password);

        // Deactivate Account
        home.hoverOverUsrIcon();
        home.clickEspnProfile();
        home.goToLogInIframe();
        home.clickDeleteAccount();
        home.clickDeleteAccountSubmit();
    }
}
