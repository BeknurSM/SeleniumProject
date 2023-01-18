package xyz_bank.util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestResult;
import xyz_bank.driver.DriverSingleton;

import java.io.File;
import java.io.IOException;
import java.util.Date;


public class TestListener implements ITestListener {
    private Logger log = LogManager.getRootLogger();

    public void onTestStart(ITestResult ITestResult) { log.info("Test started"); }
    public void onTestSuccess(ITestResult ITestResult) { log.info("Test passed"); }
    public void onTestFailure(ITestResult ITestResult) { log.info("Test failed"); saveScreenshot(); }
    public void onTestSkipped(ITestResult ITestResult) { log.info("Test skipped"); }
    public void onTestFailedButWithinSuccessPercentage(ITestResult ITestResult) { log.info("Test passed partly"); }
    public void onStart(ITestContext ITestContext) { log.info("Tests started"); }
    public void onFinish(ITestContext ITestContext) { log.info("Tests finished"); }

    private void saveScreenshot() {
            Date currentDate = new Date();
            String screenshotFileName = currentDate.toString().replace(" ", "-").replace(":", "-");
            File file = ((TakesScreenshot)DriverSingleton.getDriver()).getScreenshotAs(OutputType.FILE);

            try {
                FileUtils.copyFile(file, new File(".//target/screenshots//" + screenshotFileName + ".png"));
            } catch (IOException e) {
                log.error("Failed to save screenshot" + e.getLocalizedMessage());
            }
        }

}
