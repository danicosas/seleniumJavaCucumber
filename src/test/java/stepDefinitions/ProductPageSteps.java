package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import enums.Context;
import pageObjects.ProductListingPage;

public class ProductPageSteps {

    TestContext testContext;
    ProductListingPage productListingPage;

    public ProductPageSteps(TestContext context) {
        testContext = context;
        productListingPage = testContext.getPageObjectManager().getProductListingPage();
    }

    @When("^click at the first item$")
    public void click_at_the_first_item() {
        String productName = productListingPage.getProductName(0);
        testContext.scenarioContext.setContext(Context.PRODUCT_NAME, productName);
        productListingPage.select_Product(0);
    }
}