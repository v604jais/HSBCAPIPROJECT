package stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import RestUtils.Assistant;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class test6StepsDef {

	public static Response res;

	@Given("^Rates API for \"([^\"]*)\" Foreign Exchange rates$")
	public void rates_API_for_Foreign_Exchange_rates(String sdate) throws IOException {

		res = Assistant.makeConnection(Assistant.readProperty("LENDPOINTURL"), sdate);

	}

	@When("^A future date is provided in the url$")
	public void api_is_available() throws IOException {
		System.out.println("********Future Date is provided in url********");

	}

	@Then("^An automated test validate response matches for the current date$")
	public void an_automated_test_validate_response_matches__for_the_current_date() {

		ResponseBody<?> Body = testStepDef.res.getBody();

		System.out.println("**********ResponseBody**********");
		System.out.println(Body.asString());

		System.out.println("**********KEY:VALUE:VALIDATION**********");

		JsonPath jsonPathEvaluator = testStepDef.res.jsonPath();
		float actualRate = jsonPathEvaluator.get("rates.GBP");

		Assert.assertEquals(String.valueOf(actualRate), "0.87875");
	}

}
