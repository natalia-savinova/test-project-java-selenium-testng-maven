package tests;

import base.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.AuthenticationPage;
import pages.MainPage;

import static org.testng.Assert.assertEquals;

public class AuthenticationPageTest extends BaseTest {

    @Test
    public void loginPositive() {
        AuthenticationPage authenticationPage = PageFactory.initElements(getDriver(), MainPage.class)
                .clickSignInLink()
                .fillEmailLoginField(EMAIL_FOR_LOGIN_POSITIVE).fillPasswordField(PASSWORD_POSITIVE);
        authenticationPage.clickSignInButton();

        assertEquals(authenticationPage.getAuthenticationPageTitleText(), "MY ACCOUNT",
                "Authentication page title is incorrect");
    }

    @Test
    public void loginNegative() {
        AuthenticationPage authenticationPage = PageFactory.initElements(getDriver(), MainPage.class)
                .clickSignInLink()
                .fillEmailLoginField(EMAIL_FOR_LOGIN_NEGATIVE).fillPasswordField(PASSWORD_POSITIVE);
        authenticationPage.clickSignInButton();

        assertEquals(authenticationPage.getAlertDangerTitleText(), "There is 1 error",
                "Authentication Alert Danger Title text is incorrect");
        assertEquals(authenticationPage.getAlertDangerText(), "Authentication failed.",
                "Authentication Alert Danger text is incorrect");
    }

    @Test
    public void createAccountNegative() {
        AuthenticationPage authenticationPage = PageFactory.initElements(getDriver(), MainPage.class)
                .clickSignInLink()
                .fillEmailCreateField(EMAIL_FOR_LOGIN_POSITIVE)
                .clickSubmitButton();

        assertEquals(authenticationPage.getCreateAccountErrorText(),
                "An account using this email address has already been registered. Please enter a valid password or request a new one.",
                "Create account error text is incorrect");
    }
}
