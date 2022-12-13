package com.orangehrmlive.sw.testsuite;


import com.orangehrmlive.sw.customlisteners.CustomListeners;
import com.orangehrmlive.sw.pages.ForgotPasswordPage;
import com.orangehrmlive.sw.pages.LoginPage;
import com.orangehrmlive.sw.testbase.BaseTest;
import com.orangehrmlive.sw.utility.Utility;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {
    ForgotPasswordPage forgotPasswordPage;
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        forgotPasswordPage = new ForgotPasswordPage();
        loginPage = new LoginPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        loginPage.enterEmailIdField("Admin");
        loginPage.enterPasswordField("admin123");
        loginPage.clickOnLoginButton();
    }

    @Test(groups =  { "smoke" , "regression"})
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        forgotPasswordPage.clickOnForgotPassword();
        forgotPasswordPage.verifyTextMessage();

    }
}