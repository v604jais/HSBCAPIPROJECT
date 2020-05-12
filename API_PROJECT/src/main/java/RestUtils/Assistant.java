package RestUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class Assistant {

	
	public static Properties p;
	
	public static FileInputStream fi;
	
	// method for reading properties files
	@Test (priority=1)
	public static String readProperty (String key) throws IOException{
	
		p=new Properties();
		fi=new FileInputStream("D:\\assignment\\API_PROJECT\\src\\main\\java\\RestUtils\\config.properties");
	    p.load(fi);
	    
		return p.getProperty(key);
	}
	
	@Test(priority=2)
	public static Response makeConnection(String url, String Ri) {
		
		 RestAssured.baseURI =url;
		 RequestSpecification httpRequest = RestAssured.given();
		 Response response = httpRequest.get(Ri);
		 
		 return response;
		
	}
	
	
	
	
	
	
	
	
	     
	 

}	
	
	


