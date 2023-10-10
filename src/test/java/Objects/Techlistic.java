package Objects;

import org.checkerframework.checker.initialization.qual.FBCBottom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

public class Techlistic {
    @FindBy(xpath = "//input[@name='firstname']")private WebElement firstNameTxtBox;
    @FindBy(xpath = "//input[@name='lastname']")private WebElement lastNameTxtBox;
    @FindBy(xpath = "//input[@id='sex-0']") private WebElement maleBtn;
    @FindBy(xpath = "//input[@id='exp-0']") private WebElement expBtn;
    @FindBy(xpath =  "//input[@id='datepicker']") private WebElement datetextBox;
    @FindBy(xpath = "//input[@id='profession-0']") private WebElement manualTesterCheckBox;
    @FindBy(xpath = "//input[@id='profession-1']") private WebElement automationTesterCheckBox;
    @FindBy(xpath = "//input[@id='tool-2']") private WebElement automationTools;
    @FindBy(xpath = "//select[@id='continents']")private WebElement continentalDropBox;
    @FindBy(xpath = "//select[@id='selenium_commands']")private WebElement commandsBox;
    @FindBy(xpath = "//button[@id='submit']")private WebElement submitBtn;
    WebDriver driver;
    Select country;

    public Techlistic (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void fillFirstName() {
        firstNameTxtBox.sendKeys("Mahmood");
    }
    public void fillLastName() {
        lastNameTxtBox.sendKeys("Salah");
    }
    public void selectMale() {
        maleBtn.click();
    }
    public void selectExperience() {
        expBtn.click();
    }
    public void selectDate() {
        datetextBox.sendKeys("20/10/2012");
    }
    public void manualAutomationBtn() {
        manualTesterCheckBox.click();
        automationTesterCheckBox.click();
        automationTools.click();
    }
    public void selectCountry() {
        country = new Select(continentalDropBox);
        country.selectByVisibleText("Africa");
    }
    public void selectCommand() {
        country = new Select(commandsBox);
        country.selectByVisibleText("Wait Commands");
    }
    public void uploadPhoto(String path) {
        WebElement photoUpload = driver.findElement(By.id("photo"));
        photoUpload.sendKeys(path);
    }
    public void clickSubmit() {
        submitBtn.click();
    }


}
