@KiwiSaverCalculator
Feature: To verify the addition of bank account into organization

  @smoke @regression @prod
  Scenario Outline: Xero User adds ANZ bank account inside his organisation
    Given I launch browser "<Browser>" and access Xero site
    Given I am on login page
    Given I enter "<EmailAddress>" and "<Password>" and press login button
    And I check Authentication Selection page is opened
    When I choose a backup method instead
    And I check Authentication type page is opened
    When I click on security questions option
    And I check Security questionnarie page is opened
    When I answer the security questions and click on Confirm button
    And I check home page is displayed
    When I hover over "<NavigationOption>" and choose "<Accounting Option>"
    And I check Bank Account page is opened and Add Bank Account button is displayed
    When I click on Add Bank Account button
    And I check Add Bank Account page is opened
    Then I select "<BankName>"
    And I check Bank Account details page is opened
    Then I enter "<Account Name>", "<Account number>" and choose "<Account type>"
    Then I log out from the application

    Examples: 
      | Browser | NavigationOption | EmailAddress            | Password    | Accounting Option | BankName | Account Name | Account number | Account type |
      | chrome  | Accounting       | hitesh.ghai@hotmail.com | Pyramid123! | Bank accounts     | ANZ      | Test         |           1122 | loan         |
