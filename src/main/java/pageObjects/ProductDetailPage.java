package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductDetailPage {
    WebDriver driver;

    public ProductDetailPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    // ELEMENTS //
    @FindBy(how = How.ID, using = "quantity")
    private WebElement select_quantity;
    @FindAll(@FindBy(how = How.XPATH, using = "//select[@id='quantity']/option"))
    private List<WebElement> optionQuantity;
    @FindBy(how = How.ID, using = "add-to-cart-button")
    private WebElement btn_addToCart;



    // METHODS //
    public String getProductPrice() {
        return (driver.findElement(By.id("priceblock_ourprice")).getText()).replace(" €", "");
    }
    public void selectQuantity(String units) {
        select_quantity.click();
        driver.findElement(By.xpath("//select[@id='quantity']/option[@value='"+units+"']")).click();
    }
    public void addToCart() {
        btn_addToCart.click();
    }


}
