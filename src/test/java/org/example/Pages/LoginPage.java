package org.example.Pages;

import org.example.Tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.DriverManagerType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage extends TestBase {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(UserData userData) {

        driver.get("https://yandex.ru");
        driver.findElement(By.className("home-link2 headline__personal-enter headline__personal-enter home-link2_color_black")).click();
        driver.findElement(By.id("username")).sendKeys(userData.getUsername());
        driver.findElement(By.id("password")).sendKeys(userData.getPassword());
        driver.findElement(By.id("loginButton")).click();
    }
}
