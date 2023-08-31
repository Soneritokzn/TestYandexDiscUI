package org.example.Tests;

import org.example.Pages.LoginPage;
import org.example.Pages.UserData;
import org.example.Pages.YandexDiscPage;
import org.testng.annotations.Test;

public class TestScenario extends TestBase{

    @Test
    public void testLoginAndCreateFile()  {
        UserData userData = new UserData("awesome.zhabovitch", "Zhaba1234");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(userData);

        YandexDiscPage yandexDiscPage = new YandexDiscPage(driver);
        yandexDiscPage.createFolder("Test");





    }


}
