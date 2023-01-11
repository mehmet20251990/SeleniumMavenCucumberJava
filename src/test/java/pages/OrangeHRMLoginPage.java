package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrangeHRMLoginPage {
    WebDriver driver;
    public OrangeHRMLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(name = "username")
    WebElement txtUsername;
    @FindBy(name = "password")
    WebElement txtPassword;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnLogin;
    @FindBy(xpath = "//*[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    WebElement errMessage;
    public void typeUsername(String text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        txtUsername.sendKeys(text);
    }
    public void setPassword(String text) {
        txtPassword.sendKeys(text);
    }
    public void clickLogin() {
        btnLogin.click();
    }
    public void loginAsAdmin(){
        typeUsername("Admin");
        typeUsername("admin123");
        clickLogin();
    }
    public void verifyErrMessageContains(String message){
        Assert.assertTrue(errMessage.getText().contains(message));
    }
}
