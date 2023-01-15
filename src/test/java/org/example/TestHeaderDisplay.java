package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Base.Common;
import org.example.Page.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHeaderDisplay extends Common {
    @Test
    public void HeaderIsDisplayed(){
        HomePage homePage = new HomePage(driver);
        Logger Log = LogManager.getLogger();
        homePage.Login(driver);
        homePage.GiftCardsIsDisplayed();
        homePage.JewelryIsDisplayed();
        Assert.assertTrue(homePage.JewelryIsDisplayed());
        Log.info("Jewelry is displayed");
        homePage.BooksIsDisplayed();
        Assert.assertTrue(homePage.BooksIsDisplayed());
        Log.info("books is displayed");
        homePage.DigitalDownloadsIsDisplayed();
        Assert.assertTrue(homePage.DigitalDownloadsIsDisplayed());
        Log.info("digital downloads is displayed");
        homePage.ApparelIsDisplayed();
        Assert.assertTrue(homePage.ApparelIsDisplayed());
        Log.info("Apparel is displayed");
        homePage.ElectronicsIsDisplayed();
        Assert.assertTrue(homePage.ElectronicsIsDisplayed());
        Log.info("electronics is displayed");
        homePage.ComputersIsDisplayed();
        Assert.assertTrue(homePage.ComputersIsDisplayed());
        Log.info("computers is displayed");

    }
}
