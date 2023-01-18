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
    private Logger log = LogManager.getRootLogger(); //add loggerss

    public void onTestStart(ITestResult ITestResult) {
    }
    public void onTestSuccess(ITestResult ITestResult) {
    }
    public void onTestFailure(ITestResult ITestResult) { saveScreenshot();
    }
    public void onTestSkipped(ITestResult ITestResult) {
    }
    public void onTestFailedButWithinSuccessPercentage(ITestResult ITestResult) {
    }
    public void onStart(ITestContext ITestContext) {
    }
    public void onFinish(ITestContext ITestContext) {
    }

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
