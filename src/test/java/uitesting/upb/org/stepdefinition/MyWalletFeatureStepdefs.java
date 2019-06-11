package uitesting.upb.org.stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uitesting.upb.org.handlewebsite.LoadPage;
import uitesting.upb.org.managepage.MyWallet.CrearWallet;

public class MyWalletFeatureStepdefs {
    private CrearWallet crearWallet;

    public Header header;
    private AccountHandle accountHandle;
    private CreateTuCuenta creaTuCuenta;

    @Given("^Localhost page is loaded$")
    public void localhostPageIsLoaded() {
        header = LoadPage.loadGoogleWallet();
    }

    @And("^New Account is Created$")
    public void newAccountIsCreated() throws InterruptedException {
        crearWallet.AddNewWallet("Ahorros");
    }

    @Then("^Click on the new account that was created$")
    public void clickOnTheNewAccountThatWasCreated() throws InterruptedException {
        crearWallet.ClickNavBar();
        Thread.sleep(1000);
        crearWallet.ClickAccount();
    }

    @Then("^Ingreso Button is visible$")
    public void ingresoButtonIsVisible() {
        boolean isIngresoButtonVisible = crearWallet.isIngresoButtonVisible();
        Assert.assertTrue(isIngresoButtonVisible);
    }

    @And("^click 'Menu' button on 'Header' page$")
    public void clickMenuButtonOnHeaderPage() {
        accountHandle = header.clickMenuButtonn();
    }

    @And("^click '\\+CUENTA' button on 'Account Handle' page$")
    public void clickCUENTAButtonOnAccountHandlePage() {
        creaTuCuenta = accountHandle.clickPlusAccount();
    }

    @When("^the 'Crea Tu Cuenta ' page is loaded$")
    public void theCreaTuCuentaPageIsLoaded() {
        boolean isCreateTuCuentaPageLoaded = creaTuCuenta.isCreateTuCuentaPageLoaded();

        Assert.assertTrue(isCreateTuCuentaPageLoaded);
    }

    @And("^fill \"([^\"]*)\" 'Nombre de Cuenta' textfield on 'Crea Tu Cuenta' page$")
    public void fillNombreDeCuentaTextfieldOnCreaTuCuentaPage(String nombreDeCuenta) throws Throwable {
        creaTuCuenta = creaTuCuenta.fillCreaTuCuentaTextfield(creaTuCuenta);
    }

    @And("^click 'Crear Cuenta' button on 'Crea Tu Cuenta' page$")
    public void clickVolverButtonOnCreaTuCuentaPage() {
        creaTuCuenta.clickCrearCuentaButton();
    }
}
