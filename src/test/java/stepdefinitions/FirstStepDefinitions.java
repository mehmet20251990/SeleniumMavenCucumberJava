package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstStepDefinitions {
    @Given("Ilk feature icin cucumber indirdim")
    public void ilk_feature_icin_cucumber_indirdim() {
        System.out.println("Given step çalıştı");
    }
    @When("Senaryomu calistirdigimda")
    public void senaryomu_calistirdigimda() {
        System.out.println("When step çalıştı");
    }
    @Then("Senaryomun calistigini konsolda gormeliyim")
    public void senaryomun_calistigini_konsolda_gormeliyim() {
        System.out.println("Then step çalıştı");
    }
}
