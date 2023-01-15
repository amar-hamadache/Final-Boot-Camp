package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Base.Common;
import org.example.Page.HomePage;
import org.testng.annotations.Test;

public class TestSuggestionDropDown extends Common {
    @Test
    public void SuggestionDropDow() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        Logger Log = LogManager.getLogger();
        homePage.Login(driver);
        homePage.SearchBTNisDisplayed();

        homePage.DropDown("app");
        Log.info("Apple MacBook Pro 13-inch is selected");
        homePage.PictureAppleIsDisplayed();
    }
}
