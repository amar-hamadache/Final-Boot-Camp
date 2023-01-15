package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Base.Common;
import org.example.Page.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginWithoutCredentials extends Common {
    @Test
    public void LoginWithoutCredentials(){
        HomePage homePage = new HomePage(driver);
        Logger Log = LogManager.getLogger();
        homePage.FieldLoginIsDisplayed();
        homePage.ClickOnLogin();
        homePage.GetUrlLogin(driver);
        homePage.TypeEmailLogin("");
        Log.info("email empty");
        homePage.TypePasswordLogin("");
        Log.info("password empty");
        homePage.ClickOnToLogin();
        Log.info("click pn button login success");
        homePage.GetErrorEmailMessageToLogin();
        Log.info(homePage.GetErrorEmailMessageToLogin());
        String expected = "Please enter your email";
        String actual   =  homePage.GetErrorEmailMessageToLogin();
        Assert.assertEquals(expected,actual);
        Log.info("error email message is displayed");
    }
}
