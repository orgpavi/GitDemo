package class2;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FirstAPITest {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		Response response = RestAssured.get("https://reqres.in/api/users/2");
		String responseVal= response.asString();
		System.out.println(responseVal);
		
	}

}
