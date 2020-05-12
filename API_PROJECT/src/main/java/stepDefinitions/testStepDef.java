package stepDefinitions;




import java.io.IOException;

import org.testng.Assert;

import RestUtils.Assistant;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;




public class testStepDef {
	
	public static Response res;

	@Given("^Rates API for Latest Foreign Exchange rates$")
	public void rates_API_for_Latest_Foreign_Exchange_rates()  {
		
		System.out.println("******LATEST RATE API IS GIVEN******");
		
	}

	@When("^API is available$")
	public void api_is_available() throws IOException  {
		res=Assistant.makeConnection(Assistant.readProperty("LENDPOINTURL"), Assistant.readProperty("RESOURCEID"));
		
	}

	@Then("^An automated test suite should run which will assert the success status of the response (\\d+)$")
	public void an_automated_test_suite_should_run_which_will_assert_the_success_status_of_the_response(int respCode)  {
	    
		Assert.assertEquals(respCode,res.getStatusCode());
	}
	
	
	
}
