package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;
import selenium.Wait;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    // ELEMENTS //
    @FindBy(how = How.ID, using = "twotabsearchtextbox")
    private WebElement input_Search;
    @FindBy(how = How.CLASS_NAME, using = "nav-input")
    private WebElement btn_Search;
    @FindBy(how = How.ID, using = "nav-cart")
    private WebElement btn_Cart;

    // METHODS //
    public void navigateTo_HomePage() {
        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
    }
    public void perform_Search(String search) {
        input_Search.sendKeys(search);
        btn_Search.click();
    }
    public void goToTheCart() {
        btn_Cart.click();
    }
}