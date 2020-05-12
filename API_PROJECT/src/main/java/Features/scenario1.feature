@pushkar1
Feature: Rate API Validation
         I want to get latest rate data

 @test1
 Scenario: Latest Rate API Status Code Verification
    Given Rates API for Latest Foreign Exchange rates
    When  API is available
    Then  An automated test suite should run which will assert the success status of the response 200
  