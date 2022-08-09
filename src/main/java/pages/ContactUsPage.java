package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends BasePage{

    @FindBy(xpath = "//*[@class = 'page-heading bottom-indent']")
    private WebElement pageTitle;

    @FindBy(xpath = "//*[contains(@id, 'logo')]")
    private WebElement logo;

    @FindBy(xpath = "//*[@id = 'submitMessage']")
    private WebElement submitButton;

    @FindBy(xpath = "//*[@id = 'id_contact']")
    private WebElement subjectHeadingField;

    @FindBy(xpath = "//*[@id = 'email']")
    private WebElement emailAddressField;

    @FindBy(xpath = "//*[@id = 'id_order']")
    private WebElement orderReferenceField;

    @FindBy(xpath = "//*[@id = 'fileUpload']")
    private WebElement chooseFileButton;

    @FindBy(xpath = "//*[@id = 'message']")
    private WebElement messageField;

    @FindBy(xpath = "//*[@class = 'alert alert-success']")
    private WebElement alertSuccess;

    @FindBy(xpath = "//*[contains(@id, 'desc_contact') and @style= '']")
    private WebElement subjectHeadingComment;

    @FindBy(xpath = "//*[@class = 'alert alert-danger']/p")
    private WebElement alertDangerTitle;

    @FindBy(xpath = "//*[@class = 'alert alert-danger']/ol/li")
    private WebElement alertDanger;

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    public String getContactUsPageTitleText() {
        return pageTitle.getText();
    }

    public ContactUsPage chooseSubjectHeading(String heading) {
        subjectHeadingField.sendKeys(heading + "\n");
        return this;
    }

    public ContactUsPage fillEmailAddressField(String emailAddress) {
        emailAddressField.sendKeys(emailAddress);
        return this;
    }

    public ContactUsPage fillOrderReferenceField(String reference) {
        orderReferenceField.sendKeys(reference);
        return this;
    }

    public ContactUsPage attachFile(String absolutePathOfFile) {
        chooseFileButton.sendKeys(absolutePathOfFile);
        return this;
    }

    public ContactUsPage fillMessageField(String message) {
        messageField.sendKeys(message);
        return this;
    }

    public ContactUsPage clickSubmitButton() {
        submitButton.click();
        return this;
    }

    public String getAlertSuccessText() {
        return alertSuccess.getText();
    }

    public String getAlertDangerTitleText() {
        return alertDangerTitle.getText();
    }

    public String getAlertDangerText() {
        return alertDanger.getText();
    }

    public String getSubjectHeadingCommentText(){
        return subjectHeadingComment.getText();
    }

    public MainPage goToMainPage() {
        logo.click();
        return PageFactory.initElements(getDriver(), MainPage.class);
    }
}
