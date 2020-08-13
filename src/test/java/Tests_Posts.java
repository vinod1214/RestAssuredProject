import org.apache.http.entity.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//
//import java.util.HashMap;
//import java.util.Map;


public class Tests_Posts {

	//@Test
	public void test_01_post() {	
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("name","vinod");
//		map.put("job","tester");
//		System.out.println(map);
//		GsonBuilder gsonMapBuilder = new GsonBuilder();
//		Gson gsonObject = gsonMapBuilder.create();
//		String JSONObject = gsonObject.toJson(map);
//		System.out.println(JSONObject);
		JSONObject request = new JSONObject();
		request.put("name", "vinod");
		request.put("job", "tester");
		System.out.println(request);
		System.out.println(request.toJSONString());
		given()
		    .header("Content-Type","application/json")
		    .contentType(io.restassured.http.ContentType.JSON)
		    .accept(io.restassured.http.ContentType.JSON)
			.body(request.toJSONString())
		.when()
			.post("https://reqres.in/api/users")
		.then()
			.statusCode(201);
	}
	
	//@Test
	public void test_02_put() {	
		JSONObject request = new JSONObject();
		request.put("name", "vinod");
		request.put("job", "tester");
		System.out.println(request);
		System.out.println(request.toJSONString());
		given()
		    .header("Content-Type","application/json")
		    .contentType(io.restassured.http.ContentType.JSON)
		    .accept(io.restassured.http.ContentType.JSON)
			.body(request.toJSONString())
		.when()
			.put("https://reqres.in/api/users")
		.then()
			.statusCode(200)
			.log()
			.all();
	}
	
	//@Test
	public void test_03_patch() {	
		JSONObject request = new JSONObject();
		request.put("name", "vinod");
		request.put("job", "tester");
		System.out.println(request);
		System.out.println(request.toJSONString());
		given()
		    .header("Content-Type","application/json")
		    .contentType(io.restassured.http.ContentType.JSON)
		    .accept(io.restassured.http.ContentType.JSON)
			.body(request.toJSONString())
		.when()
			.patch("https://reqres.in/api/users")
		.then()
			.statusCode(200)
			.log()
			.all();
	}
	
	@Test
	public void test_03_delete() {	
		
		when()
			.delete("https://reqres.in/api/users/2")
		.then()
			.statusCode(204)
			.log()
			.all();
	}
	
}
