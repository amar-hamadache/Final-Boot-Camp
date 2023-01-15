package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Base.Common;
import org.example.Page.HomePage;
import org.example.Utility.ExelReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWishList extends Common {
   @Test
    public void validateTextWishlist(){
       Logger Log = LogManager.getLogger();
       HomePage homePage = new HomePage(driver);
       ExelReader exelReader = new ExelReader();
       homePage.WhishListIsDisplayed();
       homePage.ClickOnWishlist();
       homePage.GetTextWishlist();
       Log.info(exelReader.getDataFromCell(7,1));
       String expected = exelReader.getDataFromCell(7,1);
       String actual = homePage.GetTextWishlist();
       Assert.assertEquals(expected,actual);
       Log.info("wishlist text is displayed");

   }
}
