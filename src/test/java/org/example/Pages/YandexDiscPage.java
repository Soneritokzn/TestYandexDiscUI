package org.example.Pages;


import org.example.Tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class YandexDiscPage extends TestBase {

    private WebDriver driver;

    public YandexDiscPage(WebDriver driver) {
        this.driver = driver;
    }

    public void createFolder(String folderName) {


        driver.get("https://disk.yandex.ru/client/recent");

        WebElement userPicImage = driver.findElement(By.className("user-pic__image"));
        userPicImage.click(); //Клик на аватар


        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement menuItem = wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.
                        xpath("//span[@class='menu__text' and contains(text(), 'Мой диск')]")));
        menuItem.click();   //Клик на пункт "Мой диск"


        WebElement element = driver.findElement(By.xpath("//span[contains(text(), 'Создать')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
        //Клик на иконку создать

        WebElement creation = driver.findElement(By.xpath("//span[text()='Папку']"));
        actions.moveToElement(creation).click().perform();
        //Клик на иконку папки

      /* By folderNameInputLocator = By.xpath("//input[@class='Textinput-Control']");
       WebElement folderNameInput = driver.findElement(folderNameInputLocator);
       folderNameInput.clear();
       folderNameInput.sendKeys(folderName);*/
       //Очистка поля ввода и введение своего названия. Не работает, создаем дефолтное название


        WebElement saveButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Сохранить']")));
        actions.moveToElement(saveButton).click().perform();
        //Кнопка сохранить


        By createdFolderLocator = By.cssSelector("div.listing-item__title[aria-label='Новая папка'] span.clamped-text");
        WebElement createdFolderElement = driver.findElement(createdFolderLocator);
        wait.until(ExpectedConditions.presenceOfElementLocated(createdFolderLocator));
        Assert.assertTrue(createdFolderElement.isDisplayed(), "Новая папка создана");












    }

    public void createFile(String fileName) {

    }

    // Другие методы для манипуляций с файлами
}
