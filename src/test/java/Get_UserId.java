import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

public class Get_UserId {
	
	@Test
	void userId () {
		
		
		Response response = get ("https://jsonplaceholder.typicode.com/users/4");
			String	userId = response.then().extract().path("email");
			
		
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		
		response = get ("https://jsonplaceholder.typicode.com/posts/1");
		
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(userId);
		

		
		
	}
	
	
public class Get_random_user{
	
	@Test
	void random_user( ) {
		JSONObject request = new JSONObject ();
		
		given() .
		body(request.toJSONString()).
	when().
		get("https://jsonplaceholder.typicode.com/users/4");

	
	
		
		

	}
}


public class Get_user_post{
	
	@Test
	void user_post( ) {
		JSONObject request = new JSONObject ();
		
		given() .
		body(request.toJSONString()).
	when().
		get("https://jsonplaceholder.typicode.com/posts/4");

	}
		
}	

}

