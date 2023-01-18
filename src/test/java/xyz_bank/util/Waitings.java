package xyz_bank.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waitings {
    public static final Duration BASE_WAIT_TIME = Duration.ofSeconds(10);
    public static void waitForElementToBeClickable(WebElement element, WebDriver driver){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(element));
    }
}