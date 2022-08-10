package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

    @FindBy(xpath = "//*[@class = 'page-heading']")
    private WebElement pageTitle;

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public String getMyAccountPageTitleText() {
        return pageTitle.getText();
    }
}
