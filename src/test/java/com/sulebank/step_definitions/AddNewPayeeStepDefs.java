package com.sulebank.step_definitions;

import com.sulebank.pages.BasePage;
import com.sulebank.pages.LoginPage;
import com.sulebank.pages.PayBillsPage;
import com.sulebank.utilities.BrowserUtils;
import com.sulebank.utilities.ConfigurationReader;
import com.sulebank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class AddNewPayeeStepDefs {
    PayBillsPage payBillsPage=new PayBillsPage();

    @Given("the user logged in to the website successfully")
    public void the_user_logs_in_to_the_website() {
        BasePage basePage=new PayBillsPage();
        basePage.logIntoWebsite();

    }


    @When("user navigates to Add New Payee tab")
    public void add_New_Payee_tab() {
        BrowserUtils.waitFor(2);
        payBillsPage.PayBillsTab.click();
        BrowserUtils.waitFor(2);
        payBillsPage.AddNewPayee.click();

    }

    @And("creates	new	payee using following information")
    public void creates_new_payee_using_following_information(Map<String,String> newPayee) {
        payBillsPage.PayeeNameInputBox.sendKeys(newPayee.get("Payee Name"));
        payBillsPage.PayeeAddressTextBox.sendKeys(newPayee.get("Payee Address"));
        payBillsPage.AccountInputBox.sendKeys(newPayee.get("Account"));
        payBillsPage.PayeeDetailsInputBox.sendKeys(newPayee.get("Payee Details"));
        payBillsPage.AddBtn.click();
        BrowserUtils.waitFor(2);
    }

    @Then("message The new payee The Law Offices of	Hyde, Price	& Scharks was successfully created. should	be	displayed")
    public void message_The_new_payee_The_Law_Offices_of_Hyde_Price_Scharks_was_successfully_created_should_be_displayed() {
        Assert.assertTrue(payBillsPage.CreatedSuccessfullyMessage.isDisplayed());

    }
}
