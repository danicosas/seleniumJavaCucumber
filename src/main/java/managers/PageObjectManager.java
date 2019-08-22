package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class PageObjectManager {
    private WebDriver driver;
    private ProductListingPage productListingPage;
    private ProductDetailPage productDetailPage;
    private CartPage cartPage;
    private HomePage homePage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage(){
        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }

    public ProductListingPage getProductListingPage() {
        return (productListingPage == null) ? productListingPage = new ProductListingPage(driver) : productListingPage;
    }

    public ProductDetailPage getProductDetailPage() {
        return (productDetailPage == null) ? productDetailPage = new ProductDetailPage(driver) : productDetailPage;
    }

    public CartPage getCartPage() {
        return (cartPage == null) ? cartPage = new CartPage(driver) : cartPage;
    }

}