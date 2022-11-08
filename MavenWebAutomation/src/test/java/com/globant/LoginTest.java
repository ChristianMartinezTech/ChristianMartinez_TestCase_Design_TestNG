package com.globant;
import org.testng.annotations.*;

/***
 * Log In Verification class
 */
public class LoginTest extends BaseBrowser {
    @Test(dataProvider = "correctLogin", groups = {"Login"})
    public void TestLogin(String email, String password){
        logger.info("Click the round person icon in the right left");
        logger.info("Click *Log In*");
        logger.info("Input email: "+ email);
        logger.info("Input password: "+ password);
        logger.info("Click *Log In*");
        logger.info("Verify Log In its correct");
        System.out.println();
    }
}
