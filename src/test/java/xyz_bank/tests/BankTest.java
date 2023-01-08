package xyz_bank.tests;

import org.testng.annotations.Test;
import xyz_bank.home_page.ManagerLoginPage;
import xyz_bank.model.User;
import xyz_bank.service.UserCreator;

public class BankTest extends CommonConditions {

    private static String FIRST_NAME = "Beknur";
    private static String LAST_NAME = "Smagulov";
//    @Test (description = "opens the manager's login page and creates a new user")
//    public void sd()
//    {
//
//        ManagerLoginPage managerLoginPage = new ManagerLoginPage(driver)
//                .openPage()
//                .openManagerLoginPage();}
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
                .viewCustomerModule();//
                //Assert.assertEquals(driver.findElement(By.xpath("//*[contains(text(),'"+FIRST_NAME+"')]")).getText(), FIRST_NAME+" "+LAST_NAME , "Tittle name in published Pastebin is wrong");
                managerLoginPage.homeButton();
    }
}
