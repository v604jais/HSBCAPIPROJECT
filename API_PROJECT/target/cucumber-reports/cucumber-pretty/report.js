$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("scenario1.feature");
formatter.feature({
  "line": 2,
  "name": "Rate API Validation",
  "description": "       I want to get latest rate data",
  "id": "rate-api-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@pushkar1"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Latest Rate API Status Code Verification",
  "description": "",
  "id": "rate-api-validation;latest-rate-api-status-code-verification",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@test1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Rates API for Latest Foreign Exchange rates",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "API is available",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "An automated test suite should run which will assert the success status of the response 200",
  "keyword": "Then "
});
formatter.match({
  "location": "testStepDef.rates_API_for_Latest_Foreign_Exchange_rates()"
});
formatter.result({
  "duration": 122273855,
  "status": "passed"
});
formatter.match({
  "location": "testStepDef.api_is_available()"
});
formatter.result({
  "duration": 3010811675,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 88
    }
  ],
  "location": "testStepDef.an_automated_test_suite_should_run_which_will_assert_the_success_status_of_the_response(int)"
});
formatter.result({
  "duration": 3149795,
  "status": "passed"
});
formatter.uri("scenario2.feature");
formatter.feature({
  "line": 2,
  "name": "Rate API Response Validation",
  "description": "       I want to get latest rate data",
  "id": "rate-api-response-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@pushkar"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Latest Rate API Response Verifcation",
  "description": "",
  "id": "rate-api-response-validation;latest-rate-api-response-verifcation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@test2"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Rates API for Latest Foreign Exchange rates",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "API is available",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "An automated test suite should run which will assert the response Body",
  "keyword": "Then "
});
formatter.match({
  "location": "testStepDef.rates_API_for_Latest_Foreign_Exchange_rates()"
});
formatter.result({
  "duration": 114343,
  "status": "passed"
});
formatter.match({
  "location": "testStepDef.api_is_available()"
});
formatter.result({
  "duration": 476568600,
  "status": "passed"
});
formatter.match({
  "location": "test2StepDef.an_automated_test_suite_should_run_which_will_assert_the_response_Body()"
});
formatter.result({
  "duration": 574003205,
  "status": "passed"
});
formatter.uri("scenario3.feature");
formatter.feature({
  "line": 2,
  "name": "Rate API Validation for incorrect url",
  "description": "",
  "id": "rate-api-validation-for-incorrect-url",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@pushkar3"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Latest Rate Incorrect API Response Verification",
  "description": "",
  "id": "rate-api-validation-for-incorrect-url;latest-rate-incorrect-api-response-verification",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@test3"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Rates API for Latest Foreign Exchange rates",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "An incorrect or incomplete url is provided",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Test case should assert the correct response supplied by the call 400",
  "keyword": "Then "
});
formatter.match({
  "location": "testStepDef.rates_API_for_Latest_Foreign_Exchange_rates()"
});
formatter.result({
  "duration": 104070,
  "status": "passed"
});
formatter.match({
  "location": "test3StepDef.an_incorrect_or_incomplete_url_is_provided()"
});
formatter.result({
  "duration": 720722809,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "400",
      "offset": 66
    }
  ],
  "location": "test3StepDef.test_case_should_assert_the_correct_response_supplied_by_the_call(int)"
});
formatter.result({
  "duration": 310424,
  "status": "passed"
});
formatter.uri("scenario4.feature");
formatter.feature({
  "line": 2,
  "name": "Rate API Validation for Specific Date",
  "description": "",
  "id": "rate-api-validation-for-specific-date",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@pushkar4"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Rates API Specific Date Status Verification",
  "description": "",
  "id": "rate-api-validation-for-specific-date;rates-api-specific-date-status-verification",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@test4"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Rates API for date Foreign Exchange rates",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Test case assert the correct response code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "test4StepDef.rates_api_for_date_foreign_exchange_rates()"
});
formatter.result({
  "duration": 467459118,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 43
    }
  ],
  "location": "test4StepDef.test_case_assert_the_correct_response_code(int)"
});
formatter.result({
  "duration": 289431,
  "status": "passed"
});
formatter.uri("scenario5.feature");
formatter.feature({
  "line": 2,
  "name": "Rate API Response Validation for Specific Date",
  "description": "",
  "id": "rate-api-response-validation-for-specific-date",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@pushkar5"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Rates API Specific Date Response Verification",
  "description": "",
  "id": "rate-api-response-validation-for-specific-date;rates-api-specific-date-response-verification",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Rates API for date Foreign Exchange rates",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "An automated test suite should run which will assert the response",
  "keyword": "Then "
});
formatter.match({
  "location": "test4StepDef.rates_api_for_date_foreign_exchange_rates()"
});
formatter.result({
  "duration": 466405911,
  "status": "passed"
});
formatter.match({
  "location": "test5StepsDef.an_automated_test_suite_should_run_which_will_assert_response()"
});
formatter.result({
  "duration": 36551824,
  "status": "passed"
});
formatter.uri("scenario6.feature");
formatter.feature({
  "line": 2,
  "name": "Rate API Validation",
  "description": "       I want to get future rate data",
  "id": "rate-api-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@pushkar6"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Rates API future Date Verification",
  "description": "",
  "id": "rate-api-validation;rates-api-future-date-verification",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "Rates API for \u003c date \u003e Foreign Exchange rates",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "A future date is provided in the url",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "An automated test validate response matches for the current date",
  "rows": [
    {
      "cells": [
        "date"
      ],
      "line": 9
    },
    {
      "cells": [
        "2020-05-30"
      ],
      "line": 10
    }
  ],
  "keyword": "Then "
});
});