package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import enums.Context;
import pageObjects.ProductDetailPage;

public class ProductDetailSteps {

    TestContext testContext;
    ProductDetailPage productDetailPage;

    public ProductDetailSteps(TestContext context) {
        testContext = context;
        productDetailPage = testContext.getPageObjectManager().getProductDetailPage();
    }

    @And("^add to cart \"([^\"]*)\" units$")
    public void addToCartUnits(String units) throws Throwable {
        String productPrice = productDetailPage.getProductPrice();
        testContext.scenarioContext.setContext(Context.PRODUCT_PRICE, productPrice);

        productDetailPage.selectQuantity(units);
        productDetailPage.addToCart();
    }
}
