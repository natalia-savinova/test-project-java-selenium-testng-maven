package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{

    @FindBy(xpath = "//*[contains(@class, 'page-heading')]")
    private WebElement pageTitle;

    @FindBy(xpath = "//*[@class ='alert alert-warning']")
    private WebElement alert;

    @FindBy(xpath = "//div[@class = 'product-container']//*[@class = 'product-name']")
    private WebElement searchResult;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public String getSearchPageTitleText() {
        return pageTitle.getText();
    }

    public String getSearchAlertText() {
        return alert.getText();
    }

    public String getSearchResultText() {
        return searchResult.getText();
    }

}
