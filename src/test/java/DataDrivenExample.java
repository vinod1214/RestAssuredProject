import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class DataDrivenExample extends DataForTests {

	
	    //@Test(dataProvider = "DataForPost")
		public void test_post(String firstname, String lastName, int subjectId) {
			JSONObject request = new JSONObject();
			request.put("firstname", firstname);
			request.put("lastname", lastName);
			request.put("subjectId", subjectId);
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
		
		@Test(dataProvider = "DataToDelete")
		public void test_delete(int userId) {
			baseURI = "http://localhost:3000/";
			when()
				.delete("/users/"+userId)
			.then()
				.statusCode(200);
				
		}
}
