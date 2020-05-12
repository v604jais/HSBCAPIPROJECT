package stepDefinitions;

import java.io.IOException;


import org.testng.Assert;

import RestUtils.Assistant;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.response.Response;


public class test4StepDef {

	public static Response res;
	@Given("^Rates API for date Foreign Exchange rates$") 
	public void rates_api_for_date_foreign_exchange_rates() throws IOException {
		 
         res=Assistant.makeConnection(Assistant.readProperty("LENDPOINTURL"), Assistant.readProperty("RESOURCEID3"));
	}
	
	
	@Then("^Test case assert the correct response code (\\d+)$")
	public void test_case_assert_the_correct_response_code(int respCode)  {
		Assert.assertEquals(respCode,res.getStatusCode());
	}

}
