package tests;

import base.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class MainPageHeaderTest extends BaseTest {

    @Test
    public void checkContactUsLink() {
        ContactUsPage contactUsPage = PageFactory.initElements(getDriver(), MainPage.class)
                .clickContactUsLink();

        assertEquals(contactUsPage.getContactUsPageTitleText(), "CUSTOMER SERVICE - CONTACT US",
                "Contact Us page title is incorrect");
    }

    @Test
    public void checkSignInLink() {
        AuthenticationPage authenticationPage = PageFactory.initElements(getDriver(), MainPage.class)
                .clickSignInLink();

        assertEquals(authenticationPage.getAuthenticationPageTitleText(), "AUTHENTICATION",
                "Authentication page title is incorrect");
    }

    @Test
    public void checkSearchField() {
        SearchPage searchPage = PageFactory.initElements(getDriver(), MainPage.class)
                .fillSearchField("Test");

        assertEquals(searchPage.getSearchPageTitleText(), "SEARCH \n" +
                "0 results have been found.", "Search page title is incorrect");

        assertEquals(searchPage.getSearchAlertText(), "No results were found for your search \"Test\"",
                "Search page alert is incorrect");
    }

    @Test
    public void checkSearchFieldPositive() {
        SearchPage searchPage = PageFactory.initElements(getDriver(), MainPage.class)
                .fillSearchField("T-shirts");

        assertEquals(searchPage.getSearchPageTitleText(), "SEARCH  \"T-SHIRTS\"\n" +
                        "1 result has been found.",
                "Search page title is incorrect");

        assertTrue(searchPage.getSearchResultText().contains("T-shirts"), "Search page alert is incorrect");
    }

    @Test
    public void checkEmptyShoppingCart() {
        CartPage cartPage = PageFactory.initElements(getDriver(), MainPage.class)
                .clickShoppingCartLink();

        assertEquals(cartPage.getCardPageTitleText(), "SHOPPING-CART SUMMARY", "Card page title is incorrect");
    }
}
