package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import enums.Context;
import pageObjects.CartPage;

public class CartPageSteps {

    TestContext testContext;
    CartPage cartPage;

    public CartPageSteps(TestContext context) {
        testContext = context;
        cartPage = testContext.getPageObjectManager().getCartPage();
    }

    @Then("^check \"([^\"]*)\" units and total price$")
    public void checkUnitsAndTotalPrice(String units) throws Throwable {
        cartPage.checkUnits(units);
        cartPage.checkTotalPrice(units, (testContext.scenarioContext.getContext(Context.PRODUCT_PRICE)).toString().replace(",", "."));
    }
}