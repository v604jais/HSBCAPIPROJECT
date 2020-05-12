package stepDefinitions;


import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import java.io.IOException;

import org.junit.Assert;

import RestUtils.Assistant;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class testStepDef {

	
	private static Response res;
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() throws Throwable {
		System.out.println("1: Hello QA");
	}

	@And("some other precondition")
	public void some_other_precondition() throws Throwable {
		System.out.println("2: How are you");
		System.out.println("2: \"Hello\"");		
		String s1="2: Hello:QA:Master";  
		System.out.println(s1.substring(s1.lastIndexOf(":")+1));  
	}
	
	@Given("API Weather are up and runnig")
	public void api_weather_are_up_and_runnig() {
	    
		System.out.println("******API Weather are up and runnig******");
	}

	@And("^A user perform get request with statuscode (\\d+)$")
	public void a_user_perform_get_request_with_statuscode(int respCode) throws IOException {
	   
		
		res=Assistant.makeConnection(Assistant.readProperty("ENDPOINTURL"), Assistant.readProperty("RESOURCEID"));
		Assert.assertEquals(respCode,res.getStatusCode());
		
	}

	

	@Then("Validate the response headers")
	public void validate_the_response_headers() {
	    
		// Storing all the headers response in reference allHeaders
		 Headers allHeader=res.headers();
		
		 //Validating few of the headers
		 String contentType = res.header("Content-Type");
		 Assert.assertEquals(contentType /* actual value */, "application/json" /* expected value */ );
		 
		 
		 String serverType = res.header("Server");
		 Assert.assertEquals(serverType,"nginx");
		 
		 String contentEncoding = res.header("Content-Encoding");
		 Assert.assertEquals(contentEncoding,"gzip");
		
		 //Printing all the headers key and value
		 for(Header header : allHeader)
		 {
		 System.out.println("Key: " + header.getName() + " Value: " + header.getValue());
		
		 }
	}

	@And("I should see the response and validate body")
	public void i_should_see_the_response_and_validate_body() throws IOException {
	   
		ResponseBody<?> Body=res.getBody();
		
		System.out.println("**********ResponseBody**********");
		System.out.println(Body.asString());
		
		System.out.println("**********KEY:VALUE:VALIDATION**********");
		
		JsonPath jsonPathEvaluator = res.jsonPath();
		String actualCity = jsonPathEvaluator.get("City");
		//
		Assert.assertEquals(actualCity,"Hyderabad");
		
		
	}

}
