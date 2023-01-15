package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Base.Common;
import org.example.Page.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFootersInformation extends Common {
    @Test
    public void FootersInformation(){
        HomePage homePage = new HomePage(driver);
        Logger Log = LogManager.getLogger();
        homePage.Login(driver);
        homePage.InformationIsDisplayed();
        Assert.assertTrue(homePage.InformationIsDisplayed());
        Log.info("information is displayed");
        homePage.SitemapIsDisplayed();
        Assert.assertTrue(homePage.SitemapIsDisplayed());
        Log.info("sitemap is displayed");
        homePage.ShippingAndReturnsIsDisplayed();
        Assert.assertTrue(homePage.ShippingAndReturnsIsDisplayed());
        Log.info("shipping and returns is displayed");
        homePage.PrivacyNoticeIsDisplayed();
        Assert.assertTrue(homePage.PrivacyNoticeIsDisplayed());
        Log.info("privacy notice is displayed");
        homePage.ConditionsOfUseIsDisplayed();
        Assert.assertTrue(homePage.ConditionsOfUseIsDisplayed());
        Log.info("condition of us is displayed");
        homePage.AboutUsIsDisplayed();
        Assert.assertTrue(homePage.AboutUsIsDisplayed());
        Log.info("about us is displayed");
        homePage.ContactUsIsDisplayed();
        Assert.assertTrue(homePage.ContactUsIsDisplayed());
        Log.info("contact of us is displayed");
    }
}
