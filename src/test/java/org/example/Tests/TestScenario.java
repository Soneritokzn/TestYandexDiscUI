package org.example.Tests;

import org.example.Pages.LoginPage;
import org.example.Pages.UserData;
import org.testng.annotations.Test;

public class TestScenario extends TestBase{

    @Test
    public void testLogin() {
        UserData userData = new UserData("your_username", "your_password");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(userData);


    }
}
