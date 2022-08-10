package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.MainPage;

import static org.testng.Assert.assertEquals;

public class ContactUsPageTest extends BaseTest{

    @Test
    public void fillAllFieldsPositive() {
        ContactUsPage contactUsPage = new MainPage(getDriver())
                .clickContactUsLink()
                .chooseSubjectHeading("Customer service")
                .fillEmailAddressField("1@automationpractice.te")
                .fillOrderReferenceField("123-AB")
                .attachFile("C:\\Users\\QATester\\IdeaProjects\\test-project-java-selenium-testng-maven\\resources\\test.txt")
                .fillMessageField("Test")
                .clickSubmitButton();

        assertEquals(contactUsPage.getAlertSuccessText(), "Your message has been successfully sent to our team.",
                "Alert text is incorrect");
    }

    @Test
    public void checkSubjectHeadingCommentText() {
        ContactUsPage contactUsPage = new MainPage(getDriver())
                .clickContactUsLink()
                .chooseSubjectHeading("Customer service");

        assertEquals(contactUsPage.getSubjectHeadingCommentText(), "For any question about a product, an order",
                "Subject heading comment Customer service text is incorrect");

        contactUsPage.chooseSubjectHeading("Webmaster");

        assertEquals(contactUsPage.getSubjectHeadingCommentText(), "If a technical problem occurs on this website",
                "Subject heading comment Webmaster text is incorrect");
    }

    @Test
    public void sendEmptyFormNegative() {
        ContactUsPage contactUsPage = new MainPage(getDriver())
                .clickContactUsLink()
                .clickSubmitButton();

        assertEquals(contactUsPage.getAlertDangerTitleText(), "There is 1 error",
                "Contact us Alert Danger Title text is incorrect");
        assertEquals(contactUsPage.getAlertDangerText(), "Invalid email address.",
                "Contact us Alert Danger text is incorrect");
    }

    @Test
    public void checkLogoLink() {
        ContactUsPage contactUsPage = new MainPage(getDriver())
                .clickContactUsLink();

        MainPage mainPage = contactUsPage.goToMainPage();

        mainPage.checkCurrentUrl("http://automationpractice.com/index.php");
    }
}
