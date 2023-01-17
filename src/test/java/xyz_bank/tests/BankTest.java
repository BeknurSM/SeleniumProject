package xyz_bank.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import xyz_bank.home_page.ManagerLoginPage;
import xyz_bank.model.User;
import xyz_bank.service.UserCreator;

public class BankTest extends CommonConditions {

    @Test (description = "opens the manager's login page and creates a new user")
    public void managerLoginPageTest()
    {
        User testUser = UserCreator.withCredentialsFromProperty();
        ManagerLoginPage managerLoginPage = new ManagerLoginPage(driver)
                .openPage()
                .openManagerLoginPage()
                .addCustomerModule()
                .addCustomer(testUser)
                .openAccountModule()
                .openAccount()
                .viewCustomerModule();
                managerLoginPage.homeButton();
    }
}
