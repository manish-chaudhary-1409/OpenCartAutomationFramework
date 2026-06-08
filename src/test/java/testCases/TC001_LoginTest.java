package testCases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.LoginPage;

public class TC001_LoginTest extends BaseClass {

    @Test
    public void loginTest() {

        HomePage hp = new HomePage(driver);

        hp.clickMyAccount();
        hp.clickLogin();

        LoginPage lp = new LoginPage(driver);

        lp.enterEmail("test@test.com");
        lp.enterPassword("test123");

        lp.clickLogin();

        System.out.println("Login Test Executed Successfully");
    }
}