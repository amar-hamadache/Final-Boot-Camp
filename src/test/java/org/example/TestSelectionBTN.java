package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Base.Common;
import org.example.Page.HomePage;
import org.example.Utility.ExelReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelectionBTN extends Common {
    @Test
    public void ValidateSelectEURO(){
        Logger Log = LogManager.getLogger();
        ExelReader exelReader = new ExelReader();
        HomePage homePage = new HomePage(driver);
        homePage.Login(driver);
        homePage.FieldSelectBTN();
        Log.info("select button is displayed");
        String euro = exelReader.getDataFromCell(12,0);
        homePage.SelectEURO(euro);
        Log.info("euro money is selected");
    }
}
