package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Base.Common;
import org.example.Page.HomePage;
import org.testng.annotations.Test;

public class TestSearch extends Common {
    @Test
    public void ValidateSearch(){
        HomePage homePage = new HomePage(driver);
        Logger Log = LogManager.getLogger();
        homePage.Login(driver);
        homePage.SearchBTNisDisplayed();
        homePage.Search("computer");
        Log.info("computer is typed");
        homePage.ClickOnSearchBTN();
        Log.info("button search is clicked ");
    }
}
