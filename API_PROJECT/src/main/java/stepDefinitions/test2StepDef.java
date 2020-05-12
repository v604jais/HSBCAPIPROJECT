package stepDefinitions;





import org.testng.Assert;

import cucumber.api.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ResponseBody;



public class test2StepDef {

	@Then("^An automated test suite should run which will assert the response Body$")
	public void an_automated_test_suite_should_run_which_will_assert_the_response_Body()  {
	  
	   
	   
	   ResponseBody<?> Body= testStepDef.res.getBody();
		
		System.out.println("**********ResponseBody**********");
		System.out.println(Body.asString());
		
		System.out.println("**********KEY:VALUE:VALIDATION**********");
		
		JsonPath jsonPathEvaluator = testStepDef.res.jsonPath();
		float actualRate = jsonPathEvaluator.get("rates.IDR");
		
		Assert.assertEquals(String.valueOf(actualRate), "16202.32");		
 }
	 	
	
}