package stepDefinitions;

import org.testng.Assert;

import cucumber.api.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ResponseBody;

public class test5StepsDef {

	
	@Then("^An automated test suite should run which will assert the response$")
	public void an_automated_test_suite_should_run_which_will_assert_response()  {
	    
        ResponseBody<?> Body=test4StepDef.res.getBody();
		
		System.out.println("**********ResponseBody**********");
		System.out.println(Body.asString());
		
		System.out.println("**********KEY:VALUE:VALIDATION**********");
		
		JsonPath jsonPathEvaluator = test4StepDef.res.jsonPath();
		float actualRate = jsonPathEvaluator.get("rates.IDR");
		
		Assert.assertEquals(String.valueOf(actualRate),"13281.14");
	}
	
}
