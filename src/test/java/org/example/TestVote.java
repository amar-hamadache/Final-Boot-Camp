package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Base.Common;
import org.example.Page.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVote extends Common {
    @Test
    public void vote() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        Logger Log = LogManager.getLogger();
        homePage.SelectGoodButtonVote();
        Log.info("good button is clicked");
        homePage.ClickOnVote();
        Log.info("vote is clicked success");
        Thread.sleep(3000);
        homePage.ErrorVote();
        Log.info(homePage.ErrorVote());
        Assert.assertEquals("Only registered users can vote.",homePage.ErrorVote());
        Log.info("error message is got ");
    }
}
