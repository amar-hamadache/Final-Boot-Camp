package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Base.Common;
import org.example.Utility.ExelReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPageTile extends Common {
    @Test
    public void validatePageTitle(){
        ExelReader exelReader = new ExelReader();
        Logger Log = LogManager.getLogger();
        Log.info(exelReader.getDataFromCell(6,1));
        String expected = exelReader.getDataFromCell(6,1);
        String actual = getPageTitle();
        Assert.assertEquals(actual,expected);
        Log.info("page title validate success");
    }
}
