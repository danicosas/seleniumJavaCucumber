package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Integer.parseInt;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    // ELEMENTS //
    @FindBy(how = How.XPATH, using = "//span[@class='a-size-medium']/span[1]")
    private WebElement total_Products;
    @FindBy(how = How.XPATH, using = "//span[@class='a-size-medium']/span[2]/span")
    private WebElement total_Price;


    // METHODS //
    public void checkUnits(String units) {
        Assert.assertTrue(total_Products.getText().contains(Integer.toString(parseInt(units))));
    }
    public void checkTotalPrice(String units, String price) {
        double totalPrice = Double.parseDouble(units) * Double.parseDouble(price);
        Assert.assertTrue(total_Price.getText().contains(Double.toString(totalPrice).replace(".",",")));
    }

}