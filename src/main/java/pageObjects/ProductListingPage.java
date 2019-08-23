package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import selenium.Wait;

import java.util.List;

public class ProductListingPage {
    WebDriver driver;

    public ProductListingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    // ELEMENTS //
    @FindAll(@FindBy(how = How.XPATH, using = "//span[contains(@class, 'a-size-medium a-color-base a-text-normal')]"))
    private List<WebElement> prd_List;


    // METHODS //
    public String getProductName(int productNumber) {
        return prd_List.get(productNumber).getText();
    }
    public void select_Product(int productNumber) {
        prd_List.get(productNumber).click();
        Wait.untilJqueryIsDone(driver);
    }

}