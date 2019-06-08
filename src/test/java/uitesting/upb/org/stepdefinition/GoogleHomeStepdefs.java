package uitesting.upb.org.stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import uitesting.upb.org.handlewebsite.LoadPage;
import uitesting.upb.org.managepage.google.home.Home;

public class GoogleHomeStepdefs {
    private Home home;
    @Given("^Google page is loaded$")
    public void googlePageIsLoaded() {
        home = LoadPage.loadGoogleHome();
    }

    @Then("^the 'Search' field is visible$")
    public void theSearchFieldIsVisible() {
        boolean isSearchFieldVisible = home.isSearchFieldVisible();

        Assert.assertTrue(isSearchFieldVisible);
    }
}
