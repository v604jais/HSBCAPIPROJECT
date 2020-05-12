@pushkar
Feature: Rate API Response Validation
         I want to get latest rate data

@test2
 Scenario: Latest Rate API Response Verifcation
    Given Rates API for Latest Foreign Exchange rates
    When  API is available
    Then  An automated test suite should run which will assert the response Body