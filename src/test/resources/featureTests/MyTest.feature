Feature: My feature tests are described here

@RunCommBank
  Scenario: CommBank Test
    Given I choose configurations from config file
    When I open Commbank Page
    And I navigate to the Travel money overseas section
    Then I verify whether the subtopic exists
    And I scroll down and click on NetBank login
    Then NetBank page should be opened up
    Then I close the browser
    