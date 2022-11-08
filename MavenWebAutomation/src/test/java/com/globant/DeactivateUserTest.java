package com.globant;
import org.testng.annotations.*;

/***
 * Class that test the deactivation of an user
 */
public class DeactivateUserTest extends BaseBrowser{
    @Test(dataProvider = "correctLogin", groups = {"Deactivation"})
    public void TestDeactivateUser(String email, String password){
        logger.info("Click the round person icon in the right left");
        logger.info("Click *Account Settings*");
        logger.info("Click *Security*");
        logger.info("Click *Deactivate Account*");
        logger.info("Confirm email" + email);
        logger.info("Confirm password" + email);
        logger.info("Click *Deactivate Account*");
        //LoginTest.TestLogin(email, password);
        logger.info("Verify said account was deactivated");
        System.out.println();
    }
}
