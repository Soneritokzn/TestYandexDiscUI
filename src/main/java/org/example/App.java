package org.example;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.DriverManagerType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class App 
{
    public static void main( String[] args )
    {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Timur\\Desktop\\TestYandexDiscUI\\src\\main\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.getCurrentUrl();
    }
}

