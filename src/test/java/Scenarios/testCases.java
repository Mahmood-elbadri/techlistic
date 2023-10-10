package Scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import Objects.Techlistic;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testCases {
    WebDriver driver;
    Techlistic tech;
    String url;
    String filePath;
    @BeforeTest
    public void beforeTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        url = "https://www.techlistic.com/p/selenium-practice-form.html";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get(url);
        tech = new Techlistic(driver);
        filePath="C:/Users/mahmo/Pictures/Screenshots/Screenshot(65).png";

    }
    @AfterTest
    public void afterTest() {
        //driver.quit();
    }
    @Test
    public void ourTest(){
       /* long pageHeight = (long) ((JavascriptExecutor) driver).executeScript("return document.documentElement.scrollHeight;");

        // Scroll to the half of the page.
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, pageHeight / 2);");*/
        tech.fillFirstName();
        tech.fillLastName();
        tech.selectMale();
        tech.selectExperience();
        tech.selectDate();
        tech.manualAutomationBtn();
        tech.selectCountry();
        tech.selectCommand();
        tech.uploadPhoto(filePath);
        tech.clickSubmit();
    }


}
