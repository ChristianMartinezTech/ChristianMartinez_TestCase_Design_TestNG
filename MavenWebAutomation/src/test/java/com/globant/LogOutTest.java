package com.globant;
import org.testng.annotations.*;

/***
 * Log Out Verification class
 */
public class LogOutTest extends BaseBrowser{
    @Test(dataProvider = "correctLogin", groups = {"Logout"})
    public void TestLogOut(String email, String password){
        logger.info("Click the round person icon in the right left");
        logger.info("Click *Log Out*");
        logger.info("Verify Its logged Out");
        System.out.println();
    }
}
