package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    @FindBy(xpath = "//*[@id= 'cart_title']")
    private WebElement pageTitle;

    @FindBy(xpath = "//*[@class = 'alert alert-warning']")
    private WebElement warningAlert;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String getCardPageTitleText() {
        return pageTitle.getText();
    }

    public String getWarningAlertText() {
        return warningAlert.getText();
    }
}
