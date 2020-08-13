import static io.restassured.RestAssured.*;

import org.apache.http.entity.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
public class Examples {

	@Test
	public void test_get() {
		baseURI = "http://localhost:3000/";
		given()
			.formParam("id", 2)
			.get("/subjects")
		.then()
			.statusCode(200)
			.log()
			.all();
	}
	
	//@Test
	public void test_post() {
		JSONObject request = new JSONObject();
		request.put("firstname", "deepthi");
		request.put("lastname", "gopal");
		request.put("subjectId", 3);
		
		baseURI = "http://localhost:3000/";
		given()
			.contentType(io.restassured.http.ContentType.JSON)
			.accept(io.restassured.http.ContentType.JSON)
			.header("Content-Type","application/json")
			.body(request.toJSONString())
		.when()
			.post("/users")
		.then()
			.statusCode(201)
		.log()
		.all();
	}
	
	//@Test
	public void test_patch() {
		JSONObject request = new JSONObject();
		
		request.put("subjectId", 2);
		
		baseURI = "http://localhost:3000/";
		given()
			.contentType(io.restassured.http.ContentType.JSON)
			.accept(io.restassured.http.ContentType.JSON)
			.header("Content-Type","application/json")
			.body(request.toJSONString())
		.when()
			.patch("/users/5")
		.then()
			.statusCode(200)
		.log()
		.all();
	}
	
	//@Test
	public void test_put() {
		JSONObject request = new JSONObject();
		
		request.put("firstname", "munirathanam");
		request.put("lastname", "singiri");
		request.put("subjectId", 3);
		
		baseURI = "http://localhost:3000/";
		given()
			.contentType(io.restassured.http.ContentType.JSON)
			.accept(io.restassured.http.ContentType.JSON)
			.header("Content-Type","application/json")
			.body(request.toJSONString())
		.when()
			.put("/users/5")
		.then()
			.statusCode(200)
		.log()
		.all();
	}
	
	//@Test
	public void test_delete() {
		baseURI = "http://localhost:3000/";
		when()
			.delete("/users/5")
		.then()
			.statusCode(200);
			
	}
}
