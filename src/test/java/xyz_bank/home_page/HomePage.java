package xyz_bank.home_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends AbstractPage{

    private static final String HOME_PAGE_URL = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";

    public HomePage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public HomePage openPage()
    {
        driver.get(HOME_PAGE_URL);
        return this;
    }
}
