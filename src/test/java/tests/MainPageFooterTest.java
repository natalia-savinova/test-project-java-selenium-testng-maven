package tests;

import base.BaseTest;
import base.TestListener;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.AboutUsPage;
import pages.MainPage;

import static org.testng.Assert.assertEquals;

@Listeners(TestListener.class)
public class MainPageFooterTest extends BaseTest {

    @Test
    public void checkAboutUsLink() {
        AboutUsPage aboutUsPage = PageFactory.initElements(getDriver(), MainPage.class)
                .clickAboutUsLink();

        assertEquals(aboutUsPage.getAboutUsPageTitleText(), "ABOUT US", "About Us page title is incorrect");
    }
}
