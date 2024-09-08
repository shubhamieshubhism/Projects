package newPackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RestAssuredPractice {
	@Test
	public static void openWheatherMap() {
	Response resp=RestAssured.get("https://reqres.in/api/users");
	String body = resp.getBody().asPrettyString();
	System.out.println(body);
	int code = resp.getStatusCode();
	System.out.println("The status code is "+code);
	Assert.assertEquals(code, 200);
	}

}
