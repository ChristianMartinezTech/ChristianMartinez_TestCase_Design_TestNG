package org.espn.util;

import org.espn.reporting.Reporter;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.ITestContext;

/***
 * Class Listener will show any logs of the text based in iTestResult, iTestContext, and the log4j file
 */
public class Listener implements ITestListener{

    @Override
    public void onTestStart(ITestResult iTestResult) {
        Reporter.info("Test " + iTestResult.getName() + " Started");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        Reporter.info("Test " + iTestResult.getName() + " [Succeeded]");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        Reporter.error("Test " + iTestResult.getName() + " [Failed]");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        Reporter.error("Test " + iTestResult.getName() + " [Skipped]");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        Reporter.info("Test " + iTestResult.getName() + " [Failed within success percentage]");
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        Reporter.info("Test " + iTestContext.getName() + " [Test on start]");
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        Reporter.info("Test " + iTestContext.getName() + " [Test on finish]");
    }
}
