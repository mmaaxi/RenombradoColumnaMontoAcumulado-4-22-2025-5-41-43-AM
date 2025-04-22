import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_005Page;

public class tc_005Steps {
    WebDriver driver;
    tc_005Page page;

    @Given("el usuario exporta el reporte y abre el Excel")
    public void exportarReporteYAbrirExcel() {
        page = new tc_005Page(driver);
        page.exportarReporte();
        page.abrirExcel();
    }

    @When("el usuario ubica la columna 'Monto Acumulado Folio OPC'")
    public void ubicarColumnaOriginal() {
        page.ubicarColumna("Monto Acumulado Folio OPC");
    }

    @Then("se localiza la columna original")
    public void confirmarColumnaOriginal() {
        assert page.columnaLocalizada("Monto Acumulado Folio OPC");
    }

    @When("el usuario confirma que la columna ha sido renombrada a 'Monto Acumulado Folio OPC (2121)'")
    public void confirmarRenombradoColumna() {
        page.confirmarRenombradoColumna("Monto Acumulado Folio OPC (2121)");
    }

    @Then("el nombre de la columna se actualiza correctamente")
    public void validarRenombradoColumna() {
        assert page.columnaRenombrada("Monto Acumulado Folio OPC (2121)");
    }
}