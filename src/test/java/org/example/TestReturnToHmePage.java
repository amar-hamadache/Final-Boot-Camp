package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Base.Common;
import org.example.Page.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestReturnToHmePage extends Common {
    @Test
    public void ReturnToHomePage(){
        HomePage homePage = new HomePage(driver);
        Logger Log = LogManager.getLogger();
        homePage.Login(driver);
        homePage.GiftCardsIsDisplayed();
        homePage.ClickOnGiftCards();

        homePage.SelectPerPage("6");
        Log.info("display 6 per page selected");
        homePage.ClickOnAddToCartGift();
        homePage.TypeRecipientsName("amar");
        Log.info("amar is typed");
        homePage.TypeYourName("hamadache");
        Log.info("hamadache is typed");
        homePage.ClickOnAddToCartConfirm();
        Log.info("click to Add to cart is confirmed");
        homePage.NumberShoppingCart();
        String expected = "(1)";
        String actual = homePage.NumberShoppingCart();
        Assert.assertEquals(expected,actual);
        Log.info("1 purchase is displayed on shopping cart");
        captureScreenshot("logo");
        homePage.ClickOnTitle();
        Log.info("title is clicked success");
        getPageUrl(driver);
        Log.info(getPageUrl(driver));
        Assert.assertEquals("https://demo.nopcommerce.com/",getPageUrl(driver));
        Log.info("return to home page success");
    }
}
