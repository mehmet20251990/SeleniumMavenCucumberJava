package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("Smoke test icin hazırlıklar yapıldı")
    public void smokeTestIcinHazırlıklarYapıldı() {
    }

    @When("Smoke test calistiginda")
    public void smokeTestCalistiginda() {
        System.out.println("smoke test calisti");
    }

    @Then("Smoke test basarili olmali")
    public void smokeTestBasariliOlmali() {
    }

    @Given("Regression test icin hazırlıklar yapıldı")
    public void regressionTestIcinHazırlıklarYapıldı() {
    }

    @When("Regression test calistiginda")
    public void regressionTestCalistiginda() {
        System.out.println("regression test calisti");
    }

    @Then("Regression test basarili olmali")
    public void regressionTestBasariliOlmali() {
    }
}
