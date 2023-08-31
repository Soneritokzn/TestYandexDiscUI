package org.example.Tests;

import org.example.Pages.LoginPage;
import org.example.Pages.UserData;
import org.example.Pages.YandexDiscPage;
import org.testng.annotations.Test;

public class TestScenario extends TestBase{

    @Test
    public void testLoginAndCreateFile() throws InterruptedException {
        UserData userData = new UserData("awesome.zhabovitch", "Zhaba1234");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(userData);

        YandexDiscPage yandexDiscPage = new YandexDiscPage(driver);
        yandexDiscPage.createFolder("Новая папка");





    }
    @Test
    public void testUpload() throws InterruptedException {
        UserData userData = new UserData("awesome.zhabovitch", "Zhaba1234");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(userData);
        YandexDiscPage yandexDiscPage = new YandexDiscPage(driver);
        yandexDiscPage.uploadFile("Some");

    }


}
