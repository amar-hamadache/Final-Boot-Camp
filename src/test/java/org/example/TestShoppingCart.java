package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Base.Common;
import org.example.Page.HomePage;
import org.example.Utility.ExelReader;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestShoppingCart extends Common {
    @Test
    public void ValidateTextShoppingCart(){
        Logger Log = LogManager.getLogger();
        ExelReader exelReader = new ExelReader();
        HomePage homePage = new HomePage(driver);
        homePage.ShoppingCartIsDisplayed();
        homePage.HoverOverShoppingCart(driver);
        homePage.GetTextShoppingCart();
        Log.info(homePage.GetTextShoppingCart());
        String expected = exelReader.getDataFromCell(8,1);
        String actual = homePage.GetTextShoppingCart();
        Assert.assertEquals(expected,actual);
        Log.info("text shopping cart is displayed");

    }
}
