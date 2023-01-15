package org.example.Page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Base.Common;
import org.example.Utility.ExelReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class HomePage extends Common {
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    Logger Log = LogManager.getLogger();
    @FindBy(xpath = "//*[@class='cart-label']")
    WebElement FieldShoppingCart;
    @FindBy(xpath = "//*[@class='count']")
    WebElement FieldTextShoppingCart;
    @FindBy(xpath = "//*[@class='wishlist-label']")
    WebElement FieldWishList;
    @FindBy(xpath = "//*[@class='page-title']/h1")
    WebElement FieldTextWishlist;
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement Fieldregister;
    @FindBy(xpath = "//*[@type='radio']")
    List<WebElement> FieldMaleFemale;
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement FieldFirstName;
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement FieldLastName;
    @FindBy(xpath = "//input[@id='Email']")
    WebElement FieldEmail;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]")
    WebElement FieldDay;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]")
    WebElement FieldMonth;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]")
    WebElement FieldYear;
    @FindBy(xpath = "//input[@id='Newsletter']")
    WebElement FieldNewsLetter;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement FieldPasswordRegister;
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement FieldConfirmPasswordRegister;
    @FindBy(xpath = "//*[@class='ico-login']")
    WebElement FieldLogin;
    @FindBy(xpath = "//*[@id='Email']")
    WebElement EmailLogin;
    @FindBy(xpath = "//*[@id='Password']")
    WebElement PasswordLogin;
    @FindBy(xpath = "//*[@class='button-1 login-button']")
    WebElement Login;
    @FindBy(xpath = "//*[@id='customerCurrency']")
    WebElement FieldSelectMoney;
    @FindBy(xpath = "//*[@class='field-validation-error']")
    WebElement FieldErrorEmailMessageLogin;
    @FindBy(xpath = "//*[@class='field-validation-error']")
    WebElement FieldWrongEmailMessageLogin;
    @FindBy(xpath = "//*[@class='message-error validation-summary-errors']")
    WebElement FieldErrorMessageLogin;
    @FindBy(xpath = "//button[contains(text(),'Search')]")
    WebElement FieldSearchBTN;
    @FindBy(xpath = "//input[@id='small-searchterms']")
    WebElement FieldSearch;
    @FindBy(xpath = "//*[@id='main-product-img-4']")
    WebElement FieldPictureApple;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[7]/a[1]")
    WebElement FieldGiftCards;
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement FieldPosition;
    @FindBy(xpath = "//select[@id='products-pagesize']")
    WebElement FieldPerPage;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/button[1]")
    WebElement FieldAddToCardGift;
    @FindBy(css = "#giftcard_45_SenderName")
    WebElement FieldYourName;
    @FindBy(xpath = "//*[@id='add-to-cart-button-45']")
    WebElement FieldAddToCardGiftConfirm;
    @FindBy(xpath = "//span[contains(text(),'(1)')]")
    WebElement FieldNumberShoppingCart;
    @FindBy(css = "#giftcard_45_RecipientName")
    WebElement FieldRecipientsName;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[3]/a[1]")
    WebElement FieldApparel;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")
    WebElement FieldShoes;
    @FindBy(xpath = "//*[@type='checkbox']")
    List<WebElement> FieldColor;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement FieldRedShoes;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[6]/a[1]")
    WebElement FieldJewelry;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[5]/a[1]")
    WebElement FieldBooks;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[4]/a[1]")
    WebElement FieldDigitalDownloads;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/a[1]")
    WebElement FieldElectronics;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement FieldComputers;
    @FindBy(xpath = "//strong[contains(text(),'Information')]")
    WebElement FieldInformation;
    @FindBy(xpath = "//a[contains(text(),'Sitemap')]")
    WebElement FieldSitemap;
    @FindBy(xpath = "//a[contains(text(),'Shipping & returns')]")
    WebElement FieldShippingAndReturns;
    @FindBy(xpath = "//a[contains(text(),'Privacy notice')]")
    WebElement FieldPrivacyNotice;
    @FindBy(xpath = "//a[contains(text(),'Conditions of Use')]")
    WebElement FieldConditionOfUse;
    @FindBy(xpath = "//a[contains(text(),'About us')]")
    WebElement FieldAboutUs;
    @FindBy(xpath = "//a[contains(text(),'Contact us')]")
    WebElement FieldContactUs;
    @FindBy(xpath = "//input[@type='radio']")
    List<WebElement> FieldGoodButton;
    @FindBy(xpath = "//button[@id='vote-poll-1']")
    WebElement FieldVote;
    @FindBy(xpath = "//div[@id='block-poll-vote-error-1']")
    WebElement FieldErrorVote;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement FieldDeskTops;
    @FindBy(xpath = "//a[contains(text(),'Build your own computer')]")
    WebElement FieldBuildYourOwnComputer;
    @FindBy(xpath = "//body/div[6]/div[1]/div[2]/div[1]")
    WebElement FieldTitle;



    public void ShoppingCartIsDisplayed() {
        isDisplayed(FieldShoppingCart);
        Assert.assertTrue(isDisplayed(FieldShoppingCart));
        Log.info("field shopping cart is displayed");

    }

    public void HoverOverShoppingCart(WebDriver driver1) {
        hoverOver(driver1, FieldShoppingCart);
        Log.info("hover over success");
    }

    public String GetTextShoppingCart() {
        return getWebElementText(FieldTextShoppingCart);

    }

    public void WhishListIsDisplayed() {
        isDisplayed(FieldWishList);
        Assert.assertTrue(isDisplayed(FieldWishList));
        Log.info("field wishlist is displayed");
    }

    public void ClickOnWishlist() {
        clickOn(FieldWishList);
        Log.info("click on field wishlist success");
    }

    public String GetTextWishlist() {
        return getWebElementText(FieldTextWishlist);
    }

    public void RegisterIsDisplayed() {
        isDisplayed(Fieldregister);
        Assert.assertTrue(isDisplayed(Fieldregister));
        Log.info("Field register is displayed");
    }

    public void ClickOnRegister() {
        clickOn(Fieldregister);
        Log.info("register is clicked");
    }

    public void Gender() {
        for (WebElement FIELDMALEFEMALE : FieldMaleFemale) {
            if (FIELDMALEFEMALE.getAttribute("value").equalsIgnoreCase("M")) {
                clickOn(FIELDMALEFEMALE);
                Assert.assertTrue(FIELDMALEFEMALE.isSelected());
                Log.info("Male is clicked");
            }
        }

    }

    public void TypeFirstName() {
        ExelReader exelReader = new ExelReader();
        String firstname = exelReader.getDataFromCell(9, 1);
        type(FieldFirstName, firstname);
        Log.info("first name is typed");
    }

    public void TypeLastName() {
        ExelReader exelReader = new ExelReader();
        String lastname = exelReader.getDataFromCell(9, 0);
        type(FieldLastName, lastname);
        Log.info("last name is typed");
    }

    public void TypeEmail() {
        ExelReader exelReader = new ExelReader();
        String email = exelReader.getDataFromCell(10, 1);
        type(FieldEmail, email);
        Log.info("email is typed");
    }

    public void SelectDateOfBirth() {
        selectFromDropdown(FieldDay, "25");
        Log.info("25 is selected");
        selectFromDropdown(FieldMonth, "July");
        Log.info("july is selected");
        selectFromDropdown(FieldYear, "1992");
        Log.info("1992 is selected");
    }

    public void ClickOnNewsLetter() {
        clickOn(FieldNewsLetter);
        Log.info("newsletter is clicked");
    }

    public void TypePassWordRegister() {
        ExelReader exelReader = new ExelReader();
        String password = exelReader.getDataFromCell(11, 1);
        type(FieldPasswordRegister, password);
        Log.info("password is typed");
    }

    public void TypePassWordConfirmRegister() {
        ExelReader exelReader = new ExelReader();
        String confimpassword = exelReader.getDataFromCell(11, 1);
        type(FieldConfirmPasswordRegister, confimpassword);
        Log.info("confirm password is typed");
    }

    public void Login(WebDriver driver) {
        isDisplayed(FieldLogin);
        Assert.assertTrue(isDisplayed(FieldLogin));
        Log.info("field login is displayed");
        clickOn(FieldLogin);
        Log.info("click on login success");
        getPageUrl(driver);
        String expected = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        Assert.assertEquals(expected, getPageUrl(driver));
        Log.info("url login page success");
        type(EmailLogin, username);
        Log.info("email is typed successfully");
        type(PasswordLogin, password);
        Log.info("password is typed successfully");
        clickOn(Login);
        Log.info("login on home page success");

    }

    public void FieldSelectBTN() {
        isDisplayed(FieldSelectMoney);
        Assert.assertTrue(isDisplayed(FieldSelectMoney));

    }

    public void SelectEURO(String money) {

        selectFromDropdown(FieldSelectMoney, money);
    }

    public void FieldLoginIsDisplayed() {
        isDisplayed(FieldLogin);
        Assert.assertTrue(isDisplayed(FieldLogin));
        Log.info("field login is displayed");
    }

    public void ClickOnLogin() {
        clickOn(FieldLogin);
        Log.info("click on login success");
    }

    public void GetUrlLogin(WebDriver driver) {
        getPageUrl(driver);
        String expected = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        Assert.assertEquals(expected, getPageUrl(driver));
        Log.info("url login page success");
    }

    public void TypeEmailLogin(String EmailToLogin) {
        type(EmailLogin, EmailToLogin);
    }

    public void TypePasswordLogin(String PasswordToLogin) {
        type(PasswordLogin, PasswordToLogin);

    }

    public void ClickOnToLogin() {
        clickOn(Login);

    }

    public String GetErrorEmailMessageToLogin() {
        return getWebElementText(FieldErrorEmailMessageLogin);
    }

    public String GetWrongMessageToLogin() {
        return getWebElementText(FieldWrongEmailMessageLogin);
    }

    public String GetErrorMessageToLogin() {
        return getWebElementText(FieldErrorMessageLogin);
    }

    public void SearchBTNisDisplayed() {
        isDisplayed(FieldSearchBTN);
        Assert.assertTrue(isDisplayed(FieldSearchBTN));
        Log.info("search button is displayed");
    }

    public void Search(String type) {
        type(FieldSearch, type);
    }

    public void ClickOnSearchBTN() {
        clickOn(FieldSearchBTN);
    }

    public void DropDown(String Apple) throws InterruptedException {
        type(FieldSearch, Apple);
        Thread.sleep(3000);
        FieldSearch.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
    }

    public void PictureAppleIsDisplayed() {
        isDisplayed(FieldPictureApple);
        Assert.assertTrue(isDisplayed(FieldPictureApple));
        Log.info("picture Apple MacBook Pro 13-inch is displayed");
    }

    public void GiftCardsIsDisplayed() {
        isDisplayed(FieldGiftCards);
        Assert.assertTrue(isDisplayed(FieldGiftCards));
        Log.info("gift cards is displayed");
    }

    public void ClickOnGiftCards() {
        clickOn(FieldGiftCards);
        Log.info("Gift Cards is clicked");
    }

    public void SelectPosition(String position) {
        selectFromDropdown(FieldPosition, position);
    }

    public void SelectPerPage(String perpage) {
        selectFromDropdown(FieldPerPage, perpage);
    }

    public void ClickOnAddToCartGift() {
        clickOn(FieldAddToCardGift);
        Log.info("click on add to cart gift success");
    }

    public void TypeRecipientsName(String name) {
        type(FieldRecipientsName, name);
    }

    public void TypeYourName(String yourname) {
        type(FieldYourName, yourname);
    }

    public void ClickOnAddToCartConfirm() {
        clickOn(FieldAddToCardGiftConfirm);
        Log.info("Add to Cart is clicked");
    }

    public String NumberShoppingCart() {
        return getWebElementText(FieldNumberShoppingCart);
    }

    public boolean ApparelIsDisplayed() {
        return isDisplayed(FieldApparel);
    }

    public void HoverOverApparel(WebDriver driver) {
        hoverOver(driver, FieldApparel);
    }

    public void ClickOnShoes() {
        clickOn(FieldShoes);
    }

    public void CheckBoxColor() {
        for (WebElement FIELDCOLOR : FieldColor) {
            if (FIELDCOLOR.getAttribute("id").equalsIgnoreCase("attribute-option-15")) {
                clickOn(FIELDCOLOR);
                Assert.assertTrue(FIELDCOLOR.isSelected());
                Log.info("red color is selected");
            }
        }
    }

    public boolean RedShoesIsDisplayed() {
        return isDisplayed(FieldRedShoes);

    }

    public boolean JewelryIsDisplayed() {
        return isDisplayed(FieldJewelry);
    }

    public boolean BooksIsDisplayed() {
        return isDisplayed(FieldBooks);
    }

    public boolean DigitalDownloadsIsDisplayed() {
        return isDisplayed(FieldDigitalDownloads);
    }

    public boolean ElectronicsIsDisplayed() {
        return isDisplayed(FieldElectronics);
    }

    public boolean ComputersIsDisplayed() {
        return isDisplayed(FieldComputers);
    }

    public String ComputersGetText() {
        return getWebElementText(FieldComputers);
    }

    public String BooksGetText() {
        return getWebElementText(FieldBooks);
    }

    public String ElectronicsGetText() {
        return getWebElementText(FieldElectronics);
    }

    public String ApparelGetText() {
        return getWebElementText(FieldApparel);
    }

    public String JewelryGetText() {
        return getWebElementText(FieldJewelry);
    }

    public String DigitalDownloadsGetText() {
        return getWebElementText(FieldDigitalDownloads);
    }

    public String GiftCardsGetText() {
        return getWebElementText(FieldGiftCards);
    }

    public boolean InformationIsDisplayed() {
        return isDisplayed(FieldInformation);
    }

    public boolean SitemapIsDisplayed() {
        return isDisplayed(FieldSitemap);
    }

    public boolean ShippingAndReturnsIsDisplayed() {
        return isDisplayed(FieldShippingAndReturns);
    }

    public boolean PrivacyNoticeIsDisplayed() {
        return isDisplayed(FieldPrivacyNotice);
    }

    public boolean ConditionsOfUseIsDisplayed() {
        return isDisplayed(FieldConditionOfUse);
    }

    public boolean AboutUsIsDisplayed() {
        return isDisplayed(FieldAboutUs);
    }

    public boolean ContactUsIsDisplayed() {
        return isDisplayed(FieldContactUs);
    }
    public String InformationGetText() {
        return getWebElementText(FieldInformation);
    }

    public String SitemapGetText() {
        return getWebElementText(FieldSitemap);
    }

    public String ShippingAndReturnsGetText() {
        return getWebElementText(FieldShippingAndReturns);
    }

    public String PrivacyNoticeGetText() {
        return getWebElementText(FieldPrivacyNotice);
    }

    public String ConditionsOfUseGetText() {
        return getWebElementText(FieldConditionOfUse);
    }

    public String AboutUsGetText() {
        return getWebElementText(FieldAboutUs);
    }

    public String ContactUsGetText() {
        return getWebElementText(FieldContactUs);
    }

    public void SelectGoodButtonVote() {
        for (WebElement fi: FieldGoodButton ) {
            if (fi.getAttribute("value").equalsIgnoreCase("2")){
                fi.click();
            }
        }
    }
    public void ClickOnVote(){
         clickOn(FieldVote);
    }
    public String ErrorVote(){
        return getWebElementText(FieldErrorVote);
    }
    public void HoverOverComputers(WebDriver driver){
        hoverOver(driver,FieldComputers);
    }
    public void ClickOnDesktops(){
      clickOn(FieldDeskTops);
    }
   public boolean DesktopsIsDisplayed(){
        return isDisplayed(FieldBuildYourOwnComputer);
   }
   public void ClickOnTitle(){
        clickOn(FieldTitle);

   }
}
