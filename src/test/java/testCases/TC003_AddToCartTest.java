package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.AddToCartPage;

public class TC003_AddToCartTest extends BaseClass {

    @Test
    public void addToCartTest() {

        AddToCartPage cart = new AddToCartPage(driver);

        cart.searchProduct();
        cart.openProduct();
        cart.addToCart();

        Assert.assertTrue(cart.isSuccessMessageDisplayed());

        System.out.println("Add To Cart Test Passed");
    }
}