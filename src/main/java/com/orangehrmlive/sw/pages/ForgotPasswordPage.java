package com.orangehrmlive.sw.pages;


import com.aventstack.extentreports.Status;
import com.orangehrmlive.sw.customlisteners.CustomListeners;
import com.orangehrmlive.sw.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;


public class ForgotPasswordPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/p[1]")
    WebElement forgotPassword;

    //By forgotPassword = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/p[1]");
    @CacheLookup
    @FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/form[1]/h6[1]")
    WebElement textMessage;

    //By textMessage =By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/form[1]/h6[1]");

    public void clickOnForgotPassword() {
        Reporter.log("Enter forgot password"+forgotPassword);
        clickOnElement(forgotPassword);
        CustomListeners.test.log(Status.PASS,"Forgot pass word\"");
    }

    public String verifyTextMessage() {
        String message = getTextFromElement(textMessage);
        return message;
       // verifyTextFromElements((By) textMessage,"Reset Password");
      //  Reporter.log("Verify text"+textMessage);
       // verifyTextFromElements(textMessage, "Reset Password");
       // CustomListeners.test.log(Status.PASS,"Reset Password\"");
    }
/* public String verifyTextMessage() {
        String message=getTextFromElement(textMessage);
        return message;*/


}
