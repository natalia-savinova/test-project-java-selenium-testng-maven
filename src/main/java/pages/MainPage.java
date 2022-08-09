package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertEquals;

public class MainPage extends BasePage{

    @FindBy(xpath = "//*[@id = 'contact-link']")
    private WebElement contactUsLink;

    @FindBy(xpath = "//*[@class = 'login']")
    private WebElement signInLink;

    @FindBy(xpath = "//*[@id= 'search_query_top']")
    private WebElement searchField;

    @FindBy(xpath = "//*[@id = 'homepage-slider']")
    private WebElement bannerTop1;

    @FindBy(xpath = "//div[@id = 'htmlcontent_top']//*[contains(@class, 'item-1')]")
    private WebElement bannerTop2;

    @FindBy(xpath = "//div[@id = 'htmlcontent_top']//*[contains(@class, 'item-2')]")
    private WebElement bannerTop3;

    @FindBy(xpath = "//div[@id = 'htmlcontent_home']//*[contains(@class, 'htmlcontent-item-1')]")
    private WebElement bannerBottom1;

    @FindBy(xpath = "//div[@id = 'htmlcontent_home']//*[contains(@class, 'htmlcontent-item-2')]")
    private WebElement bannerBottom2;

    @FindBy(xpath = "//div[@id = 'htmlcontent_home']//*[contains(@class, 'htmlcontent-item-3')]")
    private WebElement bannerBottom3;

    @FindBy(xpath = "//div[@id = 'htmlcontent_home']//*[contains(@class, 'htmlcontent-item-4')]")
    private WebElement bannerBottom4;

    @FindBy(xpath = "//div[@id = 'htmlcontent_home']//*[contains(@class, 'htmlcontent-item-5')]")
    private WebElement bannerBottom5;

    @FindBy(xpath = "//*[@title = 'About us']")
    private WebElement aboutUsLink;

    @FindBy(xpath = "//*[@class = 'shopping_cart']/*[contains(@title, 'cart')]")
    private WebElement shoppingCart;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public ContactUsPage clickContactUsLink() {
        contactUsLink.click();
        return new ContactUsPage(getDriver());
    }

    public AuthenticationPage clickSignInLink() {
        signInLink.click();
        return new AuthenticationPage(getDriver());
    }

    public SearchPage fillSearchField(String searchText) {
        searchField.sendKeys(searchText + "\n");
        return new SearchPage(getDriver());
    }

    public void clickBannerTop1() {
        bannerTop1.click();
    }
    public void clickBannerTop2() {
        bannerTop2.click();
    }
    public void clickBannerTop3() {
        bannerTop3.click();
    }

    public void clickBannerBottom1() {
        bannerBottom1.click();
    }

    public void clickBannerBottom2() {
        bannerBottom2.click();
    }

    public void clickBannerBottom3() {
        bannerBottom3.click();
    }

    public void clickBannerBottom4() {
        bannerBottom4.click();
    }

    public void clickBannerBottom5() {
        bannerBottom5.click();
    }

    public AboutUsPage clickAboutUsLink() {
        aboutUsLink.click();
        return new AboutUsPage(getDriver());
    }

    public CartPage clickShoppingCartLink() {
        shoppingCart.click();
        return new CartPage(getDriver());
    }

    public void checkCurrentUrl(String expectedLink) {
        assertEquals(getDriver().getCurrentUrl(), expectedLink, "Link is incorrect");
    }
}
