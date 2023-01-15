package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Base.Common;
import org.example.Page.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginWithWrongEmail extends Common {
    @Test
    public void LoginWithWrongEmail(){
        HomePage homePage = new HomePage(driver);
        Logger Log = LogManager.getLogger();
        homePage.FieldLoginIsDisplayed();
        homePage.ClickOnLogin();
        homePage.GetUrlLogin(driver);
        homePage.TypeEmailLogin("abcd");
        Log.info("wrong email is typed");
        homePage.TypePasswordLogin("");
        Log.info("password empty");
        homePage.ClickOnToLogin();
        Log.info("click on button login success");
        homePage.GetWrongMessageToLogin();
        Log.info(homePage.GetWrongMessageToLogin());
        String expected = "Wrong email";
        String actual   =  homePage.GetWrongMessageToLogin();
        Assert.assertEquals(expected,actual);
        Log.info("wrong email message is displayed");
    }
}
