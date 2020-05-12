package stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import RestUtils.Assistant;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;

public class test3StepDef {

	public static Response res;

	@When("^An incorrect or incomplete url is provided$")
	public void an_incorrect_or_incomplete_url_is_provided() throws IOException  {
		res=Assistant.makeConnection(Assistant.readProperty("INCORRECTURL"), Assistant.readProperty("RESOURCEID2"));
	}

	@Then("^Test case should assert the correct response supplied by the call (\\d+)$")
	public void test_case_should_assert_the_correct_response_supplied_by_the_call(int respCode)  {
		Assert.assertEquals(respCode,res.getStatusCode());
	}

}
