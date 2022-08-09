package tests;

import base.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.MainPage;

public class MainPageBannersTest extends BaseTest {

    @Test
    public void checkTopBanner1Link() {
        MainPage mainPage = PageFactory.initElements(getDriver(), MainPage.class);
        mainPage.clickBannerTop1();

        mainPage.checkCurrentUrl("https://www.prestashop.com/en?utm_source=v16_homeslider");
    }

    @Test
    public void checkTopBanner2Link() {
        MainPage mainPage = PageFactory.initElements(getDriver(), MainPage.class);
        mainPage.clickBannerTop2();
        mainPage.checkCurrentUrl("https://www.prestashop.com/en");
    }

    @Test
    public void checkTopBanner3Link() {
        MainPage mainPage = PageFactory.initElements(getDriver(), MainPage.class);
        mainPage.clickBannerTop3();
        mainPage.checkCurrentUrl("https://www.prestashop.com/en");
    }

    @Test
    public void checkBottomBanner1Link() {
        MainPage mainPage = PageFactory.initElements(getDriver(), MainPage.class);
        mainPage.clickBannerBottom1();
        mainPage.checkCurrentUrl("https://www.prestashop.com/en");
    }

    @Test
    public void checkBottomBanner2Link() {
        MainPage mainPage = PageFactory.initElements(getDriver(), MainPage.class);
        mainPage.clickBannerBottom2();
        mainPage.checkCurrentUrl("https://www.prestashop.com/en");
    }

    @Test
    public void checkBottomBanner3Link() {
        MainPage mainPage = PageFactory.initElements(getDriver(), MainPage.class);
        mainPage.clickBannerBottom3();
        mainPage.checkCurrentUrl("https://www.prestashop.com/en");
    }

    @Test
    public void checkBottomBanner4Link() {
        MainPage mainPage = PageFactory.initElements(getDriver(), MainPage.class);
        mainPage.clickBannerBottom4();
        mainPage.checkCurrentUrl("https://www.prestashop.com/en");
    }

    @Test
    public void checkBottomBanner5Link() {
        MainPage mainPage = PageFactory.initElements(getDriver(), MainPage.class);
        mainPage.clickBannerBottom5();
        mainPage.checkCurrentUrl("https://www.prestashop.com/en");
    }
}
