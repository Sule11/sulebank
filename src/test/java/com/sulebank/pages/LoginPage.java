package com.sulebank.pages;

import com.sulebank.utilities.BrowserUtils;
import com.sulebank.utilities.ConfigurationReader;
import com.sulebank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "button#signin_button")
    public WebElement signinBtn;

    @FindBy(css = "input#user_login")
    public WebElement usernameInput;

    @FindBy(css = "input#user_password")
    public WebElement passwordInput;

@FindBy(xpath = "//input[@name='submit']")
public WebElement loginBtn;

@FindBy(css = "button#details-button")
public WebElement advancedBtn;

@FindBy(css = "a#proceed-link")
public WebElement proceedToLink;

@FindBy(xpath = "//div[@class='alert alert-error']")
public WebElement alertMessage;

    public void login() {
        BrowserUtils.waitFor(3);
        usernameInput.sendKeys(ConfigurationReader.get("username"));
        passwordInput.sendKeys(ConfigurationReader.get("password"));


    }
}
