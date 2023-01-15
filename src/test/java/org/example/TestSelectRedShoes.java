package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Base.Common;
import org.example.Page.HomePage;
import org.example.Utility.ExelReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelectRedShoes extends Common {
    @Test
    public void SelectRedShoes(){
        Logger Log = LogManager.getLogger();
        HomePage homePage = new HomePage(driver);
        homePage.ApparelIsDisplayed();
        Assert.assertTrue(homePage.ApparelIsDisplayed());
        Log.info("Apparel is displayed");
        homePage.HoverOverApparel(driver);
        Log.info("hover over Apparel success");
        homePage.ClickOnShoes();
        Log.info("shoes clicked success");
        homePage.CheckBoxColor();
        homePage.RedShoesIsDisplayed();
        Assert.assertTrue(homePage.RedShoesIsDisplayed());
        Log.info("red shoes is displayed");

    }

}
