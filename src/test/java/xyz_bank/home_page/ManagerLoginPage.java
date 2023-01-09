package xyz_bank.home_page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import xyz_bank.model.User;
import xyz_bank.util.Waitings;

public class ManagerLoginPage extends HomePage {

    private static final String HOME_PAGE_URL = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
    private final Logger logger = LogManager.getRootLogger();

    public ManagerLoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy (xpath = "(//button[@class = 'btn btn-primary btn-lg'])[2]")
    private WebElement managerLogin;

    @FindBy(xpath = "//button[@ng-class='btnClass1']")
    private WebElement addCustomerModuleButton;

    @FindBy(xpath = "//button[@ng-class='btnClass2']")
    private WebElement openAccountModuleButton;

    @FindBy(xpath = "//button[@ng-class='btnClass3']")
    private WebElement customersModuleButton;

    @FindBy(xpath = "//input[@placeholder = 'First Name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@placeholder = 'Last Name']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@placeholder = 'Post Code']")
    private WebElement postCode;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    private WebElement addCustomerButton;

    @FindBy (xpath = "//button[@class='btn home']")
    private WebElement homeButton;

    @FindBy(xpath = "//select[@id='userSelect']")
    public WebElement customerNameDropDownList;

    @FindBy(xpath = "//*[@id=\'userSelect\']/option[7]")
    public WebElement customerDropdownListSelection;

    @FindBy(xpath = "//*[@id='currency']")
    public WebElement currencyDropdownList;

    @FindBy(xpath = "//*[@id=\"currency\"]/option[2]")
    public WebElement currencyDropdownListSelection;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement processButton;

    public ManagerLoginPage openManagerLoginPage() {
        Waitings.waitForElementToBeClickable(managerLogin, driver);
        managerLogin.click();
        return this;
    }
    public ManagerLoginPage addCustomerModule() {
        Waitings.waitForElementToBeClickable(addCustomerModuleButton, driver);
        addCustomerModuleButton.click();
        return this;
    }

    public ManagerLoginPage viewCustomerModule() {
        Waitings.waitForElementToBeClickable(customersModuleButton, driver);
        customersModuleButton.click();
        return this;
    }
    public ManagerLoginPage openAccountModule() {
        Waitings.waitForElementToBeClickable(openAccountModuleButton, driver);
        openAccountModuleButton.click();
        return this;
    }
    public ManagerLoginPage homeButton() {
        Waitings.waitForElementToBeClickable(homeButton, driver);
        homeButton.click();
        return this;
    }

    public ManagerLoginPage openAccount() {
        Waitings.waitForElementToBeClickable(customerNameDropDownList, driver);
        customerNameDropDownList.click();
        customerDropdownListSelection.click();
        currencyDropdownList.click();
        currencyDropdownListSelection.click();
        processButton.click();
        driver.switchTo( ).alert( ).accept();
        return this;
    }

    public ManagerLoginPage addCustomer(User user) {
        Waitings.waitForElementToBeClickable(firstName, driver);
        firstName.sendKeys(user.userFirstName);
        lastName.sendKeys(user.userLastName);
        postCode.sendKeys(user.userPostCode);
        addCustomerButton.click();
        driver.switchTo( ).alert( ).accept();
        logger.info("A new customer is added");
        return this;
    }

    @Override
    public ManagerLoginPage openPage()
    {
        driver.navigate().to(HOME_PAGE_URL);
        return this;
    }
}
