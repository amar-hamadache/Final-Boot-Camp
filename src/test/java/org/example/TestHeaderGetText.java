package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Base.Common;
import org.example.Page.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHeaderGetText extends Common {
    @Test
    public void HeaderGetText(){

        HomePage homePage = new HomePage(driver);
        Logger Log = LogManager.getLogger();
        homePage.Login(driver);
        homePage.GiftCardsGetText();
        Assert.assertEquals("Gift Cards",homePage.GiftCardsGetText());
        Log.info("text gift cards is got successfully");
        homePage.JewelryGetText();
        Assert.assertEquals("Jewelry",homePage.JewelryGetText());
        Log.info("Jewelry is got successfully ");
        homePage.BooksGetText();
        Assert.assertEquals("Books",homePage.BooksGetText());
        Log.info("books is got successfully");
        homePage.DigitalDownloadsGetText();
        Assert.assertEquals("Digital downloads",homePage.DigitalDownloadsGetText());
        Log.info("digital downloads is got successfully");
        homePage.ApparelGetText();
        Assert.assertEquals("Apparel",homePage.ApparelGetText());
        Log.info("Apparel is got successfully");
        homePage.ElectronicsGetText();
        Assert.assertEquals("Electronics",homePage.ElectronicsGetText());
        Log.info("electronics is got successfully");
        homePage.ComputersGetText();
        Assert.assertEquals("Computers",homePage.ComputersGetText());
        Log.info("computers is got successfully");

    }

}
