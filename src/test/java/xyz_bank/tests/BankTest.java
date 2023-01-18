package xyz_bank.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import xyz_bank.home_page.ManagerLoginPage;
import xyz_bank.model.User;
import xyz_bank.service.UserCreator;

public class BankTest extends CommonConditions {

    private static final String USER_NAME = "Beknur Smagulov";
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
//        Assert.assertEquals(testUser.getUserFirstName(), USER_NAME, "user name is incorrect");
        Assert.assertEquals(testUser.getUserFirstName()+ " " + testUser.getUserLastName(), managerLoginPage.getUserName(driver), "user name is incorrect");
//        Assert.assertEquals(USER_NAME, managerLoginPage.getTittleName(driver), "user name is incorrect");
                managerLoginPage.homeButton();
    }
}
