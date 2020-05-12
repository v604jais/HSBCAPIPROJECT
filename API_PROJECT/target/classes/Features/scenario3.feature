@pushkar3
Feature: Rate API Validation for incorrect url
         
@test3
 Scenario: Latest Rate Incorrect API Response Verification
    Given Rates API for Latest Foreign Exchange rates
    When  An incorrect or incomplete url is provided 
    Then  Test case should assert the correct response supplied by the call 400