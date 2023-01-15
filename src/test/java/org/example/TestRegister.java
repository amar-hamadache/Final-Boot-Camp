package org.example;

import org.example.Base.Common;
import org.example.Page.HomePage;
import org.testng.annotations.Test;

public class TestRegister extends Common {
    @Test
    public void validateRegister(){
        HomePage homePage = new HomePage(driver);
        homePage.RegisterIsDisplayed();
        homePage.ClickOnRegister();
        homePage.Gender();
        homePage.TypeFirstName();
        homePage.TypeLastName();
        homePage.TypeEmail();
        homePage.SelectDateOfBirth();
        homePage.ClickOnNewsLetter();
        homePage.TypePassWordRegister();
        homePage.TypePassWordConfirmRegister();
    }
}
