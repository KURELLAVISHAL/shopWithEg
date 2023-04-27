Feature: login feature

  @InvlidCredentials
  Scenario Outline: 
    Given user launches shopwitheg site
    When user clicks login button
    And user enters invalid "<username>" and "<password>"
    And user clicks on signin button in login page
    Then user will be displayed with error message for invalid credentials

    Examples: 
      | username       | password       |
      | test@test.com  | Testpassword   |
      | test1@test.com | lldsjlksfjdlsd |
      | test2@test.com | kajsdklfjalsdf |
      | test3@test.com | lsjdfljsadf    |
