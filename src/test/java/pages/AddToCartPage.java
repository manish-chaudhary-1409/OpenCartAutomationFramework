package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartPage {

    WebDriver driver;
    WebDriverWait wait;

    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By searchBox = By.name("search");
    By searchButton = By.xpath("//button[@class='btn btn-default btn-lg']");
    By productLink = By.linkText("iPhone");
    By addToCartButton = By.id("button-cart");
    By successMessage = By.cssSelector(".alert-success");

    public void searchProduct() {
        driver.findElement(searchBox).clear();
        driver.findElement(searchBox).sendKeys("iPhone");
        driver.findElement(searchButton).click();
    }

    public void openProduct() {
        wait.until(ExpectedConditions.elementToBeClickable(productLink)).click();
    }

    public void addToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();
    }

    public boolean isSuccessMessageDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage)).isDisplayed();
    }
}