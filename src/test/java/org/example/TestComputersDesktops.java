package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Base.Common;
import org.example.Page.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestComputersDesktops extends Common {
    @Test
    public void ComputersDesktops(){
        HomePage homePage = new HomePage(driver);
        Logger Log = LogManager.getLogger();
        homePage.Login(driver);
        homePage.HoverOverComputers(driver);
        Log.info("hover over computers success");
        homePage.ClickOnDesktops();
        Log.info("click on desktops success");
        getPageUrl(driver);
        Assert.assertEquals("https://demo.nopcommerce.com/desktops",getPageUrl(driver));
        Log.info("URL page desktops success");
        homePage.DesktopsIsDisplayed();
        Assert.assertTrue(homePage.DesktopsIsDisplayed());
        Log.info("Build your own computer is displayed");
    }
}
