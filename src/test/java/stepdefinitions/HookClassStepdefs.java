package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.OhlHomePage;
import utilities.Driver;

public class HookClassStepdefs {
    OhlHomePage oP = new OhlHomePage(Driver.getDriver());
    @Given("Kullanici anasayfaya gider")
    public void kullaniciAnasayfayaGider() {
        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/");
    }
    @And("Kullanici username {string} girer")
    public void kullaniciUsernameGirer(String arg0) {
        oP.setUsername(arg0);
    }
    @And("Kullanici password {string} girer")
    public void kullaniciPasswordGirer(String arg0) {
        oP.setPassword(arg0);
    }
    @When("Kullanici login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        oP.clickSubmit();
    }
    @And("Senaryo fail olur")
    public void senaryoFailOlur() {
        Assert.assertTrue(oP.InvalidCredentials.isDisplayed());
    }
    @And("Sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }
}