package class4;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetResponseBodyValueWithRequest5 {

	public static void main(String[] args) {
		
		Response res = RestAssured.get("https://reqres.in/api/users/2");
		res.prettyPrint();
		JsonPath jpath = res.jsonPath();
		String email = jpath.get("data.email");
		System.out.println(email);
		

	}

}
