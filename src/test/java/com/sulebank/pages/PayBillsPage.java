package com.sulebank.pages;

import com.sulebank.utilities.ConfigurationReader;
import com.sulebank.utilities.Driver;
import org.jsoup.Connection;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBillsPage extends BasePage {

        @FindBy(css = "li#pay_bills_tab>a")
        public WebElement PayBillsTab;

        @FindBy(xpath = "//a[.='Add New Payee']")
        public WebElement AddNewPayee;

        @FindBy(css = "input#np_new_payee_name")
        public WebElement PayeeNameInputBox;

        @FindBy(css = "textarea#np_new_payee_address")
        public WebElement PayeeAddressTextBox;

        @FindBy(css = "input#np_new_payee_account")
        public WebElement AccountInputBox;

        @FindBy(css = "input#np_new_payee_details")
        public WebElement PayeeDetailsInputBox;

        @FindBy(css = "input#add_new_payee")
        public WebElement AddBtn;

        @FindBy(css = "div#alert_content")
        public WebElement CreatedSuccessfullyMessage;




}
