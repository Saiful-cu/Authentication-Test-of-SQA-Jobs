package test.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverManager {
    public static WebDriver driver;
    public static WebDriverWait wait;

    public static boolean getDriver(){
        if(driver == null){
             driver = new ChromeDriver();
             driver.manage().window().maximize();
             wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }
        return driver;
    }
    public static void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
}

