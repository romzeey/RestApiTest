
import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import static org.hamcrest.Matcher.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;





@Test
public class Post_Test {
	
	@Test
	public void test_1_post() {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("name","Naila");
		map.put("email", "naila@mailpoof.com");
		map.put("userid", 4);
		
		System.out.println(map);
		
		JSONObject request = new JSONObject (map);
		
		System.out.println(request);
		
		given() .
			body(request.toJSONString()).
		when().
			post("https://jsonplaceholder.typicode.com/users").
		then().
			statusCode(201);
	
	
		
		
		
		
	}


}
 