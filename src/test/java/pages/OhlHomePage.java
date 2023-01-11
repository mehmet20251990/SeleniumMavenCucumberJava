package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OhlHomePage {
    private WebDriver driver;
    public OhlHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(name = "username")
    private WebElement username;
    @FindBy(name = "password")
    private WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submit;
    @FindBy(xpath = "//*[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    public WebElement InvalidCredentials;

    public void setUsername(String name) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        username.sendKeys(name);
    }
    public void setPassword(String pin) {
        password.sendKeys(pin);
    }
    public void clickSubmit() {
        submit.click();
    }



}
