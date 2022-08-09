package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage extends BasePage{

    @FindBy(xpath = "//h1[@class = 'page-heading']")
    private WebElement pageTitle;

    @FindBy(xpath = "//*[@id= 'email_create']")
    private WebElement emailCreate;

    @FindBy(xpath = "//*[@id= 'SubmitCreate']")
    private WebElement submitButton;

    @FindBy(xpath = "//*[@id = 'email']")
    private WebElement emailLogin;

    @FindBy(xpath = "//*[@id = 'passwd']")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@class= 'lost_password form-group']")
    private WebElement forgotPasswordLink;

    @FindBy(xpath = "//*[@id = 'SubmitLogin']")
    private WebElement signInButton;

    @FindBy(xpath = "//*[@id= 'create_account_error']/ol/li")
    private WebElement createAccountError;

    @FindBy(xpath = "//*[@class = 'alert alert-danger']/p")
    private WebElement alertDangerTitle;

    @FindBy(xpath = "//*[@class = 'alert alert-danger']/ol/li")
    private WebElement alertDanger;

    public AuthenticationPage(WebDriver driver) {
        super(driver);
    }

    public AuthenticationPage fillEmailCreateField(String email) {
        emailCreate.sendKeys(email);
        return this;
    }

    public AuthenticationPage clickSubmitButton() {
        submitButton.click();
        return this;
    }

    public String getAuthenticationPageTitleText() {
        return pageTitle.getText();
    }

    public AuthenticationPage fillEmailLoginField(String email) {
        emailLogin.sendKeys(email);
        return this;
    }

    public AuthenticationPage fillPasswordField(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public MyAccountPage clickSignInButton() {
        signInButton.click();
        return PageFactory.initElements(getDriver(), MyAccountPage.class);
    }

    public String getCreateAccountErrorText() {
        return createAccountError.getText();
    }

    public String getAlertDangerTitleText() {
        return alertDangerTitle.getText();
    }

    public String getAlertDangerText() {
        return alertDanger.getText();
    }

}
