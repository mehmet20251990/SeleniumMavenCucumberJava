package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utilities.Driver;

import java.util.List;

public class OrangeHRMStepdefs {
    @Given("kullanici HRMLogin sayfasina gider")
    public void kullaniciHRMLoginSayfasinaGider() {
        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/");
    }
    @When("kullanici credentials girer")
    public void kullaniciCredentialsGirer(DataTable table) {
    /*  1) List metoduyla table i parcalama...
        List<List<String>> data = table.asLists();
        for (List<String>satir:data) {
            for (String hucre:satir) {
                System.out.print(hucre+" - ");
            }
            System.out.println();
        }  */

    //  2)
    //    String username = table.cell(1,0);
    //    String password = table.cell(1,1);
    //    System.out.println(username+" - "+password);

    /*  3)
        int rowCount = table.height();
        int colCount = table.width();
        for (int i = 1; i < rowCount; i++) {
            for (int j=0; j < colCount; j++) {
                System.out.println(table.cell(i, j));
            }
        } */

    }
}
