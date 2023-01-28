package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.EditorPage;

public class EditorStepdefinitions {
    EditorPage editorPage=new EditorPage();
    @Then("new butonuna basar")
    public void new_butonuna_basar() {
    editorPage.newKutusu.click();
    }
    @Then("First name kutusuna {string}")
    public void first_name_kutusuna(String firstName) {
    editorPage.firstName.sendKeys(firstName);
    }
    @Then("Last name kutusuna {string}")
    public void last_name_kutusuna(String lastName) {
        editorPage.lastName.sendKeys(lastName);

    }
    @Then("position  kutusuna {string}")
    public void position_kutusuna(String pasition) {
        editorPage.position.sendKeys(pasition);

    }
    @Then("office  kutusuna {string}")
    public void office_kutusuna(String office) {
        editorPage.office.sendKeys(office);

    }
    @Then("extension  kutusuna {string}")
    public void extension_kutusuna(String extension) {
        editorPage.extension.sendKeys(extension);

    }
    @Then("Start date  kutusuna {string}")
    public void start_date_kutusuna(String startDate) {
        editorPage.startDate.sendKeys(startDate);

    }
    @Then("Salary   kutusuna {string}")
    public void salary_kutusuna(String salary) {
        editorPage.salary.sendKeys(salary);


    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        editorPage.createButonu.click();

    }
    @When("kullanici {string} ile arama yapar")
    public void kullanici_ile_arama_yapar(String firstName) {
editorPage.searchKutusu.sendKeys(firstName+ Keys.ENTER);
    }
    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isim_bolumunde_oldugunu_dogrular(String firstName) {

        String actualIlkIsımStr=editorPage.ilkIsımElementi.getText();

        Assert.assertTrue(actualIlkIsımStr.contains(firstName));


    }
}
