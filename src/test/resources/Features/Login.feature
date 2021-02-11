Feature:Login function

  Background:
  Given the user is on the login page

  Scenario:Enter with valid credentials
    When the user enters valid username and password
    And clicks the login button
    Then system should login to Account Summary page

  @wip
  Scenario Outline: unauthorized user should not be able to login
    When the user enters invalid "<username>" and "<password>"
    Then error message Login and or password are wrong message is displayed

    Examples:
      | username | password  |
      | user     | password  |
      | username | password1 |
      |          | password  |
      | username |           |
      |          |           |
