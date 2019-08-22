package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.HomePage;

public class HomePageSteps {

    TestContext testContext;
    HomePage homePage;

    public HomePageSteps(TestContext context) {
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
    }

    @Given("^user is on Home Page$")
    public void user_is_on_Home_Page(){
        homePage.navigateTo_HomePage();
    }

    @When("^search for \"([^\"]*)\"$")
    public void he_search_for(String product)  {
        homePage.perform_Search(product);
    }

    @And("^go to the cart$")
    public void goToTheCart() {
        homePage.goToTheCart();
    }
}