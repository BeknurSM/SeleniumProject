package xyz_bank.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSingleton {

    private static final String RESOURCES_PATH = "src\\test\\resources";
    private static WebDriver driver;

    private DriverSingleton(){}

    public static WebDriver getDriver(){
        if (null == driver){
//            switch (System.getProperty("browser")){
//                case "firefox": {
//                      WebDriverManager.firefoxdriver().setup();
//                    driver = new FirefoxDriver();
//                }
//                default:{
//                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
//                }
//            }
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void closeDriver(){
        driver.quit();
        driver = null;
    }

}
