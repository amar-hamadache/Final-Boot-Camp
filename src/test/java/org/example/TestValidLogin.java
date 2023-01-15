package org.example;

import org.example.Base.Common;
import org.example.Page.HomePage;
import org.testng.annotations.Test;

public class TestValidLogin extends Common {
    @Test
    public void LoginWithValidCredentials(){
        HomePage homePage = new HomePage(driver);
        homePage.Login(driver);
    }
}
