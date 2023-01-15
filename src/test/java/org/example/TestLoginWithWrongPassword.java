package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Base.Common;
import org.example.Page.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginWithWrongPassword extends Common {
    @Test
    public void LoginWithWrongPassword (){
        HomePage homePage = new HomePage(driver);
        Logger Log = LogManager.getLogger();
        homePage.FieldLoginIsDisplayed();
        homePage.ClickOnLogin();
        homePage.GetUrlLogin(driver);
        homePage.TypeEmailLogin(username);
        Log.info(" email is typed success");
        homePage.TypePasswordLogin("abcd");
        Log.info("wrong password is typed ");
        homePage.ClickOnToLogin();
        Log.info("click on button login success");
        homePage.GetErrorMessageToLogin();
        Log.info(homePage.GetErrorMessageToLogin());
        String expected = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actual   =  homePage.GetErrorMessageToLogin();
        Assert.assertEquals(expected,actual);
        Log.info("error message is displayed");
    }
}
