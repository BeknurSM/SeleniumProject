package xyz_bank.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static xyz_bank.util.Waitings.BASE_WAIT_TIME;

public class Utils {
    public static String getTextFromElementByXPath(String xPathSelector, WebDriver driver) {
        return new WebDriverWait(driver, BASE_WAIT_TIME)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xPathSelector)))
                .getText();
    }
}
