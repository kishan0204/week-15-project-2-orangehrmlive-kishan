package com.orangehrmlive.sw.pages;


import com.aventstack.extentreports.Status;
import com.orangehrmlive.sw.customlisteners.CustomListeners;
import com.orangehrmlive.sw.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;


public class LoginPage extends Utility {

    @CacheLookup
            @FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement emailIdField;
    //By emailIdField = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]");
    @CacheLookup
            @FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]")
            WebElement passwordField;
    //By passwordField = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]");
    @CacheLookup
            @FindBy(xpath="//button[normalize-space()='Login']")
    WebElement loginButton;


    //By loginButton = (By.xpath("//button[normalize-space()='Login']"));

    public void enterEmailIdField(String email){
        Reporter.log("Enter email id "+ email +"to email field"+emailIdField.toString());
        sendTextToElement(emailIdField , email);
        CustomListeners.test.log(Status.PASS,"your email id\""+email.toString());
    }
    public void enterPasswordField(String password){
        Reporter.log("Enter password"+password+"to password field"+passwordField.toString());
        sendTextToElement(passwordField, password);
        CustomListeners.test.log(Status.PASS, "Your password is \"" + password.toString() + "\"");

    }
    public void clickOnLoginButton(){
        Reporter.log("Click on loging button"+loginButton);
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS,"click\""+"\"");
    }


}
