@pushkar6
Feature: Rate API Validation
         I want to get future rate data

Scenario Outline: Rates API future Date Verification
    Given Rates API for < date > Foreign Exchange rates
    When  A future date is provided in the url
    Then  An automated test validate response matches for the current date
  |date      |
  |2020-05-30|