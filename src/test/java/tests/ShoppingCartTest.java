package tests;

import base.BaseTest;
import base.TestListener;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.MainPage;

import static org.testng.Assert.assertEquals;

@Listeners(TestListener.class)
public class ShoppingCartTest extends BaseTest {

    @Test
    public void checkEmptyShoppingCart() {

        CartPage cartPage = PageFactory.initElements(getDriver(), MainPage.class)
                .clickShoppingCartLink();

        assertEquals(cartPage.getWarningAlertText(), "Your shopping cart is empty.",
                "Warning Alert text is incorrect");
    }
}
