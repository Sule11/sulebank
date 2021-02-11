package com.sulebank.step_definitions;

import com.sulebank.pages.LoginPage;
import com.sulebank.utilities.BrowserUtils;
import com.sulebank.utilities.ConfigurationReader;
import com.sulebank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {
    LoginPage loginPage=new LoginPage();



    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        loginPage.signinBtn.click();
    }

    @When("the user enters valid username and password")
    public void the_user_enters_valid_username_and_password() {
        loginPage.login();
    }

    @When("clicks the login button")
    public void clicks_the_login_button() {
       new LoginPage().loginBtn.click();
       new LoginPage().advancedBtn.click();
       new LoginPage().proceedToLink.click();
    }

    @Then("system should login to Account Summary page")
    public void system_should_login_to_Account_Summary_page() {

        BrowserUtils.waitFor(3);
        Assert.assertTrue(Driver.get().getTitle().equals("Zero - Account Summary") );
    }



    @When("the user enters invalid {string} and {string}")
    public void the_user_enters_invalid_and(String username, String password) {
        loginPage.usernameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
        loginPage.loginBtn.click();

    }

    @Then("error message Login and or password are wrong message is displayed")
    public void error_message_Login_and_or_password_are_wrong_message_is_displayed() {
        String expectedMessage="Login and/or password are wrong.";
        Assert.assertEquals(expectedMessage,loginPage.alertMessage.getText());
    }


}
