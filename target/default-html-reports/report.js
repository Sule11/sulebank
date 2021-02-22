$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/AddNewPayee.feature");
formatter.feature({
  "name": "Add\tnew\tpayee under\tpay\tbills",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add a new payee",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user logged in to the website successfully",
  "keyword": "Given "
});
formatter.match({
  "location": "com.sulebank.step_definitions.AddNewPayeeStepDefs.the_user_logs_in_to_the_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to Add New Payee tab",
  "keyword": "When "
});
formatter.match({
  "location": "com.sulebank.step_definitions.AddNewPayeeStepDefs.add_New_Payee_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "creates\tnew\tpayee using following information",
  "rows": [
    {},
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "com.sulebank.step_definitions.AddNewPayeeStepDefs.creates_new_payee_using_following_information(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "message The new payee The Law Offices of\tHyde, Price\t\u0026 Scharks was successfully created. should\tbe\tdisplayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.sulebank.step_definitions.AddNewPayeeStepDefs.message_The_new_payee_The_Law_Offices_of_Hyde_Price_Scharks_was_successfully_created_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});