package com.sulebank.pages;

import com.sulebank.utilities.BrowserUtils;
import com.sulebank.utilities.ConfigurationReader;
import com.sulebank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void logIntoWebsite(){
        Driver.get().get(ConfigurationReader.get("url"));
        new LoginPage().signinBtn.click();
        new LoginPage().login();
        new LoginPage().loginBtn.click();
        new LoginPage().advancedBtn.click();
        new LoginPage().proceedToLink.click();
    }

}
