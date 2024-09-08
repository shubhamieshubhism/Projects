package newPackage;

import org.testng.annotations.Test;

import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RestAssuredNewV1 {
	@Test
	public void getUsers() {
		String payload = "{\r\n"
				+ "    \"name\": \"gautam\",\r\n"
				+ "    \"job\": \"leader\",\r\n"
				+ "    \"id\": \"100\",\r\n"
				+ "    \"createdAt\": \"2024-03-12T09:38:35.457Z\"\r\n"
				+ "}";
		given().
			body(payload).contentType(ContentType.JSON).
		when().
			post("https://reqres.in/api/users").
		then().
			assertThat().
			body("name",equalTo("gautam")).
			statusCode(201).
			log().
			all();
;		
		
	}

}
