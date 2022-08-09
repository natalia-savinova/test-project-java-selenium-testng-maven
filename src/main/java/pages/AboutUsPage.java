package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutUsPage extends BasePage {

    @FindBy(xpath = "//*[@class= 'page-heading bottom-indent']")
    private WebElement pageTitle;

    public AboutUsPage(WebDriver driver) {
        super(driver);
    }

    public String getAboutUsPageTitleText() {
        return pageTitle.getText();
    }
}
