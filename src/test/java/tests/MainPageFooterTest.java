package tests;

import base.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.AboutUsPage;
import pages.MainPage;

import static org.testng.Assert.assertEquals;

public class MainPageFooterTest extends BaseTest {

    @Test
    public void checkAboutUsLink() {
        AboutUsPage aboutUsPage = PageFactory.initElements(getDriver(), MainPage.class)
                .clickAboutUsLink();

        assertEquals(aboutUsPage.getAboutUsPageTitleText(), "ABOUT US", "About Us page title is incorrect");
    }


}
