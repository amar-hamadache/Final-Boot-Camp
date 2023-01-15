package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Base.Common;
import org.example.Page.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFootersInformationGetText extends Common {
    @Test
    public void FootersInformationGetText(){
        HomePage homePage = new HomePage(driver);
        Logger Log = LogManager.getLogger();
        homePage.Login(driver);
        homePage.InformationGetText();
        Assert.assertEquals("Information",homePage.InformationGetText());
        Log.info("Information is got success ");
        homePage.SitemapGetText();
        Assert.assertEquals("Sitemap",homePage.SitemapGetText());
        Log.info("sitemap is got success");
        homePage.ShippingAndReturnsGetText();
        Assert.assertEquals("Shipping & returns",homePage.ShippingAndReturnsGetText());
        Log.info("shipping & returns is got success");
        homePage.PrivacyNoticeGetText();
        Assert.assertEquals("Privacy notice",homePage.PrivacyNoticeGetText());
        Log.info("Privacy notice is got success");
        homePage.ConditionsOfUseGetText();
        Assert.assertEquals("Conditions of Use",homePage.ConditionsOfUseGetText());
        Log.info("conditions of Use is got success");
        homePage.AboutUsGetText();
        Assert.assertEquals("About us",homePage.AboutUsGetText());
        Log.info("About Us is got success");
        homePage.ContactUsGetText();
        Assert.assertEquals("Contact us",homePage.ContactUsGetText());
        Log.info("Contact Us is got success");
    }
}
