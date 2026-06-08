package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    By searchBox = By.name("search");
    By searchButton = By.xpath("//button[@class='btn btn-default btn-lg']");

    public void searchProduct(String productName) {
        driver.findElement(searchBox).sendKeys(productName);
        driver.findElement(searchButton).click();
    }

    public boolean isProductDisplayed(String productName) {
        return driver.getPageSource().contains(productName);
    }
}