package xyz_bank.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import xyz_bank.driver.DriverSingleton;

public class CommonConditions {
    public WebDriver driver;

    @BeforeMethod()
    public void setUp()
    {
        driver = DriverSingleton.getDriver();
    }

//    @AfterMethod(alwaysRun = true)
//    public void stopBrowser()
//    {
//        DriverSingleton.closeDriver();
//    }
}
