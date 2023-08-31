package org.example.Pages;

import org.example.Tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.DriverManagerType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends TestBase {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }



    public void login(UserData userData)  {
        driver.manage().window().maximize();
        driver.get("https://360.yandex.ru/");
        driver.findElement(By.id("header-login-button")).click();
        driver.findElement(By.id("passp-field-login")).sendKeys(userData.getUsername());
        driver.findElement(By.id("passp:sign-in")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passp-field-passwd")));
        element.sendKeys(userData.getPassword());
        driver.findElement(By.id("passp:sign-in")).click();
        System.out.println(driver.getCurrentUrl());

        /*driver.findElement(By.cssSelector("#passp-field-passwd")).sendKeys(userData.getPassword());
        driver.findElement(By.id("passp:sign-in")).click();*/
    }
}
