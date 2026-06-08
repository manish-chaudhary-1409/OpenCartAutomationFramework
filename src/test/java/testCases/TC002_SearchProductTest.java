package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.SearchPage;

public class TC002_SearchProductTest extends BaseClass {

    @Test
    public void searchProductTest() {

        SearchPage sp = new SearchPage(driver);

        sp.searchProduct("iPhone");

        Assert.assertTrue(sp.isProductDisplayed("iPhone"));

        System.out.println("Search Product Test Passed");
    }
}