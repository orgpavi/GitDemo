package class6;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class HamcrestKeyValidation1 {

	public static void main(String[] args) {
		Response res = RestAssured.get("https://reqres.in/api/users/2");
		JsonPath jpath = res.jsonPath();
		
		// need to switch to next
		

	}

}
